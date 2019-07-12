package com.dosimple.designdemo.factory.three;

/**
 * @author baolw
 */
class YellowHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
