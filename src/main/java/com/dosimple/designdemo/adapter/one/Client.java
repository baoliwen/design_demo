package com.dosimple.designdemo.adapter.one;

/**
 * @author baolw
 */
class Client {
    public static void main(String[] args) {
        IUserInfo girls = new UserInfo();
        for (int i = 0; i < 100; i++) {
            girls.getMobileNumber();
        }

        girls = new OutUserInfo();
        for (int i = 0; i < 100; i++) {
            girls.getMobileNumber();
        }

    }
}
