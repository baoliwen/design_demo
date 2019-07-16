package com.dosimple.designdemo.decorator.one;

/**
 * @author baolw
 */
abstract class AbstractDecorator extends AbstractSchoolReport {
    private AbstractSchoolReport schoolReport;

    public AbstractDecorator(AbstractSchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    @Override
    void report() {
        this.schoolReport.report();
    }

    @Override
    void sign(String name) {
        this.schoolReport.sign(name);
    }
}
