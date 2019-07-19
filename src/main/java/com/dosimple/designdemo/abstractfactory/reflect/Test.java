package com.dosimple.designdemo.abstractfactory.reflect;
class Test {

    public static void main(String[] args) throws Exception {
        CarFactory factory = new CarFactory();
        Car car = factory.createCar("com.dosimple.designdemo.abstractfactory.reflect.BenzBusinessCar");
        car.drive();
    }
}
