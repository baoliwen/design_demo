package com.dosimple.designdemo.observer.one;

/**
 * @author baolw
 */
class HanFeiZi implements IHanFeiZi {
    private ILiSi liSi = new LiSi();
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子在吃饭");
        this.liSi.update("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子在娱乐");
        this.liSi.update("韩非子在娱乐");
    }
}
