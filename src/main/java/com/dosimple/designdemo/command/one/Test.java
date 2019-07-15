package com.dosimple.designdemo.command.one;

/**
 * @author baolw
 */
class Test {
    public static void main(String[] args) {
        Invoker zhangsan = new Invoker();
        Command command = new AddRequirementCommand();
        zhangsan.setCommand(command);
        zhangsan.action();

        Command delete = new DeletePageCommand();
        zhangsan.setCommand(delete);
        zhangsan.action();
    }
}
