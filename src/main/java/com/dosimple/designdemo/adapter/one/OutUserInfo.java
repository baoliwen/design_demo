package com.dosimple.designdemo.adapter.one;

/**
 * @author baolw
 */
public class OutUserInfo extends OuterUser implements IUserInfo{
    @Override
    public String getUserName() {
        System.out.println(super.getUserBaseInfo().get("userName"));
        return super.getUserBaseInfo().get("userName");
    }

    @Override
    public String getHomeAddress() {
        System.out.println(super.getUserHomeInfo().get("homeAddress"));
        return super.getUserHomeInfo().get("homeAddress");
    }

    @Override
    public String getMobileNumber() {
        System.out.println(super.getUserBaseInfo().get("mobileNumber"));
        return super.getUserBaseInfo().get("mobileNumber");
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println(super.getUserOfficeInfo().get("officeTelNumber"));
        return super.getUserOfficeInfo().get("officeTelNumber");
    }

    @Override
    public String getJobPosition() {
        System.out.println(super.getUserOfficeInfo().get("jobPosition"));
        return super.getUserOfficeInfo().get("jobPosition");
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println(super.getUserHomeInfo().get("homeTelNumber"));
        return super.getUserHomeInfo().get("homeTelNumber");
    }
}
