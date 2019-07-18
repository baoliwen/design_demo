package com.dosimple.designdemo.state.two;

/**
 * @author baolw
 */
class Context {
    final static OpenningState OPENNING_STATE = new OpenningState();
    final static ClosingState CLOSING_STATE = new ClosingState();
    final static RunningState RUNNING_STATE = new RunningState();
    final static StoppingState STOPPING_STATE = new StoppingState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }
    public void close() {
        this.liftState.close();
    }
    public void run() {
        this.liftState.run();
    }
    public void stop() {
        this.liftState.stop();
    }
}
