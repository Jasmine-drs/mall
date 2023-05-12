package test;

import util.DBUtil;

import java.util.List;
import java.util.Map;

/**
 * 测试数据库连接
 *
 * @author Jasmine-drs
 * @date 2023/5/12 10:11
 */


public class DBUtilTests {
    public static void main(String[] args) {
        String sql = "select *from user";
        List<Map<String, Object>> query = DBUtil.query(sql);
//        System.out.println("query = " + query);
        if (query != null) {
            query.forEach(System.out::println);
        } else
            System.out.println("is null");
    }
}
