package com.tzx.flyweight;

/**
 * Created by tanzhenxing on 17-5-27.
 * 具体享元
 */
public class Character implements Glyph {
    private char c;
    private int size;
    @Override
    public void draw(Context context) {
        this.size = context.getSize();
        System.out.println(size + "号" + c + "被画出！");
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public Character(char c) {
        this.c = c;
        System.out.println(c + "被创建！");
    }
}
