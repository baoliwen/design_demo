package com.dosimple.designdemo.composite.one;

import java.util.ArrayList;
import java.util.List;

/**
 * @author baolw
 */
class Branch implements IBranch {
    private String name = "";
    private String position = "";
    private int salary = 0;
    private List<ICorp> subordinateList = new ArrayList<>();


    public Branch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder(1000);
        sb.append("姓名:").append(this.name).append("\t 职位:").append(this.position).append("\t 薪水").append(this.salary);
        return sb.toString();
    }

    @Override
    public void addSubordinate(ICorp corp) {
        this.subordinateList.add(corp);
    }

    @Override
    public List<ICorp> getSubordinate() {
        return this.subordinateList;
    }
}
