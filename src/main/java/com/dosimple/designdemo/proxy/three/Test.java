package com.dosimple.designdemo.proxy.three;

/**
 * @author baolw
 */
public class Test {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("Bob");
        IGamePlayer proxy = player.getProxy();
        proxy.login("Bob", "123456");
        proxy.killBoss();
        proxy.upgrade();
    }
}
