package com.tzx.decorator;

/**
 * Created by tanzhenxing on 17-4-25.
 */
public class ManagerA extends Manager {
    private Person person;//给雇员升职

    public ManagerA(Person person) {
        super();
        this.person = person;
    }

    @Override
    public void doCoding() {
        doEaryWork();
        person.doCoding();
    }

    public void doEaryWork() {
        System.out.println("项目经理A做需求分析");
        System.out.println("项目经理A做架构设计");
        System.out.println("项目经理A做详细设计");
    }
}
