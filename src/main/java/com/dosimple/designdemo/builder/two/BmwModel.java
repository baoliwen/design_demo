package com.dosimple.designdemo.builder.two;
class BmwModel extends AbstractCarModel {
    @Override
    protected void start() {
        System.out.println("---------------BmwModel start---------------");
    }

    @Override
    protected void stop() {
        System.out.println("---------------BmwModel stop---------------");
    }

    @Override
    protected void alarm() {
        System.out.println("---------------BmwModel alarm---------------");
    }

    @Override
    protected void engineBoom() {
        System.out.println("---------------BmwModel engineBoom---------------");
    }
}
