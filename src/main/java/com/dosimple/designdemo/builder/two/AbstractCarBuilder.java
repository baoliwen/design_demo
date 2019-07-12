package com.dosimple.designdemo.builder.two;

import java.util.List;

/**
 * @author baolw
 */
abstract class AbstractCarBuilder {
    public abstract void setSequence(List<String> sequence);

    public abstract AbstractCarModel getCarModel();
}
