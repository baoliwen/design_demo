package com.dosimple.designdemo.abstractfactory.first;

/**
 * @author baolw
 */
class FemaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("黑人女性");
    }
}
