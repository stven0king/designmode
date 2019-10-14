package com.tzx.prototype;

/**
 * Created by tanzhenxing on 17-4-26.
 *
 * 原型模式（Prototype）用原型实例指定创建对象的种类，并且通过拷贝这些原型对象创建新的对象。
 */
public class Main {
    /**
     * 持有需要使用的原型接口对象
     */
    private Prototype prototype;
    /**
     * 构造方法，传入需要使用的原型接口对象
     */
    public Main(Prototype prototype){
        this.prototype = prototype;
    }
    public void operation(Prototype example) throws CloneNotSupportedException {
        //需要创建原型接口的对象
        Prototype copyPrototype = prototype.clone();

    }
}
