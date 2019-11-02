package com.gupao.pattern_service.pattern02_singleton.lazy;

/**
 * 懒汉式
 */
public class LazyBean {

	private static LazyBean instance;

	private LazyBean() {
	}

	// 不安全
	public static LazyBean getInstance1() {
		if (instance == null) {
			instance = new LazyBean();
		}
		return instance;
	}

	// 安全,但是效率太低
	public synchronized static LazyBean getInstance2() {
		if (instance == null) {
			instance = new LazyBean();
		}
		return instance;
	}

	// 不安全
	public static LazyBean getInstance3() {
		if (instance == null) {
			synchronized (LazyBean.class) {
				instance = new LazyBean();
			}
		}
		return instance;
	}

	// 安全，双重检查锁
	public static LazyBean getInstance4() {
		if (instance == null) {
			synchronized (LazyBean.class) {
				if (instance == null) {
					instance = new LazyBean();
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		lazyMain();
		lazyMainThreadConflict();
	}

	/**
	 * 采用多线程方式，来测试线程安全问题。
	 */
	private static void lazyMainThreadConflict() {
		Thread thread1 = new Thread(new MyThread());
		Thread thread2 = new Thread(new MyThread());
		thread1.start();
		thread2.start();
		System.out.println("主线程执行完毕");
	}

	// getInstance1并列执行，返回的是同一个实例。但是多线程会出现不安全场景。
	private static void lazyMain() {
		LazyBean instance1 = LazyBean.getInstance1();
		LazyBean instance2 = LazyBean.getInstance1();
		LazyBean instance3 = LazyBean.getInstance1();
		System.out.println(instance1);
		System.out.println(instance2);
		System.out.println(instance3);
	}
}
