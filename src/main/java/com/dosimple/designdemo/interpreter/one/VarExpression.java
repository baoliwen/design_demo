package com.dosimple.designdemo.interpreter.one;

import java.util.Map;

/**
 * @author baolw
 */
class VarExpression extends Expression{
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    int interpreter(Map<String, Integer> var) {
        return var.get(this.key);
    }
}
