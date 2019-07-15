package com.dosimple.designdemo.command.one;

/**
 * @author baolw
 */
abstract class Command {
    protected RequirementGroup requirementGroup = new RequirementGroup();
    protected PageGroup pageGroup = new PageGroup();
    protected CodeGroup codeGroup = new CodeGroup();

    public abstract void execute();
}
