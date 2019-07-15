package com.dosimple.designdemo.command.one;

/**
 * @author baolw
 */
class CodeGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到代码组");
    }

    @Override
    public void add() {
        System.out.println("代码组增加页面");
    }

    @Override
    public void delete() {
        System.out.println("代码组删除页面");
    }

    @Override
    public void change() {
        System.out.println("代码组修改页面");
    }

    @Override
    public void plan() {
        System.out.println("代码组修改计划");
    }
}
