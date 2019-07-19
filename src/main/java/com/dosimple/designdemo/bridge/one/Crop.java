package com.dosimple.designdemo.bridge.one;

abstract class Crop {
    protected abstract void produce();

    protected abstract void sell();

    public void makeMoney() {
        this.produce();
        this.sell();
    }
}
