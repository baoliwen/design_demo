package com.dosimple.designdemo.state.two;

abstract class LiftState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    abstract void close();

    abstract void open();

    abstract void run();

    abstract void stop();
}
