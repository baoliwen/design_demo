package com.dosimple.designdemo.state.two;

/**
 * @author baolw
 */
class ClosingState extends LiftState {
    @Override
    void close() {
        System.out.println("电梯门关闭");
    }

    @Override
    void open() {
        super.context.setLiftState(Context.OPENNING_STATE);
        super.context.getLiftState().open();
    }

    @Override
    void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.getLiftState().run();
    }

    @Override
    void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.getLiftState().stop();
    }
}
