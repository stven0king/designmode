package com.tzx.factory.methodfactory;

import com.tzx.factory.simplefactory.Rectangle;
import com.tzx.factory.simplefactory.Shape;

/**
 * Created by tanzhenxing on 17-4-26.
 */
public class RectangleFactory implements ShapeFactory {
    @Override
    public Shape create() {
        return new Rectangle();
    }
}
