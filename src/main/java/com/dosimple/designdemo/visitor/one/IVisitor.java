package com.dosimple.designdemo.visitor.one;
interface IVisitor {
    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);
}
