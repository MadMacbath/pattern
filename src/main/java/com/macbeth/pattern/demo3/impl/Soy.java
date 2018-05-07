package com.macbeth.pattern.demo3.impl;

import com.macbeth.pattern.demo3.Beverage;
import com.macbeth.pattern.demo3.CondimentDecorator;

/***
 * @author : macbeth
 * @date   : 2018/5/7 23:19
 * @mail   : madmacbeth@163.com
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.5 + this.beverage.cost();
    }
}



















