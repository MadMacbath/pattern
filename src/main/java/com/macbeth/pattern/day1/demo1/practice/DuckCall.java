package com.macbeth.pattern.day1.demo1.practice;

import com.macbeth.pattern.day1.demo1.QuackBehavior;

/***
 * @author : macbeth
 * @date   : 2018/5/4 0:24
 * @mail   : madmacbeth@163.com
 */
public abstract class DuckCall {

    private QuackBehavior quackBehavior;

    public void performQuack(){
        this.quackBehavior.quack();
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
