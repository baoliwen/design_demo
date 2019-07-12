package com.dosimple.designdemo.proxy.two;

/**
 * @author baolw
 */
public class Test {
    public static void main(String[] args) {
        IGamePlayer proxy = new GamePlayerProxy("张三");
        proxy.login("bob", "123456");
        proxy.killBoss();
        proxy.upgrade();

    }
}
