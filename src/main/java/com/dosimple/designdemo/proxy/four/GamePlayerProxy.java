package com.dosimple.designdemo.proxy.four;

class GamePlayerProxy implements IGamePlayer, IProxy {
    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer player) {
        this.gamePlayer = player;
    }

    @Override
    public void login(String userName, String password) {
        this.gamePlayer.login(userName, password);

    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
        this.calculateFee();

    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }

    @Override
    public void calculateFee() {
        System.out.println("升级费用150");
    }
}
