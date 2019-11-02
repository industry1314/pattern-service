package com.gupao.pattern_service.pattern10_observer;

import java.util.Observable;

public class GPer extends Observable {

	public static String name = "GPer生态圈";

	private static GPer instance = new GPer();

	private GPer() {
	}

	public static GPer getInstance() {
		return instance;
	}

	public void publishGper(Question question) {
		String userName = question.getUserName();
		String content = question.getContent();
		System.out.println(userName + "在" + name + "提出了一个问题：" + content);
		setChanged();
		notifyObservers(question);
	}

	public String getName() {
		return name;
	}
}
