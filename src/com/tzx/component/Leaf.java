package com.tzx.component;

/**
 * Created by im on 17-3-13.
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void foreach() {
        System.out.println("self name-->"+this.name);
    }
}
