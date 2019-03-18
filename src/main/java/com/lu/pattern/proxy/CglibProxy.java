package com.lu.pattern.proxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * Created by lu on 2019/3/18.
 */
public class CglibProxy implements MethodInterceptor {


    private Object target;

    public Object getInstance(final Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("买之前！------------攒钱");
        Object result = methodProxy.invoke(o, objects);
        System.out.println("买之后！------------还贷");
        return result;
    }
}
