package com.dosimple.designdemo.proxy.four;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class GamePlayIH implements InvocationHandler{
    Class cls = null;
    Object obj = null;

    public GamePlayIH(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object o = method.invoke(this.obj, args);
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人登入账号");
        }
        return o;
    }
}
