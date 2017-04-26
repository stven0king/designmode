package com.tzx.templatemethod;

/**
 * Created by tanzhenxing on 17-4-26.
 */
public abstract class TestPaper {
    public void TestQuestion1() {
        System.out.println("TestQuestion1:" + Answer1());
    }
    public void TestQuestion2() {
        System.out.println("TestQuestion2:" + Answer2());
    }
    public void TestQuestion3() {
        System.out.println("TestQuestion3:" + Answer3());
    }

    public abstract String Answer1();
    public abstract String Answer2();
    public abstract String Answer3();
}
