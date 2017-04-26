package com.tzx.factory;

import com.tzx.factory.abstractfactory.Color;
import com.tzx.factory.abstractfactory.RedCircleFactory;
import com.tzx.factory.methodfactory.CircleFactory;
import com.tzx.factory.simplefactory.Shape;
import com.tzx.factory.simplefactory.ShapeFactory;

/**
 * Created by tanzhenxing on 17-4-26.
 */
public class Main {
    public static void main(String[] args) {
        simplefactory();
        System.out.println("-------------------------");
        methodfactory();
        System.out.println("-------------------------");
        abstractfactory();
    }

    /**
     * 简单工厂模式
     */
    public static void simplefactory() {
        Shape shape = ShapeFactory.create(ShapeFactory.CIRCLE);
        shape.sayHello();
    }

    /**
     * 工厂方法模式
     */
    public static void methodfactory() {
        Shape shape = new CircleFactory().create();
        shape.sayHello();
    }

    /**
     * 抽象工程模式
     */
    public static void abstractfactory() {
        com.tzx.factory.abstractfactory.ShapeFactory factory = new RedCircleFactory();
        Shape shape = factory.createShape();
        shape.sayHello();
        Color color = factory.createColor();
        color.sayHello();
    }
}
