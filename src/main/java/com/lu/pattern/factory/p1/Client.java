package com.lu.pattern.factory.p1;

import com.lu.pattern.Common.Domain.User;

/**
 * @Description:
 * @Author: lulongji
 */
public class Client {

    public static void main(String[] args) {
        User user = new User();
        MysqlUser mysqlUser = new MysqlUser();
        mysqlUser.insert(user);
        mysqlUser.getUser(1);
    }
}
