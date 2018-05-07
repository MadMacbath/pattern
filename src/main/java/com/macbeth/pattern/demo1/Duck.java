package com.macbeth.pattern.demo1;

/***
 * @author : macbeth
 * @date   : 2018/5/5 0:04
 * @mail   : madmacbeth@163.com
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public abstract void display();

    public void performFlyBehavior(){
        this.getFlyBehavior().fly();
    }

    public void performQuackBehavior(){
        this.getQuackBehavior().quack();
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
