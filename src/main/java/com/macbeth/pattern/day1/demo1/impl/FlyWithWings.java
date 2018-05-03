package com.macbeth.pattern.day1.demo1.impl;

import com.macbeth.pattern.day1.demo1.FlyBehavior;

/***
 * @author : macbeth
 * @date   : 2018/5/3 23:40
 * @mail   : madmacbeth@163.com
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
