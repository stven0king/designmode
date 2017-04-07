package com.tzx.component;

/**
 * Created by im on 17-3-13.
 * 组合模式(当发现需求中是体现部分与整体层次结构时，
 * 以及你希望用户可以忽略组合对象与单个对象的不同，
 * 统一地使用组合结构中的所有对象时，就应该考虑组合模式了。)
 */
public class Main {
    public static void main(String[] args) {
        Component component = new Composite("根节点");
        Component child = new Composite("一级子节点");
        Component child_1 = new Leaf("一级子节点之一");
        Component child_2 = new Leaf("一级子节点之二");
        child.add(child_1);
        child.add(child_2);
        Component child2 = new Composite("一级子节点2");
        component.add(child);
        component.add(child2);
        component.foreach();
    }
}
