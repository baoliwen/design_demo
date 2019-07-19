package com.dosimple.designdemo.decorator.one;

class Client {
    public static void main(String[] args) {
        AbstractSchoolReport report = new FouthGradeSchoolReport();
        report = new HighScoreDecorator(report);
        report = new SortDecorator(report);

        report.report();
        report.sign("家长");
    }
}
