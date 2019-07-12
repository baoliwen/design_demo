package com.dosimple.designdemo.abstractfactory.first;

/**
 * @author baolw
 */
class MaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("白人男性");
    }
}
