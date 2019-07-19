package com.dosimple.designdemo.observer.one;

class LiSi implements ILiSi{
    @Override
    public void update(String context) {
        System.out.println("观察到韩子活动，开始向老板汇报");
        reportBoss(context);
        System.out.println("汇报完毕");
    }

    private void reportBoss(String context) {
        System.out.println("报告老板，韩非子在:"+context);
    }
}
