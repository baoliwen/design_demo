package com.dosimple.designdemo.strategy.one;

public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太施加压力");
    }

}
