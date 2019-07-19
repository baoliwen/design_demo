package com.dosimple.designdemo.builder.two;

class BenzModel extends AbstractCarModel {
    @Override
    protected void start() {
        System.out.println("---------------BenzModel start---------------");
    }

    @Override
    protected void stop() {
        System.out.println("---------------BenzModel stop---------------");
    }

    @Override
    protected void alarm() {
        System.out.println("---------------BenzModel alarm---------------");
    }

    @Override
    protected void engineBoom() {
        System.out.println("---------------BenzModel engineBoom---------------");
    }
}
