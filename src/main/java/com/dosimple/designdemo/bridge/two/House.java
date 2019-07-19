package com.dosimple.designdemo.bridge.two;

class House extends Product {
    @Override
    protected void beProducted() {
        System.out.println("造房子");
    }

    @Override
    void beSelled() {
        System.out.println("买房子");
    }
}
