package com.tzx.observer;

/**
 * Created by tanzhenxing on 17-5-26.
 *
 * 抽象观察者角色类
 */
public interface Observer {

    /**
     * 更新接口
     * @param state 更新的状态
     */
    public void update(String state);
}
