package com.dosimple.designdemo.strategy.one;

/**
 * @author baolw
 */
class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();

    }
}
