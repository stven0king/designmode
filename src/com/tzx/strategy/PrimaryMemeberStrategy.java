package com.tzx.strategy;

/**
 * Created by tanzhenxing on 17-4-25.
 * 初级会员价格
 */
public class PrimaryMemeberStrategy implements MemberStrategy{

    /**
     * 计算图书的价格
     * @param booksPrice 图书的原价
     * @return 计算出打折后的价格
     */
    public double calcPrice(double booksPrice) {
        System.out.println("对于初级会员没有折扣");
        return booksPrice;
    }
}
