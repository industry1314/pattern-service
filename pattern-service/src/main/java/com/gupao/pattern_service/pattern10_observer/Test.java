package com.gupao.pattern_service.pattern10_observer;

public class Test {

	public static void main(String[] args) {
		GPer gPer = GPer.getInstance();
		Question question = new Question();
		question.setUserName("小明");
		question.setContent("观察者设计模式怎么使用？");

		Teacher xiaoma = new Teacher("小马");
		Teacher lilei = new Teacher("李磊");
		gPer.addObserver(xiaoma);
		gPer.addObserver(lilei);
		gPer.publishGper(question);
	}
}
