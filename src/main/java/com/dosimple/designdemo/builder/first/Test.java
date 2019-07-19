package com.dosimple.designdemo.builder.first;

import java.util.ArrayList;
import java.util.List;

class Test {
    public static void main(String[] args) {
        List<String> sequence = new ArrayList<>();
        sequence.add("alarm");
        sequence.add("start");
        sequence.add("stop");

        BenzModel benz = new BenzModel();
        benz.setSequence(sequence);
        benz.run();
    }
}
