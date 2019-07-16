package com.dosimple.designdemo.strategy.one;

/**
 * @author baolw
 */
class GreenLight implements IStrategy {

    @Override
    public void operate() {
        System.out.println("让吴国太开绿灯");
    }
}
