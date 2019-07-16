package com.dosimple.designdemo.responsibility.one;

/**
 * @author baolw
 */
class Husband extends Handler {
    public Husband() {
        super(Handler.HUSBAND_LEVER_REQUEST);
    }

    @Override
    void response(IWomen women) {
        System.out.println("妻子向丈夫请示,请示内容如下：");
        System.out.println(women.getRequest());
        System.out.println("丈夫同意");
    }
}
