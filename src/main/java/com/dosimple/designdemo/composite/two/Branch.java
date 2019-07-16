package com.dosimple.designdemo.composite.two;

import java.util.ArrayList;
import java.util.List;

/**
 * @author baolw
 */
class Branch extends Corp {


    private List<Corp> subordinateList = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void addSubordinate(Corp corp) {
        this.subordinateList.add(corp);
    }

    public List<Corp> getSubordinate() {
        return this.subordinateList;
    }
}
