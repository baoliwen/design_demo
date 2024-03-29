package com.dosimple.designdemo.factory.simplefactory;

/**
 * @author baolw
 */
class HumanFactory {
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)human;
    }
}
