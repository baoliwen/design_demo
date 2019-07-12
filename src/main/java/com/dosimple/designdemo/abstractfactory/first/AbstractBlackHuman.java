package com.dosimple.designdemo.abstractfactory.first;

/**
 * @author baolw
 */
abstract class AbstractBlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色人种");
    }

    @Override
    public void talk() {
        System.out.println("说黑色人种的话");
    }
}
