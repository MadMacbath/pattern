package com.macbeth.pattern.demo2.practice.impl;

import com.macbeth.pattern.demo2.practice.Observer;

/***
 * @author : macbeth
 * @date   : 2018/5/5 21:43
 * @mail   : madmacbeth@163.com
 */
public class MyObserver implements Observer {

    @Override
    public void update(int data) {
        System.out.println(data);
    }
}
