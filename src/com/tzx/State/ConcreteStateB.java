package com.tzx.State;

/**
 * Created by tanzhenxing on 17-5-31.
 */
public class ConcreteStateB implements State {
    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateB handle : " + sampleParameter);
    }
}
