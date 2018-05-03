package com.macbeth.pattern.day1.demo1.impl;

import com.macbeth.pattern.day1.demo1.QuackBehavior;

/***
 * @author : macbeth
 * @date   : 2018/5/3 23:43
 * @mail   : madmacbeth@163.com
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
