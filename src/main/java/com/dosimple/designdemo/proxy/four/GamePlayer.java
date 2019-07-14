package com.dosimple.designdemo.proxy.four;

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
            System.out.println("登入,userName="+userName+"密码="+password);
    }

    @Override
    public void killBoss() {
            System.out.println("击杀boss");
    }

    @Override
    public void upgrade() {
            System.out.println("升级成功");
    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return proxy;
    }
}
