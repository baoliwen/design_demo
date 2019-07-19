package com.dosimple.designdemo.command.three;

class ConcreteReceiver1 extends AbstractReceiver {
    @Override
    public void handle() {
        System.out.println("第一个接收者处理事情");
    }
}
