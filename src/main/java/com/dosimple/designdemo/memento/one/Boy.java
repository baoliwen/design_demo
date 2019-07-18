package com.dosimple.designdemo.memento.one;

/**
 * @author baolw
 */
class Boy {
    private String state = "";

    public void changeState() {

        this.state = "心情不好";
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    Memento createMemento() {
        return new Memento(this.state);
    }

    void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }

}
