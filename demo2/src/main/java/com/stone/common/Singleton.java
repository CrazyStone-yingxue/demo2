package com.stone.common;

public class Singleton {
    private static Singleton singleton = null;
    private Singleton () {}
    public static Singleton getInstance() {
        /*if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;   //属于懒汉式*/

        singleton = new Singleton();
        return singleton;    //属于饿汉式
    }
}
