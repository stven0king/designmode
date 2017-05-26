package com.tzx.observer;

/**
 * Created by tanzhenxing on 17-5-25.
 *
 * 观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象在状态发生变化时，会通知所有观察者对象，使他们
 * 能够自动更新自己。
 *
 *  抽象主题（Subject）角色：抽象主题角色把所有观察者对象的引用保存在一个聚焦（比如ArrayList对像）里，每个主题都可以有任何数量的观察者。
 *  抽象主题提供一个解耦，可以增加和删除观察者对象，抽象主题角色又叫抽象被观察者（Observalbe)角色。
 *
 *  具体主题角色（ConcreateSubject）角色：将有关状态存入具体观察者对象；在具体主题的内部状态改变时，所有登记过的观察者发出通知。
 *  具体主题角色又叫做具体被观察者（concreate Observable)角色。
 *
 *  抽象观察者（Observer）角色：为所有的具体观察者定义一个接口，在得到主题的通知时更新自己，这个接口叫做更新接口。
 *
 *  具体观察者（concreateObserver)角色：存储与主题的状态自恰的状态。具体观察者角色抽象观察者角色要求的更新接口，以便使本身的状态与主题的状态像协调。
 *  如果需要，具体观察者橘色可以保持一个指向具体主题对象的引用。
 */
public class Main {
    public static void main(String[] args) {
        ConcreateSubject subject = new ConcreateSubject();
        Observer observer = new ConcreateObserver();
        subject.attach(observer);
        subject.change("new State~!");
    }
}
