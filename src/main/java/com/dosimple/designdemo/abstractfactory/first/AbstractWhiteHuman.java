package com.dosimple.designdemo.abstractfactory.first;

abstract class AbstractWhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色");
    }

    @Override
    public void talk() {
        System.out.println("单字节");
    }
}
