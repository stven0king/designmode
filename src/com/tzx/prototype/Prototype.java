package com.tzx.prototype;

import java.util.ArrayList;

/**
 * Created by tanzhenxing on 17-4-26.
 */
public class Prototype implements Cloneable {
    private ArrayList list = new ArrayList<>();

    private String name;

    public Prototype clone() throws CloneNotSupportedException {
        Prototype prototype = null;
        prototype = (Prototype) super.clone();
        prototype.list = (ArrayList) this.list.clone();
        return prototype;
    }

}
