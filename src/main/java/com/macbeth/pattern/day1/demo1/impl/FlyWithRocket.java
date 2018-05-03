package com.macbeth.pattern.day1.demo1.impl;

import com.macbeth.pattern.day1.demo1.FlyBehavior;

/***
 * @author : macbeth
 * @date   : 2018/5/4 0:07
 * @mail   : madmacbeth@163.com
 */
public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
