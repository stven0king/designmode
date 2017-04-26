package com.tzx.decorator;

/**
 * Created by tanzhenxing on 17-4-25.
 * 装饰模式：动态第给一个对象添加一些额外的职责，就增加功能来说，装饰模式币生成子类更为灵活。
 *
 * 装饰模式可以说就是在已有功能的基础上添加更多的功能，
 * 把每个要添加的功能都放在一个单独的类中，
 * 并让这个类包装被装饰对象，
 * 然后在执行特定任务时，
 * 客户端代码就可以在运行时根据需要自由组合，按顺序地使用这些装饰功能。
 */
public class Main {
    public static void main(String args[]) {
        Person employee = new Employee();
        employee = new ManagerA(employee);
        employee = new ManagerB(employee);
        employee.doCoding();
    }
}
