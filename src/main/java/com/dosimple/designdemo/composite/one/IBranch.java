package com.dosimple.designdemo.composite.one;

import java.util.List;

interface IBranch extends ICorp {
    void addSubordinate(ICorp corp);

    List<ICorp> getSubordinate();
}
