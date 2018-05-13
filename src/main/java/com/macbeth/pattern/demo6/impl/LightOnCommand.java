package com.macbeth.pattern.demo6.impl;

import com.macbeth.pattern.demo6.Command;
import com.macbeth.pattern.demo6.Light;

/***
 * @author : macbeth
 * @date   : 2018/5/12 19:41
 * @mail   : madmacbeth@163.com
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }
}


















