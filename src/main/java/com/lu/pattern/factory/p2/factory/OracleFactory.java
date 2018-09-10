package com.lu.pattern.factory.p2.factory;

import com.lu.pattern.factory.p2.UserService;
import com.lu.pattern.factory.p2.impl.OracleServiceImpl;

/**
 * @Description:
 * @Author: lulongji
 */
public class OracleFactory implements IFactory {

    @Override
    public UserService createUser() {
        return new OracleServiceImpl();
    }
}