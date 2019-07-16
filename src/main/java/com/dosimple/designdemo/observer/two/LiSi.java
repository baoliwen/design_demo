package com.dosimple.designdemo.observer.two;

import java.util.Observable;
import java.util.Observer;

/**
 * @author baolw
 */
class LiSi implements Observer {

    private void reportBoss(String context) {
        System.out.println("报告老板，韩非子在:"+context);
    }

    public void update(Observable o, Object arg) {
        System.out.println("观察到韩子活动，开始向老板汇报");
        reportBoss(arg.toString());
        System.out.println("汇报完毕");
    }
}
