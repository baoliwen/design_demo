package com.dosimple.designdemo.interpreter.one;

import java.util.Map;

class SubExpression extends SymbolExression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int interpreter(Map<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
