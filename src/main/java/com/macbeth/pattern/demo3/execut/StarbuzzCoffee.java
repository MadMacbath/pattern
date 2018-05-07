package com.macbeth.pattern.demo3.execut;

import com.macbeth.pattern.demo3.Beverage;
import com.macbeth.pattern.demo3.impl.*;

import java.io.*;

/***
 * @author : macbeth
 * @date   : 2018/5/7 23:24
 * @mail   : madmacbeth@163.com
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        Beverage beverage1 = new HouseBlend();
        beverage1 = new Soy(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        try(LineNumberReader reader = new LineNumberReader(new BufferedReader(new FileReader("E:\\计算机软件学习资源\\spring-mvc.txt")))){
            String line = "";
            while ((line = reader.readLine()) != null){
                System.out.println(line);
                System.out.println(reader.getLineNumber());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





























