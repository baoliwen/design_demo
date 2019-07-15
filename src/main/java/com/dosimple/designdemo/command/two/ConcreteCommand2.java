package com.dosimple.designdemo.command.two;

/**
 * @author baolw
 */
class ConcreteCommand2 extends Command {
    private AbstractReceiver abstractReceiver;

    public ConcreteCommand2(AbstractReceiver abstractReceiver) {
        this.abstractReceiver = abstractReceiver;
    }

    @Override
    public void execute() {
        abstractReceiver.handle();
    }
}
