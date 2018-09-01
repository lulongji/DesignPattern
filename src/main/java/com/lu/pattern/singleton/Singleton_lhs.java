package com.lu.pattern.singleton;

/**
 * @Description: 懒汉式
 * @Author: lulongji
 */
public class Singleton_lhs {

    static class Singleton {

        //在自己的内部定义一个自己的实例，只供内部调用
        private static Singleton instance = null;

        //构造方法
        public Singleton() {
            System.out.println("==懒汉式==");
        }

        //提供一个供外部访问的静态方法，可以直接访问
        static Singleton getInstance() {
            if (null == instance) {
                instance = new Singleton();
            }

            return instance;
        }

    }


    /**
     * test
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Singleton_lhs.Singleton.getInstance());
    }
}
