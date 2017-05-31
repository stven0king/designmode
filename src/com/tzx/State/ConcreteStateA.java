package com.tzx.State;

/**
 * Created by tanzhenxing on 17-5-31.
 */
public class ConcreteStateA implements State {
    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreateStateA handle : " + sampleParameter);
    }
}
