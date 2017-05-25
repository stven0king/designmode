package com.tzx.facade;

/**
 * Created by tanzhenxing on 17-5-25.
 */
public class MyFacade {
    private static Camara c1, c2;
    private static Light l1, l2;
    private static Sensor s;

    static {
        c1 = new Camara();
        c2 = new Camara();
        l1 = new Light();
        l2 = new Light();
        s = new Sensor();
    }

    public static void activate() {
        c1.trunOn();
        c2.trunOn();

        l1.trunOn();
        l2.trunOn();

        s.activate();
    }

    public static void deactivate() {
        c1.trunOff();
        c2.trunOff();

        l1.trunOff();
        l2.trunOff();

        s.deactivate();
    }
}
