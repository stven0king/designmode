package com.tzx.decorator;

/**
 * Created by tanzhenxing on 17-4-25.
 */
public class Employee implements Person {
    @Override
    public void doCoding() {
        System.out.println("程序员加班写程序啊，写程序，终于写完了～！～！～！");
    }
}
