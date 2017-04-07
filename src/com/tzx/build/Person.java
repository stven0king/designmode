package com.tzx.build;

/**
 * Created by im on 17-3-14.
 * 建造者模式
 */
public class Person {
    private String name;
    private String atge;
    private double height;
    private double weight;

    public Person(String name, String atge, double height, double weight) {
        this.name = name;
        this.atge = atge;
        this.height = height;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAtge(String atge) {
        this.atge = atge;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static class Bulider {

    }
}
