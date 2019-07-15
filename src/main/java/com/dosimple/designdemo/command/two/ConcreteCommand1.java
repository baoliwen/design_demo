package com.dosimple.designdemo.command.two;

/**
 * @author baolw
 */
class ConcreteCommand1 extends Command {
    private AbstractReceiver abstractReceiver;

    public ConcreteCommand1(AbstractReceiver abstractReceiver) {
        this.abstractReceiver = abstractReceiver;
    }

    @Override
    public void execute() {
        abstractReceiver.handle();
    }
}
