package com.tzx.component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by im on 17-3-13.
 */
public class Composite extends Component {

    private List<Component> child = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        child.add(component);
    }

    @Override
    public void remove(Component component) {
        child.remove(component);
    }

    @Override
    public void foreach() {
        System.out.println("节点名:\t" + name);
        for (Component c : child) {
            c.foreach();
        }
    }
}
