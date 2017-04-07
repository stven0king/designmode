package com.tzx.component;

/**
 * Created by im on 17-3-13.
 */
public abstract class Component {
    String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void foreach();

}
