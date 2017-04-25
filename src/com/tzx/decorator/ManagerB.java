package com.tzx.decorator;

/**
 * Created by tanzhenxing on 17-4-25.
 */
public class ManagerB extends Manager {
    private Person person;//给雇员升职

    public ManagerB(Person person) {
        super();
        this.person = person;
    }

    @Override
    public void doCoding() {
        person.doCoding();
        doEndWork();
    }

    public void doEndWork() {
        System.out.println("项目经理B在做收尾工作。。。");
    }
}
