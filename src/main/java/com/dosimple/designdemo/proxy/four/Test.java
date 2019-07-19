package com.dosimple.designdemo.proxy.four;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("Bob");
        InvocationHandler handler = new GamePlayIH(player);
        ClassLoader loader = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(loader, new Class[]{IGamePlayer.class}, handler);
        proxy.login("Bob", "asdf");
        proxy.killBoss();
        proxy.upgrade();
    }
}
