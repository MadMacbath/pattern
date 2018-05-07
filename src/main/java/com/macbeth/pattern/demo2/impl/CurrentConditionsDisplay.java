package com.macbeth.pattern.demo2.impl;

import com.macbeth.pattern.demo2.DisplayElement;
import com.macbeth.pattern.demo2.Observer;
import com.macbeth.pattern.demo2.Subject;

/***
 * @author : macbeth
 * @date   : 2018/5/5 21:05
 * @mail   : madmacbeth@163.com
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("current conditions: " + this.temperature + "F degrees and " + this.humidity + "% humidity " + this.pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}

















