package com.dosimple.designdemo.visitor.one;

/**
 * @author baolw
 */
interface IVisitor {
    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);
}
