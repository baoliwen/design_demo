package com.dosimple.designdemo.command.one;
class PageGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到页面组");
    }

    @Override
    public void add() {
        System.out.println("页面组增加页面");
    }

    @Override
    public void delete() {
        System.out.println("页面组删除页面");
    }

    @Override
    public void change() {
        System.out.println("页面组修改页面");
    }

    @Override
    public void plan() {
        System.out.println("页面组修改计划");
    }
}
