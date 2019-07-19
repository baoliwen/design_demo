package com.dosimple.designdemo.state.two;

class StoppingState extends LiftState {
    @Override
    void close() {

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
        System.out.println("电梯停止了");
    }
}
