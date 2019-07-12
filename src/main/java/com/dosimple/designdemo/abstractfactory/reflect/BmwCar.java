package com.dosimple.designdemo.abstractfactory.reflect;

/**
 * @author baolw
 */
abstract class BmwCar implements Car{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
