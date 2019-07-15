package com.dosimple.designdemo.command.one;

/**
 * @author baolw
 */
class RequirementGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到需求组");
    }

    @Override
    public void add() {
        System.out.println("需求组增加页面");
    }

    @Override
    public void delete() {
        System.out.println("需求组删除页面");
    }

    @Override
    public void change() {
        System.out.println("需求组修改页面");
    }

    @Override
    public void plan() {
        System.out.println("需求组修改计划");
    }
}
