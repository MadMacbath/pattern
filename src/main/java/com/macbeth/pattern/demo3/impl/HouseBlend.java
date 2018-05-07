package com.macbeth.pattern.demo3.impl;

import com.macbeth.pattern.demo3.Beverage;

/***
 * @author : macbeth
 * @date   : 2018/5/7 23:09
 * @mail   : madmacbeth@163.com
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        this.description = "House Blend Coffe";
    }
    @Override
    public double cost() {
        return 0.89;
    }
}
