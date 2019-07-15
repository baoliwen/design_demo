package com.dosimple.designdemo.command.one;

/**
 * @author baolw
 */
class AddRequirementCommand extends Command{
    @Override
    public void execute() {
        super.requirementGroup.find();
        super.requirementGroup.add();
        super.requirementGroup.plan();
    }
}
