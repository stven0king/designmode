package com.tzx.decorator;

/**
 * Created by tanzhenxing on 17-4-25.
 */
public class Main {
    public static void main(String args[]) {
        Person employee = new Employee();
        employee = new ManagerA(employee);
        employee = new ManagerB(employee);
        employee.doCoding();
    }
}
