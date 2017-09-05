package com.tzx.chainOfResponsibility;

/**
 * Created by tanzhenxing on 17-9-5.
 * 职责任链模式（Chain of Responsibiblity）：使多个对象都有机会处理请求，从而避免请求的发送者和接受者之前的耦合关系。
 * 将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 *
 * 抽象处理者（handler）角色、定义出一个处理请求的接口；如果需要，接口可以定义出一个方法，以返回对下家的引用。
 * 负责规定具体处理者处理用户请求的方法以及具体处理者设置后续处理的方法。
 *
 * 具体处理者（ConcreateHandler）角色、处理接受到请求后，可以选择将请求处理掉，或者将请求传给下家。
 * 实现处理接口的类的实例，具体处理者通过调用处理接口规定的方法处理用户请求，既在接到用户请求后，处理者将调用接口规定的方法
 * 在执行方法的过程中，如果发现处理用户的请求。如果发现处理不了就交给下一个处理者进行处理。
 *
 * 适合使用责任链式的情况：
 * 1、在许多对象可以处理用户请求的时候
 * 2、希望用户不必明确处理的时候，同时向多个处理者发送请求
 * 3、程序希望动态的定制可处理用户请求的集合对象
 */
public class Main {
    public static void main(String[] args) {
        Handler jisuanji, wenxue;
        jisuanji = new JiSuanJi();
        wenxue = new WenXue();

        jisuanji.setNexHandler(wenxue);

        jisuanji.Search(1);

    }
}
