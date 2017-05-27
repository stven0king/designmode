package com.tzx.flyweight;

/**
 * Created by tanzhenxing on 17-5-27.
 */
public class Context {
    private int size;
    private char c;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public Context(int size, char c) {
        this.size = size;
        this.c = c;
    }
}
