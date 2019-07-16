package com.dosimple.designdemo.composite.one;

import java.util.List;

/**
 * @author baolw
 */
interface IBranch extends ICorp {
    void addSubordinate(ICorp corp);

    List<ICorp> getSubordinate();
}
