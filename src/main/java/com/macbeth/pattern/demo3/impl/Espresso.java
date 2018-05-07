package com.macbeth.pattern.demo3.impl;

import com.macbeth.pattern.demo3.Beverage;

/***
 * @author : macbeth
 * @date   : 2018/5/7 23:07
 * @mail   : madmacbeth@163.com
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
