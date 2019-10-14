package com.tzx.build;

public class Employee extends Builder {
    private String name;
    private String age;
    private double height;
    private double weight;


    public Person create() {
        Person person = new Person();
        person.setAge(age);
        person.setName(name);
        person.setHeight(height);
        person.setWeight(weight);
        return person;
    }

    @Override
    public void buildName() {
        name = "保险员";
    }

    @Override
    public void buildAge() {
        age = "25";
    }

    @Override
    public void builHeight() {
        height = 1.72;
    }

    @Override
    public void buildWeight() {
        weight = 60;
    }
}
