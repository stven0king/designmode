package com.tzx.proxy;

/**
 * Created by im on 17-3-13.
 */
public class SellRiceImplProxy implements SellRice {
    private SellRice sellRice;

    public SellRiceImplProxy(SellRice sellRice) {
        this.sellRice = sellRice;
    }

    @Override
    public boolean sell() {
        return sellRice.sell();
    }
}
