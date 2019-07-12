package com.dosimple.designdemo.abstractfactory.first;

/**
 * @author baolw
 */
abstract class AbstractYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色");
    }

    @Override
    public void talk() {
        System.out.println("双字节");
    }
}
