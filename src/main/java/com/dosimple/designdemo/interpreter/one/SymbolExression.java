package com.dosimple.designdemo.interpreter.one;

/**
 * @author baolw
 */
abstract class SymbolExression extends Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
