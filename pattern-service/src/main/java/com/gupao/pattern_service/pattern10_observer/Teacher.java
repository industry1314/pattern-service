package com.gupao.pattern_service.pattern10_observer;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {

	private String name;

	public Teacher(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		GPer gPer = (GPer) o;
		Question question = (Question) arg;
		System.out.println("==============================");
		System.out.println(name + "老师你好，您在" + gPer.getName() + "收到了一个来自'" + question.getUserName() + "'的提问：'" + question.getContent() + "'");
	}
}
