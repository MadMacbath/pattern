package com.macbeth.pattern.demo2.practice;

/***
 * @author : macbeth
 * @date   : 2018/5/5 21:34
 * @mail   : madmacbeth@163.com
 */
public interface Subject {
    public void register(Observer observer);
    public void remove(Observer observer);
    public void notification();
}
