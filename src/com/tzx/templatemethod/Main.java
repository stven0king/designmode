package com.tzx.templatemethod;

/**
 * Created by tanzhenxing on 17-4-26.
 *
 * 模板方法模式：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。
 * 模板方法是的子类可以不该便一个算法的结构即可重定义该算法的某些特定步骤。
 */
public class Main {

    public static void main(String[] args) {
        TestPaper studentA = new TestPageA();
        studentA.TestQuestion1();
        studentA.TestQuestion2();
        studentA.TestQuestion3();

        TestPaper studentB = new TestPageB();
        studentB.TestQuestion1();
        studentB.TestQuestion2();
        studentB.TestQuestion3();
    }
}
