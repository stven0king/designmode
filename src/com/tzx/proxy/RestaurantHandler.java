package com.tzx.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by im on 17-3-13.
 * 代理模式(静态代理&动态代理)
 */
public class RestaurantHandler implements InvocationHandler {
    private Object targetObject;

    public RestaurantHandler(Object targetObject) {
        this.targetObject = targetObject;
    }

    public Object newProxyInstatnce() {
        return Proxy.newProxyInstance(this.targetObject.getClass().getClassLoader(),
                this.targetObject.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object ret = null;
        try {
            ret = method.invoke(this.targetObject, args);
            System.out.println(method.getGenericReturnType().toString());
            System.out.println("ret=" + ret.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }
}
