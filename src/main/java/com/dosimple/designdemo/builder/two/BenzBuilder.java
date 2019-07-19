package com.dosimple.designdemo.builder.two;

import java.util.List;

public class BenzBuilder extends AbstractCarBuilder {
    private BenzModel benzModel = new BenzModel();
    @Override
    public void setSequence(List<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    public AbstractCarModel getCarModel() {
        return this.benzModel;
    }
}
