package com.dosimple.designdemo.memento.one;

/**
 * @author baolw
 */
class Client {
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setState("心情很棒");

        System.out.println("==================当前状态:"+boy.getState());
        Memento memento = boy.createMemento();
        boy.changeState();

        System.out.println("男孩心情改变：" + boy.getState());

        boy.restoreMemento(memento);
        System.out.println("男孩状态恢复后状态:"+boy.getState());

    }
}
