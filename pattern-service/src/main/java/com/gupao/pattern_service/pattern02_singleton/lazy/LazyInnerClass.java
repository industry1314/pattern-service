package com.gupao.pattern_service.pattern02_singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * 内部类模式，利用了类加载的机制来保证单例
 * <p>
 * 性能最优的写法
 */
public class LazyInnerClass {

	private LazyInnerClass() {
		if (LazyHolder.INSTANCE != null) {
			throw new RuntimeException("实例已存在，不可创建多个实例");
		}
	}

	// LazyHolder中的逻辑只有当外部方法访问的时候才会执行
	// 懒汉式单例模式
	// JVM底层执行逻辑，利用内部类的特性，巧妙避免开了线程安全问题
	public static LazyInnerClass getInstance() {
		return LazyHolder.INSTANCE;
	}

	private static class LazyHolder {
		private static final LazyInnerClass INSTANCE = new LazyInnerClass();
	}

	public static void main(String[] args) {
		// innerClassMain();
		innerClassReflectMain();
	}

	/**
	 * 使用内部类单例模式
	 */
	public static void innerClassMain() {
		LazyInnerClass lazyInnerClassModel = LazyInnerClass.getInstance();
		System.out.println(lazyInnerClassModel);
	}

	// 通过反射方式强制生成新的对象，破坏单例特性。但是有方法来避免这种入侵，在私有构造方法中加校验。
	public static void innerClassReflectMain() {
		System.out.println(LazyInnerClass.getInstance());
		Class<?> clazz = LazyInnerClass.class;
		// Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
		try {
			Constructor<?> constructor = clazz.getDeclaredConstructor();
			constructor.setAccessible(true);
			Object instance = constructor.newInstance();
			System.out.println(instance);

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Object newInstance = clazz.newInstance();
			System.out.println(newInstance);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
