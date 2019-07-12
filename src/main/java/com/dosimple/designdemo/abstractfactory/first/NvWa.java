package com.dosimple.designdemo.abstractfactory.first;

/**
 * @author baolw
 */
class NvWa {
    public static void main(String[] args) {
        HumanFactory female = new FemaleFactory();
        HumanFactory male = new MaleFactory();

        Human maleHuman = male.createBlackHuman();
        Human femaleHuman = female.createBlackHuman();

        maleHuman.getColor();
        maleHuman.talk();
        maleHuman.getSex();

        femaleHuman.getColor();
        femaleHuman.talk();
        femaleHuman.getSex();
    }
}
