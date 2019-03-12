package com.lu.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by lu on 2019/3/12.
 */
public class DynamicProxyHandler implements InvocationHandler {


    private Object object;


    public DynamicProxyHandler(final Object object) {

        this.object = object;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("买之前！---》");

        Object result = method.invoke(object, args);

        System.out.println("买之后！---》");

        return result;
    }
}
