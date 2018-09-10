package com.lu.pattern.factory.p2.factory;

import com.lu.pattern.factory.p2.UserService;

/**
 * @Description:
 * @Author: lulongji
 */
public interface IFactory {

    UserService createUser();
}