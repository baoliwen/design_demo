package com.dosimple.designdemo.responsibility.one;

/**
 * @author baolw
 */
abstract class Handler {
    public static final int FATHER_LEVER_REQUEST = 1;
    public static final int HUSBAND_LEVER_REQUEST = 2;
    public static final int SON_LEVER_REQUEST = 3;

    private int level = 0;
    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    final void handleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.handleMessage(women);
            } else {
                System.out.println("----没有地方请示，拒绝处理----");

            }
        }
    }

    abstract void response(IWomen women);

}
