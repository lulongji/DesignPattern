package com.lu.pattern.factory.p2.factory;

import com.lu.pattern.factory.p2.UserService;
import com.lu.pattern.factory.p2.impl.MysqlServiceImpl;

/**
 * @Description:
 * @Author: lulongji
 */
public class MysqlFactory implements IFactory {


    @Override
    public UserService createUser() {
        return new MysqlServiceImpl();
    }
}
