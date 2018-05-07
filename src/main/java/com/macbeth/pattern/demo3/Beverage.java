package com.macbeth.pattern.demo3;

/***
 * @author : macbeth
 * @date   : 2018/5/7 22:59
 * @mail   : madmacbeth@163.com
 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription(){
        return this.description;
    }
    public abstract double cost();
}
