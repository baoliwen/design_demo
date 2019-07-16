package com.dosimple.designdemo.adapter.one;

/**
 * @author baolw
 */
class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("姓名...");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("家庭住址....");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("手机号码...");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("办公室电话...");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("职位信息...");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("家庭电话...");
        return null;
    }
}
