package com.dosimple.designdemo.builder.first;

import java.util.ArrayList;
import java.util.List;

/**
 * @author baolw
 */
abstract class AbstractCarModel {
    private List<String> sequence = new ArrayList<>();

    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();

    final public void run() {
        for (String s : sequence) {
            if (s.equals("start")) {
                this.start();
            } else if (s.equals("stop")) {
                this.stop();
            } else if (s.equals("engineBoom")) {
                this.engineBoom();
            } else if (s.equals("alarm")) {
                this.alarm();
            }
        }
    }

    final public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
