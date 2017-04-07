package com.tzx.proxy;

/**
 * Created by im on 17-3-13.
 */
public class Main {
    public static void main(String[] args) {
        SellRice sellRice = new SellRiceImpl();
        SellRiceImplProxy proxy = new SellRiceImplProxy(sellRice);
        proxy.sell();

        RestaurantHandler handler = new RestaurantHandler(sellRice);
        SellRice cell = (SellRice) handler.newProxyInstatnce();
        cell.sell();
    }
}
