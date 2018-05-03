package com.macbeth.pattern.day1.demo1;

import com.macbeth.pattern.day1.demo1.impl.*;
import com.macbeth.pattern.day1.demo1.practice.DuckCall;
import com.macbeth.pattern.day1.demo1.practice.impl.PreciseDuckCall;

/***
 * @author : macbeth
 * @date   : 2018/5/3 23:44
 * @mail   : madmacbeth@163.com
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        DuckCall duckCall = new PreciseDuckCall();
        duckCall.setQuackBehavior(new Quack());
        duckCall.performQuack();
    }
}
