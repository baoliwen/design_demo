package com.dosimple.designdemo.factory.simplefactory;

/**
 * @author baolw
 */
class YellowHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黄色");
    }

    @Override
    public void talk() {
        System.out.println("双字节");
    }
}
