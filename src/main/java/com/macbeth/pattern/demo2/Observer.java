package com.macbeth.pattern.demo2;

/***
 * @author : macbeth
 * @date   : 2018/5/5 0:17
 * @mail   : madmacbeth@163.com
 * 观察者
 */
public interface Observer {
    public void update(float temp,float humidity,float pressure);
}
