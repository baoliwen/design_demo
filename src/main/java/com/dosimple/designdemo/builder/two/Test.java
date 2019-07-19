package com.dosimple.designdemo.builder.two;
class Test {
    public static void main(String[] args) {
        Director director = new Director();
        director.getABenzModel().run();
        System.out.println("++++++++++++++++++++++++++++++++++");
        director.getBBenzModel().run();
        System.out.println("++++++++++++++++++++++++++++++++++");
        director.getABmwModel().run();
        System.out.println("++++++++++++++++++++++++++++++++++");
        director.getBBmwModel().run();
    }
}
