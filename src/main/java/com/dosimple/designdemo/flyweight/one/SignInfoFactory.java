package com.dosimple.designdemo.flyweight.one;

import java.util.HashMap;
import java.util.Map;

class SignInfoFactory {
    private static Map<String, SignInfo> pool = new HashMap<>();

    public static SignInfo getSignInfo(String key) {
        SignInfo result = null;
        if (!pool.containsKey(key)) {
            System.out.println("建立对象");
            result = new SignInfo4Pool(key);
            pool.put(key, result);
        } else {
            result = pool.get(key);
            System.out.println("从 池中获得");
        }
        return result;
    }
}
