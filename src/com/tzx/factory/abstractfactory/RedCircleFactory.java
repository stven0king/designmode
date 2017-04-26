package com.tzx.factory.abstractfactory;

import com.tzx.factory.simplefactory.Circle;
import com.tzx.factory.simplefactory.Shape;

/**
 * Created by tanzhenxing on 17-4-26.
 */
public class RedCircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }

    @Override
    public Color createColor() {
        return new Red();
    }
}
