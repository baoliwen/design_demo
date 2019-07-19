package com.dosimple.designdemo.proxy.three;

interface IGamePlayer {
    void login(String userName, String password);

    void killBoss();

    void upgrade();

    IGamePlayer getProxy();
}
