package com.tzx.prototype;

public class ConcretePrototype implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //最简单的克隆，新建一个自身对象，由于没有属性就不再复制值了
        Object prototype = new ConcretePrototype();
        return prototype;
    }
}
