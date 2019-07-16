package com.dosimple.designdemo.observer.one;

/**
 * @author baolw
 */
class Client {
    public static void main(String[] args) {
        IHanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
