package com.dosimple.designdemo.abstractfactory.reflect;

/**
 * @author baolw
 */
class Test {

    public static void main(String[] args) throws Exception {
        CarFactory factory = new CarFactory();
        Car car = factory.createCar("com.dosimple.designdemo.abstractfactory.reflect.BenzBusinessCar");
        car.drive();
    }
}
