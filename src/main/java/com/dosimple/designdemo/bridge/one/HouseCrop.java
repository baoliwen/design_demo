package com.dosimple.designdemo.bridge.one;

class HouseCrop extends Crop {
    @Override
    protected void produce() {
        System.out.println("房地产公司盖房子");
    }

    @Override
    protected void sell() {
        System.out.println("房地产公司卖房子");
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("赚钱了");
    }
}
