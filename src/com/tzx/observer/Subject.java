package com.tzx.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanzhenxing on 17-5-26.
 * 抽象主题角色类
 */
public abstract class Subject {
    /**
     * 用来保存注册的观察者对象
     */
    private List<Observer> list = new ArrayList<Observer>();

    /**
     * 注册观察者对象
     * @param observer 观察者对象
     */
    public void attach(Observer observer) {
        list.add(observer);
        System.out.println("Attach an observer~!");
    }

    /**
     * 删除观察者对象
     * @param observer 观察者对象
     */
    public void detach(Observer observer) {
        list.remove(observer);
        System.out.println("detach an observer!");
    }

    /**
     * 通知所有注册的观察者对象
     * @param newState
     */
    public void notifyObservers(String newState) {
        for (Observer observer: list) {
            observer.update(newState);
        }
    }
}
