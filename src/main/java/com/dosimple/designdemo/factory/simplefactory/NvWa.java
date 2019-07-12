package com.dosimple.designdemo.factory.simplefactory;

class NvWa {
    public static void main(String[] args) {
        HumanFactory factory = new HumanFactory();

        Human white = factory.createHuman(WhiteHuman.class);
        white.getColor();
        white.talk();

        Human black = factory.createHuman(BlackHuman.class);
        black.getColor();
        black.talk();

        Human yellow = factory.createHuman(YellowHuman.class);
        yellow.getColor();
        yellow.talk();

    }
}
