package com.macbeth.pattern.demo6;

/***
 * @author : macbeth
 * @date   : 2018/5/12 21:26
 * @mail   : madmacbeth@163.com
 */
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl(){
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++){
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }
    public void onButtonWasPushed(int slot){
        this.onCommands[slot].execute();
    }
    public void offButtonWasPushed(int slot){
        this.offCommands[slot].execute();
    }

    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------remote control ---------\n");
        for (int i = 0; i < onCommands.length; i++){
            stringBuffer.append("[slot " + i + "] " + this.onCommands[i].getClass().getName() + "  " + this.offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}














