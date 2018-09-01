package com.lu.pattern.singleton;

/**
 * @Description:饿汉式
 * @Author: lulongji
 */
public class Singleton_ehs {


    /**
     * 单例模式
     */
    static class Singleton {

        static final Singleton singleton = new Singleton();

        Singleton() {
            System.out.println("==饿汉式==");
        }

        static Singleton getInstance() {

            return singleton;
        }
    }


    /**
     * test
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Singleton_ehs.Singleton.getInstance());
    }


}
