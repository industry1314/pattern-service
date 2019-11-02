package com.gupao.pattern_service.pattern03_prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeBean implements Cloneable {

	private int age;
	private String name;
	private List<String> hobbites;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getHobbites() {
		return hobbites;
	}

	public void setHobbites(List<String> hobbites) {
		this.hobbites = hobbites;
	}

	// 浅克隆，创建的对象基本属性完全一致，引用类型属性指向一个地址
	public static void main(String[] args) throws CloneNotSupportedException {
		PrototypeBean prototypeBean = getPrototypeBean();
		PrototypeBean clone = (PrototypeBean) prototypeBean.clone();

		System.out.println(prototypeBean.getAge() == clone.getAge());
		System.out.println(prototypeBean.getName().equals(clone.getName()));
		System.out.println(prototypeBean.getHobbites() + "" + clone.getHobbites());
		System.out.println(prototypeBean.getHobbites() == clone.getHobbites());
	}

	private static PrototypeBean getPrototypeBean() {
		PrototypeBean prototypeBean = new PrototypeBean();
		prototypeBean.setAge(18);
		prototypeBean.setName("home");
		List<String> hobbites = new ArrayList<String>();
		hobbites.add("唱歌");
		hobbites.add("吃零食");
		prototypeBean.setHobbites(hobbites);
		return prototypeBean;
	}
}
