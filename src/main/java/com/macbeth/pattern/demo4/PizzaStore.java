package com.macbeth.pattern.demo4;

/***
 * @author : macbeth
 * @date   : 2018/5/10 21:03
 * @mail   : madmacbeth@163.com
 */
public abstract class PizzaStore {

    public Pizza OrderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}































