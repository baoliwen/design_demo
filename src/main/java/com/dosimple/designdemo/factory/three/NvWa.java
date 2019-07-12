package com.dosimple.designdemo.factory.three;

/**
 * @author baolw
 */
class NvWa {
    public static void main(String[] args) {
        Human white = new WhiteHumanFactory().createHuman();
        white.getColor();
        white.talk();

        Human black = new BlackHumanFactory().createHuman();
        black.getColor();
        black.talk();

        Human yellow = new YellowHumanFactory().createHuman();
        yellow.getColor();
        yellow.talk();

    }
}
