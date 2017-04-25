package com.tzx.strategy;

/**
 * Created by tanzhenxing on 17-4-25.
 * 策略模式（Strategy）:它定义了算法家族，分别分装起来，让他们之间可以相互替换，
 * 次模式让算法的变化，不会影响到使用算法的客户。
 */
public class Main {
    public static void main(String args[]) {
        MemberStrategy strategy = new AdvancedMemberStrategy();

        Price price = new Price(strategy);

        double quote = price.qutoe(300);
        System.out.println("图书的最终价格为：" + quote);
    }
}
