package com.dosimple.designdemo.state.two;

/**
 * @author baolw
 */
class Cient {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
