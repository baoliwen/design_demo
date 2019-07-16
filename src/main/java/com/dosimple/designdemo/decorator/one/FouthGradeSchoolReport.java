package com.dosimple.designdemo.decorator.one;

/**
 * @author baolw
 */
public class FouthGradeSchoolReport extends AbstractSchoolReport {
    @Override
    void report() {
        System.out.println("尊敬的家长:您孩子的成绩，数学66，语文66，科学66");
    }

    @Override
    void sign(String name) {
        System.out.println("家长签名:"+name);
    }
}
