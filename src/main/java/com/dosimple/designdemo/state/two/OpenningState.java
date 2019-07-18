package com.dosimple.designdemo.state.two;

/**
 * @author baolw
 */
class OpenningState extends LiftState {

    @Override
    void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.getLiftState().close();
    }

    @Override
    void open() {
        System.out.println("电梯门开启");
    }

    @Override
    void run() {

    }

    @Override
    void stop() {

    }
}
