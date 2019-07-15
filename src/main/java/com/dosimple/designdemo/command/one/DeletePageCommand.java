package com.dosimple.designdemo.command.one;

/**
 * @author baolw
 */
class DeletePageCommand extends Command {
    @Override
    public void execute() {
        super.pageGroup.find();
        super.pageGroup.delete();
        super.pageGroup.plan();

    }
}
