package com.dosimple.designdemo.state.two;

class RunningState extends LiftState{
    @Override
    void close() {

    }

    @Override
    void open() {

    }

    @Override
    void run() {
        System.out.println("电梯上下运行");
    }

    @Override
    void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.getLiftState().stop();
    }
}
