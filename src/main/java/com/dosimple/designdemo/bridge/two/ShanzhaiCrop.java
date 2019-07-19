package com.dosimple.designdemo.bridge.two;

public class ShanzhaiCrop extends Crop {

    public ShanzhaiCrop(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("山寨公司赚钱");
    }
}
