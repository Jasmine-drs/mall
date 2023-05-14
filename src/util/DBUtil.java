package util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBUtil {
    private static HikariConfig config = new HikariConfig();
    private static HikariDataSource ds;

    static {
        config.setJdbcUrl("jdbc:mysql://1.12.249.127:3306/javaee_mall");
        config.setUsername("drs");
        config.setPassword("123456");
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

        ds = new HikariDataSource(config);
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    /**
     * 查询方法
     *
     * @param sql  sql语句
     * @param args sql语句中的参数（可变长度）
     * @return 查询结果
     */
    public static List<Map<String, Object>> query(String sql, Object... args) {
        Connection conn = null;
        try {
            conn = getConnection();
            return query(conn, sql, args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(conn, null, null);
        }
        return null;
    }

    /**
     * 增删改方法
     *
     * @param sql  sql语句
     * @param args sql语句中的参数（可变长度）
     * @return 受影响的行数
     */
    public static int update(String sql, Object... args) {
        Connection connection = null;
        try {
            connection = getConnection();
            return update(connection, sql, args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(connection, null, null);
        }
        return 0;
    }


    private static List<Map<String, Object>> query(Connection conn, String sql, Object... args) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }

            rs = ps.executeQuery();
            List<Map<String, Object>> list = new ArrayList<>();
            while (rs.next()) {
                Map<String, Object> row = new HashMap<>();
                ResultSetMetaData rsmd = rs.getMetaData();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    row.put(rsmd.getColumnName(i), rs.getObject(i));
                }
                list.add(row);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(null, ps, rs);
        }
        return null;
    }


    private static int update(Connection conn, String sql, Object... args) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeAll(null, ps, null);
        }
        return 0;
    }

    public static void closeAll(Connection conn, Statement stmt, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}