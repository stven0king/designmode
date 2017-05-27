package com.tzx.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanzhenxing on 17-5-27.
 */
public class Row implements Glyph {
    private List<Character> list = new ArrayList<>();
    @Override
    public void draw(Context context) {

    }

    public Row() {
    }

    public void setCharacter(Glyph r) {
        list.add((Character) r);
    }

    public int getSize() {
        return list.size();
    }

    public String getRow() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character g:list) {
            stringBuilder.append(g.getC());
        }
        return stringBuilder.toString();
    }
}
