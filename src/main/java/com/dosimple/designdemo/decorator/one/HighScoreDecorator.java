package com.dosimple.designdemo.decorator.one;

/**
 * @author baolw
 */
class HighScoreDecorator extends AbstractDecorator {
    public HighScoreDecorator(AbstractSchoolReport schoolReport) {
        super(schoolReport);
    }

    private void reportHighSchool() {
        System.out.println("这次语文考试最高75，数学78，科学80");
    }
    @Override
    void report() {
        this.reportHighSchool();
        super.report();
    }
}
