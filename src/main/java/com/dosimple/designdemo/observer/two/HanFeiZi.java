package com.dosimple.designdemo.observer.two;

import java.util.Observable;
class HanFeiZi extends Observable implements IHanFeiZi {
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子在吃饭");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子在娱乐");
        super.setChanged();
        super.notifyObservers("韩非子在娱乐");
    }
}
