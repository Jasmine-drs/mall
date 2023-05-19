package dao;

import bean.User;

/**
 * @author Jasmine-drs
 * @date 2023/5/14 10:24
 */


public interface UserDao {

    /**
     * 查询用户是否存在
     *
     * @param username 用户名
     * @param password 密码
     * @return 用户对象
     */
    User isExist(String username, String password);
}
