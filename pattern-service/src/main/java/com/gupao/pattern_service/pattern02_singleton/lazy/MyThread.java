package com.gupao.pattern_service.pattern02_singleton.lazy;

public class MyThread implements Runnable {
	@Override
	public void run() {
		LazyBean instance = LazyBean.getInstance1();
		System.out.println(Thread.currentThread().getName() + ":" + instance);
	}
}
