package com.gupao.pattern_service.pattern04_proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKMeipo implements InvocationHandler {

    private Person target;

    public Object getInstance(Person target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // before和after都是增强方法。
        before();
        Object invoke = method.invoke(target, args);
        after();
        return invoke;
    }

    private void before() {
        System.out.println("我是媒婆，我开始为这个girl物色对象。");
    }

    private void after() {
        System.out.println("我是媒婆，我为这个girl找到一个。");
    }
}
