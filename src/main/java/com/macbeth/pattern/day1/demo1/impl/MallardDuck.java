package com.macbeth.pattern.day1.demo1.impl;

import com.macbeth.pattern.day1.demo1.Duck;

/***
 * @author : macbeth
 * @date   : 2018/5/3 23:46
 * @mail   : madmacbeth@163.com
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
