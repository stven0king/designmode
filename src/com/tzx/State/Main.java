package com.tzx.State;

/**
 * Created by tanzhenxing on 17-5-31.
 *
 * 状态模式（State）：当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。
 *
 * 状态模式主要解决的是当控制一个对象的状态转化的条件表达式国语复杂时的情况。
 * 把状态的判断逻辑转移到表示不同状态的一系列类当中，可以把负责的判断逻辑简单化。
 *
 * 环境（Context)角色，也成上下文：定义客户端所感兴趣的接口，并且保留一个具体状态类的实例。这个具体状态类的实例给出此环境对象的现有状态。
 *
 * 抽象状态（State）角色：定义一个接口，用以封装环境（Context）对象的一个特定的状态所对应的行为。
 *
 * 具体状态（ConcreateState）角色：每一ugejuti状态类都实现了环境（Context）的一个状态所对应的行为。
 */
public class Main {
    public static void main(String[] args) {
        State state = new ConcreteStateA();
        Context context = new Context();
        context.setState(state);
        context.request("test");
    }
}
