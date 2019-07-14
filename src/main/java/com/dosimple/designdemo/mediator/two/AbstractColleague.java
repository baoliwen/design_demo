package com.dosimple.designdemo.mediator.two;

/**
 * @author baolw
 */
abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }

}
