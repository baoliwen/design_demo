package com.dosimple.designdemo.bridge.two;

public class HouseCrop extends Crop {
    public HouseCrop(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("赚钱了");
    }
}
