package com.macbeth.pattern.demo6.impl;

import com.macbeth.pattern.demo6.Command;
import com.macbeth.pattern.demo6.Light;

/***
 * @author : macbeth
 * @date   : 2018/5/12 22:15
 * @mail   : madmacbeth@163.com
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}























