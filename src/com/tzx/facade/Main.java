package com.tzx.facade;

/**
 * Created by tanzhenxing on 17-5-25.
 * 外观模式（Facade）,也叫门面模式,为了子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 */
public class Main {
    public static void main(String[] args) {
        MyFacade.activate();
        MyFacade.deactivate();
    }
}
