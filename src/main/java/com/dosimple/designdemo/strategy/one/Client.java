package com.dosimple.designdemo.strategy.one;

/**
 * @author baolw
 */
class Client {
    public static void main(String[] args) {
        Context context = new Context(new BackDoor());
        context.operate();

        context = new Context(new GreenLight());
        context.operate();

        context = new Context(new BlockEnemy());
        context.operate();
    }
}
