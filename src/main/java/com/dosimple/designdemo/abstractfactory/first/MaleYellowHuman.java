package com.dosimple.designdemo.abstractfactory.first;

/**
 * @author baolw
 */
class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄人男性");
    }
}
