package com.gupao.pattern_service.pattern04_proxy.dynamicproxy.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibMeipo implements MethodInterceptor {

	public Object getInstance(Class<?> clazz) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object object, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		before();
		Object obj = methodProxy.invokeSuper(object, objects);
		after();
		return obj;
	}

	private void before() {
		System.out.println("我是媒婆，我开始为这个girl物色对象。");
	}

	private void after() {
		System.out.println("我是媒婆，我为这个girl找到一个。");
	}
}
