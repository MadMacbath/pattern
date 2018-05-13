package com.macbeth.pattern.demo6;

import com.macbeth.pattern.demo6.impl.LightOnCommand;
import com.macbeth.pattern.demo6.impl.SimpleRemoteControl;

/***
 * @author : macbeth
 * @date   : 2018/5/12 20:03
 * @mail   : madmacbeth@163.com
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        Light light = new Light();
        Command command = new LightOnCommand(light);
        SimpleRemoteControl remote = new SimpleRemoteControl(command);
        remote.buttonWasPressed();

    }
}


























