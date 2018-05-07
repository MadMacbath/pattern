package com.macbeth.pattern.demo2;

/***
 * @author : macbeth
 * @date   : 2018/5/5 0:16
 * @mail   : madmacbeth@163.com
 * 主题
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
























