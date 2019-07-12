package com.dosimple.designdemo.template.two;

class HummerH2Model extends AbstractHummerModel {
    @Override
    public void start() {
        System.out.println("HummerH2Model---start");
    }

    @Override
    public void stop() {
        System.out.println("HummerH2Model---stop");
    }

    @Override
    public void alarm() {
        System.out.println("HummerH2Model---alarm");
    }

    @Override
    public void engineBoom() {
        System.out.println("HummerH2Model---engineBoom");
    }

    @Override
    protected boolean isAlarm() {
        return false;
    }
}
