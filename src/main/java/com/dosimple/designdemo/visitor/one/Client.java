package com.dosimple.designdemo.visitor.one;

import java.util.ArrayList;
import java.util.List;

/**
 * @author baolw
 */
class Client {
    public static void main(String[] args) {
        for (Employee employee : mockEmployee()) {
            employee.accept(new Visitor());
        }
    }

    public static List<Employee> mockEmployee() {
        List<Employee> empList = new ArrayList<>();
        CommonEmployee zhangsan = new CommonEmployee();
        zhangsan.setJob("研发");
        zhangsan.setName("张三");
        zhangsan.setSalary(10000);
        zhangsan.setSex(Employee.FEMALE);
        empList.add(zhangsan);

        CommonEmployee lisi = new CommonEmployee();
        lisi.setJob("美工");
        lisi.setName("李四");
        lisi.setSalary(8000);
        lisi.setSex(Employee.FEMALE);
        empList.add(lisi);

        Manager wangwu = new Manager();
        wangwu.setName("王五");
        wangwu.setPerformance("业绩");
        wangwu.setSex(Employee.MALE);
        wangwu.setSalary(18000);
        empList.add(wangwu);
        return empList;
    }
}
