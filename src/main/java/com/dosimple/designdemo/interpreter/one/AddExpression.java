package com.dosimple.designdemo.interpreter.one;

import java.util.Map;

class AddExpression extends SymbolExression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int interpreter(Map<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
