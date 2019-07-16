package com.dosimple.designdemo.responsibility.one;

/**
 * @author baolw
 */
class Father extends Handler{
    public Father() {
        super(Handler.FATHER_LEVER_REQUEST);
    }

    @Override
    void response(IWomen women) {
        System.out.println("女儿向父亲请示,请示内容如下：");
        System.out.println(women.getRequest());
        System.out.println("父亲同意");
    }
}
