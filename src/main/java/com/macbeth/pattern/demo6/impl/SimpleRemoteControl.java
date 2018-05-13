package com.macbeth.pattern.demo6.impl;

import com.macbeth.pattern.demo6.Command;

/***
 * @author : macbeth
 * @date   : 2018/5/12 19:58
 * @mail   : madmacbeth@163.com
 */
public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed(){
        this.slot.execute();
    }
}

























