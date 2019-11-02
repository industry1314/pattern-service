package com.gupao.pattern_service.pattern04_proxy.dynamicproxy.jdkproxy;

public class JDKMeipoTest {

	public static void main(String[] args) {
		JDKMeipo meipo = new JDKMeipo();
		Person instance = (Person) meipo.getInstance(new Girl());
		System.out.println(instance.getClass().getName());
		instance.findLove();
	}
}
