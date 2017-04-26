package com.tzx.factory.methodfactory;

import com.tzx.factory.simplefactory.Circle;
import com.tzx.factory.simplefactory.Shape;

/**
 * Created by tanzhenxing on 17-4-26.
 */
public class CircleFactory implements ShapeFactory {
    @Override
    public Shape create() {
        return new Circle();
    }
}
