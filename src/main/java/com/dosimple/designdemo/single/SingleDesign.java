package com.dosimple.designdemo.single;

class SingleDesign {
    private static final SingleDesign DESIGN = new SingleDesign();
    private static volatile SingleDesign dg;

    public static SingleDesign getInstance() {
        if (null == dg) {
            synchronized (SingleDesign.class){
                if (null == dg) {
                    dg = new SingleDesign();
                }
            }
        }
        return dg;
    }
}
