package com.macbeth.pattern.day1.demo1;

/***
 * @author : macbeth
 * @date   : 2018/5/3 23:32
 * @mail   : madmacbeth@163.com
 */
public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("all duck float, even decoys!");
    }
}
