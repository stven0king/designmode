package com.tzx.proxy;

/**
 * Created by im on 17-3-13.
 * 代理模式：为其他对象提供一种代理以控制对这个对象的访问。
 *
 * 代理模式就是为一个对象提供一个代理并控制着对这个对象的访问。
 * 并且被代理对象对于客户端代码是透明的。
 * 就像最后这个栗子中，客户端代码并不知道真实的追求者是谁。
 * 代理类控制着真实追求着的访问，当然也可以添加一些功能什么的（就像装饰模式那样）。
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