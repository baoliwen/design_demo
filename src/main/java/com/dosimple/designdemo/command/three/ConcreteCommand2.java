package com.dosimple.designdemo.command.three;

/**
 * @author baolw
 */
class ConcreteCommand2 extends Command {

    public ConcreteCommand2() {
        super(new ConcreteReceiver2());
    }

    public ConcreteCommand2(AbstractReceiver receiver) {
        super(receiver);
    }


    @Override
    public void execute() {
        super.receiver.handle();
    }
}
