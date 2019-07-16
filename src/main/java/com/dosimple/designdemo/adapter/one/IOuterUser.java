package com.dosimple.designdemo.adapter.one;

import java.util.Map;

/**
 * @author baolw
 */
interface IOuterUser {
    Map<String, String> getUserBaseInfo();

    Map<String, String> getUserOfficeInfo();

    Map<String, String> getUserHomeInfo();
}
