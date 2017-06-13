package com.tzx.adapter;

/**
 * Created by tanzhenxing on 17-6-13.
 */
public interface Target {
    /**
     * 这个是源类Adaptee也有的方法
     */
    public void sampleOperation1();

    /**
     * 这个是源类Adaptee也没有的方法
     */
    public void sampleOperation2();
}
