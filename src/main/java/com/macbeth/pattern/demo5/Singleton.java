package com.macbeth.pattern.demo5;

/***
 * @author : macbeth
 * @date   : 2018/5/11 0:03
 * @mail   : madmacbeth@163.com
 *
 * 双重检查加锁
 */
public class Singleton {
    // volatile 确保uniqueInstance初始化成Singleton实例时，多个线程正确的处理uniqueInstance变量
    private volatile static Singleton uniqueInstance;
    private Singleton(){}
    public static Singleton getInstance(){
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                // 获得锁之后再检查一次uniqueInstance
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
