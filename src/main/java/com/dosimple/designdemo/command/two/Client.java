package com.dosimple.designdemo.command.two;

/**
 * @author baolw
 */
class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        AbstractReceiver receiver = new ConcreteReceiver1();
        Command command = new ConcreteCommand1(receiver);
        invoker.setCommand(command);
        invoker.action();
    }
}
