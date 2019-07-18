package com.dosimple.designdemo.interpreter.one;

import java.util.Map;

/**
 * @author baolw
 */
abstract class Expression {

    abstract int interpreter(Map<String, Integer> var);
}
