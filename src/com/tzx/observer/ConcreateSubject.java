package com.tzx.observer;

/**
 * Created by tanzhenxing on 17-5-26.
 *
 * 具体的主题角色类
 */
public class ConcreateSubject extends Subject {

    private String state;

    public String getState() {
        return state;
    }

    public void change(String newState) {
        state = newState;
        System.out.println("主题状态为：" + state);
        this.notifyObservers(state);
    }
}
