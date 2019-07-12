package com.dosimple.designdemo.abstractfactory.first;

/**
 * @author baolw
 */
class FemaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("白人女性");
    }
}
