package com.dosimple.designdemo.decorator.one;

/**
 * @author baolw
 */
class SortDecorator extends AbstractDecorator {

    public SortDecorator(AbstractSchoolReport schoolReport) {
        super(schoolReport);
    }

    private void reportSort() {
        System.out.println("我的排名是38名");
    }
    @Override
    void report() {
        this.reportSort();
        super.report();
    }
}
