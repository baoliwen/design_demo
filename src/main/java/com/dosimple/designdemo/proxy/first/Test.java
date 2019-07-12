package com.dosimple.designdemo.proxy.first;

/**
 * @author baolw
 */
public class Test {
    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("bob");
        IGamePlayer proxy = new GamePlayerProxy(gamePlayer);

        proxy.login("bob", "123456");
        proxy.killBoss();
        proxy.upgrade();

    }
}
