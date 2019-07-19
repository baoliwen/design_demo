package com.dosimple.designdemo.state.one;

class Cient {
    public static void main(String[] args) {
        ILift lift = new Lift();
        lift.setState(ILift.STOPPING_STATE);
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
