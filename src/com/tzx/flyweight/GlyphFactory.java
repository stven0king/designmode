package com.tzx.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tanzhenxing on 17-5-27.
 * 享元工厂
 */
public class GlyphFactory {
    private Map<String, Glyph> map = new HashMap<>();
    public Glyph getGlyph(Context context) {
        String cStr = context.getC() + "";
        Glyph gl = map.get(cStr);
        if (gl == null) {
            gl = new Character(context.getC());
            map.put(cStr, gl);
        }
        gl.draw(context);
        return gl;
    }
}
