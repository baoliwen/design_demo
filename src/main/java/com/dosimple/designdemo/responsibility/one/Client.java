package com.dosimple.designdemo.responsibility.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author baolw
 */
public class Client {
    public static void main(String[] args) {
        Random random = new Random();

        List<IWomen> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new Women(random.nextInt(4), "要出去逛街"));
        }
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        father.setNextHandler(husband);
        husband.setNextHandler(son);
        for (IWomen iWomen : list) {
            father.handleMessage(iWomen);
        }
    }
}
