package com.tzx.State;

/**
 * Created by tanzhenxing on 17-5-31.
 */
public class Context {
    private State state;
    public void setState(State state) {
        this.state = state;
    }

    public void request(String sampleParameter) {
        state.handle(sampleParameter);
    }
}
