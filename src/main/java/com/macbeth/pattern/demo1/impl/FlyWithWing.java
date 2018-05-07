package com.macbeth.pattern.demo1.impl;

import com.macbeth.pattern.demo1.FlyBehavior;

/***
 * @author : macbeth
 * @date   : 2018/5/5 0:12
 * @mail   : madmacbeth@163.com
 */
public class FlyWithWing implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings");
    }
}
