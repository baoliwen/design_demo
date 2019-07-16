package com.dosimple.designdemo.composite.two;

/**
 * @author baolw
 */
abstract class Corp {
    private String name = "";
    private String position = "";
    private int salary = 0;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder(1000);
        sb.append("姓名:").append(this.name).append("\t 职位:").append(this.position).append("\t 薪水").append(this.salary);
        return sb.toString();
    }
}
