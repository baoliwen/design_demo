package com.dosimple.designdemo.factory.first;

/**
 * @author baolw
 */
abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
