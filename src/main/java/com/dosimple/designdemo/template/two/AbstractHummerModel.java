package com.dosimple.designdemo.template.two;

abstract class AbstractHummerModel {
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();

    /**
     * 改动
     * @return
     */
    protected boolean isAlarm() {
        return true;
    }

    public void run() {
        this.start();
        this.engineBoom();
        if (isAlarm()) {
            this.alarm();
        }
        this.stop();
    }
}
