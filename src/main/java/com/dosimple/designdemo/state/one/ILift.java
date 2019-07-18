package com.dosimple.designdemo.state.one;

/**
 * @author baolw
 */
interface ILift {
    int OPENING_STATE = 1;
    int CLOSING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPPING_STATE = 4;

    void setState(int state);

    void close();

    void open();

    void run();

    void stop();

}
