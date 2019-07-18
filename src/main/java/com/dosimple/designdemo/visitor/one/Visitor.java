package com.dosimple.designdemo.visitor.one;

/**
 * @author baolw
 */
class Visitor implements IVisitor {

    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
    }

    private String getBasicInfo(Employee employee) {
        return "姓名" + employee.getName() + "\t 性别:" + employee.getSex() + "\t 薪水:" + employee.getSalary();
    }

    private String getCommonEmployee(CommonEmployee commonEmployee) {
        return getBasicInfo(commonEmployee) + "岗位:" + commonEmployee.getJob();
    }

    public String getManagerInfo(Manager manager) {
        return getBasicInfo(manager) + "业绩:" + manager.getPerformance();
    }
}
