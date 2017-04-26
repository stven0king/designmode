package com.tzx.factory.methodfactory;

import com.tzx.factory.simplefactory.Shape;
import com.tzx.factory.simplefactory.Triangle;

/**
 * Created by tanzhenxing on 17-4-26.
 */
public class TriangleFactory implements ShapeFactory {
    @Override
    public Shape create() {
        return new Triangle();
    }
}
