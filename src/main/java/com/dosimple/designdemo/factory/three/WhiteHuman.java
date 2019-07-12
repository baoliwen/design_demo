package com.dosimple.designdemo.factory.three;

/**
 * @author baolw
 */
class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色");
    }

    @Override
    public void talk() {
        System.out.println("单字节");
    }
}
