package com.dosimple.designdemo.factory.three;

/**
 * @author baolw
 */
class WhiteHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
