package com.tzx.factory.simplefactory;

/**
 * Created by tanzhenxing on 17-4-26.
 */
public class ShapeFactory {
    public static final int CIRCLE = 1;
    public static final int RECTANGLE = 2;
    public static final int TRIANGLE = 3;

    public static Shape create(int type) {
        Shape shape = null;
        switch (type) {
            case CIRCLE:
                shape = new Circle();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
            case TRIANGLE:
                shape = new Triangle();
                break;
        }
        return shape;
    }

}
