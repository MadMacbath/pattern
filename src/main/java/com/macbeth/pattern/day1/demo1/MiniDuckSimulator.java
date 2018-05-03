package com.macbeth.pattern.day1.demo1;

import com.macbeth.pattern.day1.demo1.impl.MallardDuck;

/***
 * @author : macbeth
 * @date   : 2018/5/3 23:44
 * @mail   : madmacbeth@163.com
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}
