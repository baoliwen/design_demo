package com.dosimple.designdemo.memento.two;

/**
 * @author baolw
 */
class Client {
    public static void main(String[] args) {
        Boy boy = new Boy();
        Caretaker caretaker = new Caretaker();
        boy.setState("心情很棒");

        System.out.println("==================当前状态:"+boy.getState());
        caretaker.setMemento(boy.createMemento());
        boy.changeState();

        System.out.println("男孩心情改变：" + boy.getState());

        boy.restoreMemento(caretaker.getMemento());
        System.out.println("男孩状态恢复后状态:"+boy.getState());

    }
}
