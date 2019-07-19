package com.dosimple.designdemo.bridge.two;

class Client {
    public static void main(String[] args) {
        new HouseCrop( new House()).makeMoney();

        new ShanzhaiCrop(new IPod()).makeMoney();
    }
}
