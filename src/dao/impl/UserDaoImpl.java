package dao.impl;

import bean.User;
import dao.UserDao;
import util.DBUtil;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Jasmine-drs
 * @date 2023/5/14 10:25
 */


public class UserDaoImpl implements UserDao {
    @Override
    public User isExist(String username, String password, String identity) {
        System.out.println("UserDaoImpl.isExist");
        String sql = "select *from user where account=? and password=? and identity=?";
        System.out.println("sql = " + sql);
        List<Map<String, Object>> query = DBUtil.query(sql, username, password, Integer.parseInt(identity));
//        封装对象
        User user = new User();
        if (query != null) {
            query.forEach(temp -> {
                user.setId((Integer) temp.get("id"));
                user.setName((String) temp.get("name"));
                user.setAccount((String) temp.get("account"));
                user.setPassword((String) temp.get("password"));
                user.setState((Integer) temp.get("state"));
                user.setIdentity((Integer) temp.get("identity"));
                user.setCreateTime((Date) temp.get("createTime"));
                user.setUpdateTime((Date) temp.get("updateTime"));
            });
        }
        return user;
    }
}
