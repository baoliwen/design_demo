package com.dosimple.designdemo.faced.one;

/**
 * @author baolw
 */
class Client {
    public static void main(String[] args) {
        ModenPostOffice postOffice = new ModenPostOffice();

        String adderss = "浙江杭州";
        String context = "我是你的老朋友了";
        postOffice.sendLetter(context, adderss);
    }
}
