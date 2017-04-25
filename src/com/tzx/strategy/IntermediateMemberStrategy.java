package com.tzx.strategy;

/**
 * Created by tanzhenxing on 17-4-25.
 * 中级会员
 */
public class IntermediateMemberStrategy implements MemberStrategy {

    /**
     * 计算图书的价格
     * @param booksPrice 图书的原价
     * @return 计算出打折后的价格
     */
    public double calcPrice(double booksPrice) {
        System.out.println("对于中级会员的折扣为10%");
        return booksPrice * 0.9;
    }
}
