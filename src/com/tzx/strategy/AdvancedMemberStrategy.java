package com.tzx.strategy;

/**
 * Created by tanzhenxing on 17-4-25.
 * 高级会员折扣类
 */
public class AdvancedMemberStrategy implements MemberStrategy {

    /**
     * 计算图书的价格
     * @param booksPrice 图书的原价
     * @return 计算出打折后的价格
     */
    public double calcPrice(double booksPrice) {
        System.out.println("对于高级会员的折扣为20%");
        return booksPrice * 0.8;
    }
}
