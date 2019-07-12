package com.dosimple.designdemo.template.first;

/**
 * @author baolw
 */
class HummerH1Model extends AbstractHummerModel{
    @Override
    public void start() {
        System.out.println("HummerH1Model---start");
    }

    @Override
    public void stop() {
        System.out.println("HummerH1Model---stop");
    }

    @Override
    public void alarm() {
        System.out.println("HummerH1Model---alarm");
    }

    @Override
    public void engineBoom() {
        System.out.println("HummerH1Model---engineBoom");
    }
}
