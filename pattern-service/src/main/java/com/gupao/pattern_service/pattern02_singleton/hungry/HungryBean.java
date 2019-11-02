package com.gupao.pattern_service.pattern02_singleton.hungry;

/**
 * 饿汉式单例模式
 */
public class HungryBean {

	// 方式1：
	// private static final HungryBean instance = new HungryBean();

	private static final HungryBean instance;

	// 方式2：使用静态代码块
	static {
		instance = new HungryBean();
	}

	private HungryBean() {
	}

	public static HungryBean getInstance() {
		return instance;
	}

	// 饿汉式返回的永远都是同一个实例
	public static void main(String[] args) {
		HungryBean instance1 = HungryBean.getInstance();
		HungryBean instance2 = HungryBean.getInstance();
		HungryBean instance3 = HungryBean.getInstance();
		System.out.println(instance1);
		System.out.println(instance2);
		System.out.println(instance3);
	}

}
