package com.dosimple.designdemo.command.three;

class ConcreteReceiver2 extends AbstractReceiver {
    @Override
    public void handle() {
        System.out.println("第二个接收者处理事情");
    }
}
