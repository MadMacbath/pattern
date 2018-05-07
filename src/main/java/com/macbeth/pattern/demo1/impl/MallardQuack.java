package com.macbeth.pattern.demo1.impl;

import com.macbeth.pattern.demo1.QuackBehavior;

/***
 * @author : macbeth
 * @date   : 2018/5/5 0:13
 * @mail   : madmacbeth@163.com
 */
public class MallardQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("mallard quack");
    }
}
