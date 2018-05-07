package com.macbeth.pattern.demo2.impl;

/***
 * @author : macbeth
 * @date   : 2018/5/5 21:16
 * @mail   : madmacbeth@163.com
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
    }
}




























