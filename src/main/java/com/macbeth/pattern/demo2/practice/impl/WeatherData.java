package com.macbeth.pattern.demo2.practice.impl;

import com.macbeth.pattern.demo2.practice.Observer;
import com.macbeth.pattern.demo2.practice.Subject;

import java.util.ArrayList;
import java.util.List;

/***
 * @author : macbeth
 * @date   : 2018/5/5 21:37
 * @mail   : madmacbeth@163.com
 */
public class WeatherData implements Subject {
    private int data;
    private List<Observer> list = new ArrayList<Observer>();
    public WeatherData(int data){
        this.data = data;
    }
    @Override
    public void register(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        int index = list.indexOf(observer);
        if (index >= 0){
            list.remove(observer);
        }
    }

    @Override
    public void notification() {
        for (Observer observer : list){
            observer.update(this.getData());
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
        this.notification();
    }
}
