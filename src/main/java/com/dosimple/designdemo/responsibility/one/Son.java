package com.dosimple.designdemo.responsibility.one;

/**
 * @author baolw
 */
class Son extends Handler {
    public Son() {
        super(Handler.SON_LEVER_REQUEST);
    }

    @Override
    void response(IWomen women) {
        System.out.println("母亲向儿子请示,请示内容如下：");
        System.out.println(women.getRequest());
        System.out.println("儿子同意");
    }
}
