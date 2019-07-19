package com.dosimple.designdemo.observer.one;
class Client {
    public static void main(String[] args) {
        IHanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
