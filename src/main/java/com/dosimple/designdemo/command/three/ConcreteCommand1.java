package com.dosimple.designdemo.command.three;

/**
 * @author baolw
 */
class ConcreteCommand1 extends Command {
    public ConcreteCommand1() {
        super(new ConcreteReceiver1());
    }

    public ConcreteCommand1(AbstractReceiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        super.receiver.handle();
    }
}
