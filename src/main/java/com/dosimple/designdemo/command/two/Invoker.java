package com.dosimple.designdemo.command.two;

/**
 * @author baolw
 */
class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
