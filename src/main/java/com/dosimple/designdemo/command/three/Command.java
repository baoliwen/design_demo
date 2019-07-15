package com.dosimple.designdemo.command.three;

/**
 * @author baolw
 */
abstract class Command {
    protected final AbstractReceiver receiver;

    public Command(AbstractReceiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
