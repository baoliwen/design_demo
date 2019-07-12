package com.dosimple.designdemo.abstractfactory.reflect;

/**
 * @author baolw
 */
class CarFactory extends AbstractCarFactory {
    @Override
    public Car createCar(String car) throws Exception {
        return (Car) Class.forName(car).newInstance();
    }
}
