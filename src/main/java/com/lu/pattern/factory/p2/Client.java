package com.lu.pattern.factory.p2;

import com.lu.pattern.Common.Domain.User;
import com.lu.pattern.factory.p2.factory.IFactory;
import com.lu.pattern.factory.p2.factory.MysqlFactory;

/**
 * @Description:
 * @Author: lulongji
 */
public class Client {

    public static void main(String[] args) {
        User user = new User();

        IFactory factory = new MysqlFactory();
        UserService userService = factory.createUser();

        userService.getUser(1);
        userService.insert(user);
    }
}
