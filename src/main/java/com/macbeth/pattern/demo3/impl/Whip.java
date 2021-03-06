package com.macbeth.pattern.demo3.impl;

import com.macbeth.pattern.demo3.Beverage;
import com.macbeth.pattern.demo3.CondimentDecorator;

/***
 * @author : macbeth
 * @date   : 2018/5/7 23:20
 * @mail   : madmacbeth@163.com
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.7 + this.beverage.cost();
    }
}






















