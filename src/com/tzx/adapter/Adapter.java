package com.tzx.adapter;

/**
 * Created by tanzhenxing on 17-6-13.
 */
public class Adapter extends Adaptee implements Target {

    /**
     * 由于源类Adaptee没有方法sampleOperation2（）
     * 因此适配器补上了这个方法
     */
    @Override
    public void sampleOperation2() {

    }
}
