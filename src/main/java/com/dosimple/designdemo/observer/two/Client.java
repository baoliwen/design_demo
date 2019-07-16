package com.dosimple.designdemo.observer.two;

/**
 * @author baolw
 */
class Client {
    public static void main(String[] args) {
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(new LiSi());
        hanFeiZi.addObserver(new ZhangSan());
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
