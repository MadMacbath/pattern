package com.macbeth.pattern.demo1;

import com.macbeth.pattern.demo1.impl.FlyWithWing;
import com.macbeth.pattern.demo1.impl.Mallard;
import com.macbeth.pattern.demo1.impl.MallardQuack;

/***
 * @author : macbeth
 * @date   : 2018/5/5 0:08
 * @mail   : madmacbeth@163.com
 */
public class MiniSimulator {

    public static void main(String[] args) {
        Duck duck = new Mallard();
        duck.setFlyBehavior(new FlyWithWing());
        duck.setQuackBehavior(new MallardQuack());
        duck.display();
        duck.performFlyBehavior();
        duck.performQuackBehavior();
    }
}
