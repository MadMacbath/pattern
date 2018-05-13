package com.macbeth.pattern.demo6.impl;

import com.macbeth.pattern.demo6.Command;

/***
 * @author : macbeth
 * @date   : 2018/5/12 22:17
 * @mail   : madmacbeth@163.com
 */
public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.on();
        this.stereo.setCD();
        this.stereo.setVolume(11);
    }
}


























