package com.macbeth.pattern.demo3.impl;

import com.macbeth.pattern.demo3.Beverage;
import com.macbeth.pattern.demo3.CondimentDecorator;

/***
 * @author : macbeth
 * @date   : 2018/5/7 23:12
 * @mail   : madmacbeth@163.com
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}






















