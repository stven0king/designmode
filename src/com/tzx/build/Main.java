package com.tzx.build;

public class Main {

    public static void main(String[] args) {
        Builder builder = new Employee();//创建一个Builder对象
        Director director = new Director();//创建一个Director对象
        director.product(builder);//Director对象造车
        builder.create();//将制造的车返回
    }
}
