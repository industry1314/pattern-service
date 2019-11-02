package com.gupao.pattern_service.pattern02_singleton.threadlocal;

/**
 * 注册式（容器式） ThreadLocal是伪线程安全的，只在线程内安全，多个线程时获取的实例会不一样，也就是跨线程不安全
 * ThreadLocal底层是以线程为key，以实例对象为value，所以跨线程不安全，同一线程内部安全。
 *
 * ORM时会讲ThreadLocal实现多数据源切换
 */
public class ThreadLocalSingleton {

	private ThreadLocalSingleton() {
	}

	private static ThreadLocalSingleton INSTANCE = new ThreadLocalSingleton();

	private static ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>() {
		@Override
		protected ThreadLocalSingleton initialValue() {
			// 这种写法全局安全
			return INSTANCE;
			// 这种写法线程内安全
			// return new ThreadLocalSingleton();
		}
	};

	public static ThreadLocalSingleton getInstance() {
		return threadLocalInstance.get();
	}

	public static void main(String[] args) {
		String mainThreadName = Thread.currentThread().getName();
		System.out.println(mainThreadName + " : " + ThreadLocalSingleton.getInstance());
		System.out.println(mainThreadName + " : " + ThreadLocalSingleton.getInstance());
		System.out.println(mainThreadName + " : " + ThreadLocalSingleton.getInstance());
		System.out.println(mainThreadName + " : " + ThreadLocalSingleton.getInstance());
		System.out.println(mainThreadName + " : " + ThreadLocalSingleton.getInstance());

		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " : " + ThreadLocalSingleton.getInstance());
				System.out.println(Thread.currentThread().getName() + " : " + ThreadLocalSingleton.getInstance());
				System.out.println(Thread.currentThread().getName() + " : " + ThreadLocalSingleton.getInstance());
				System.out.println(Thread.currentThread().getName() + " : " + ThreadLocalSingleton.getInstance());
			}
		};
		t1.start();
		Thread t2 = new Thread() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " : " + ThreadLocalSingleton.getInstance());
				System.out.println(Thread.currentThread().getName() + " : " + ThreadLocalSingleton.getInstance());
				System.out.println(Thread.currentThread().getName() + " : " + ThreadLocalSingleton.getInstance());
				System.out.println(Thread.currentThread().getName() + " : " + ThreadLocalSingleton.getInstance());
			}
		};
		t2.start();
	}
}
