package com.dosimple.designdemo.abstractfactory.first;

/**
 * @author baolw
 */
class MaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("黑人男性");
    }
}
