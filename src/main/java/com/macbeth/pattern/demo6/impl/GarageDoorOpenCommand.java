package com.macbeth.pattern.demo6.impl;

import com.macbeth.pattern.demo6.Command;

/***
 * @author : macbeth
 * @date   : 2018/5/12 20:09
 * @mail   : madmacbeth@163.com
 */
public class GarageDoorOpenCommand implements Command {
    public void up(){
        System.out.println("Garage Door is Open");
    }
    public void down(){}
    public void stop(){}
    public void lightOn(){}
    public void lightOff(){}
    @Override
    public void execute() {

    }
}



















