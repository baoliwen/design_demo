package com.dosimple.designdemo.builder.two;

import java.util.List;
public class BMWBuilder extends AbstractCarBuilder {
    private BmwModel bmwModel = new BmwModel();
    @Override
    public void setSequence(List<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    public AbstractCarModel getCarModel() {
        return this.bmwModel;
    }
}
