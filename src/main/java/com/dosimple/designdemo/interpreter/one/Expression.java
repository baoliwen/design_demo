package com.dosimple.designdemo.interpreter.one;

import java.util.Map;
abstract class Expression {

    abstract int interpreter(Map<String, Integer> var);
}
