package com.macbeth.pattern.day1.demo1.impl;

import com.macbeth.pattern.day1.demo1.QuackBehavior;

/***
 * @author : macbeth
 * @date   : 2018/5/3 23:42
 * @mail   : madmacbeth@163.com
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
