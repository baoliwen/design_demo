package com.dosimple.designdemo.proxy.two;

/**
 * @author baolw
 */
class GamePlayer implements IGamePlayer {
    private String name = "";
    private IGamePlayer proxy = null;
    public GamePlayer(IGamePlayer gamePlayer, String name) throws Exception {
        if (gamePlayer == null) {
            throw new Exception("无法创建角色");
        } else {
            this.name = name;
        }
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
}
