package com.tzx.factory.abstractfactory;

import com.tzx.factory.simplefactory.Shape;

/**
 * Created by tanzhenxing on 17-4-26.
 */
public interface ShapeFactory {
    Shape createShape();
    Color createColor();
}
