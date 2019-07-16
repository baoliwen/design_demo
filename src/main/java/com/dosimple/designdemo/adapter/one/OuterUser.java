package com.dosimple.designdemo.adapter.one;

import java.util.HashMap;
import java.util.Map;

/**
 * @author baolw
 */
class OuterUser implements IOuterUser{
    @Override
    public Map<String, String> getUserBaseInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("userName", "名字");
        map.put("mobileNumber", "员工电话");
        return map;
    }

    @Override
    public Map<String, String> getUserHomeInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("homeTelNumber", "家庭电话");
        map.put("homeAddress", "家庭住址");
        return map;
    }

    @Override
    public Map<String, String> getUserOfficeInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("jobPosition", "职位");
        map.put("officeTelNumber", "办公室电话");
        return map;
    }
}
