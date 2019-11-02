package com.gupao.pattern_service.pattern04_proxy.dynamicproxy.cglibproxy;

public class CglibMeipoTest {

	public static void main(String[] args) {
		CglibMeipo cglibMeipo = new CglibMeipo();
		Customer instance = (Customer) cglibMeipo.getInstance(Customer.class);
		System.out.println(instance.getClass());
		instance.findLove();
	}
}
