package com.tzx.observer;

/**
 * Created by tanzhenxing on 17-5-26.
 */
public class ConcreateObserver implements Observer {
    private String observerState;
    @Override
    public void update(String state) {
        observerState= state;
        System.out.println("状态为：" + observerState);
    }
}
