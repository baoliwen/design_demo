package com.dosimple.designdemo.bridge.two;

/**
 * @author baolw
 */
class IPod extends Product{
    @Override
    protected void beProducted() {
        System.out.println("生产出的IPOD");
    }

    @Override
    void beSelled() {
        System.out.println("卖出IPOD");
    }
}
