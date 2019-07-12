package com.dosimple.designdemo.proxy.three;

/**
 * @author baolw
 */
class GamePlayer implements IGamePlayer {
    private String name = "";
    private IGamePlayer proxy = null;
    public GamePlayer(String name){
        this.name = name;
    }

    @Override
    public void login(String userName, String password) {
        if (this.isProxy()) {
            System.out.println("登入,userName="+userName+"密码="+password);
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println("击杀boss");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println("升级成功");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return proxy;
    }

    private boolean isProxy() {
        return this.proxy != null;
    }
}
