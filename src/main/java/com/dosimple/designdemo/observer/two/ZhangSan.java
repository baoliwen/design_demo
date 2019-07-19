package com.dosimple.designdemo.observer.two;

import java.util.Observable;
import java.util.Observer;

class ZhangSan implements Observer {

    private void reportBoss(String context) {
        System.out.println("张三报告老板，韩非子在:"+context);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("张三观察到韩子活动，开始向老板汇报");
        reportBoss(arg.toString());
        System.out.println("张三汇报完毕");
    }
}
