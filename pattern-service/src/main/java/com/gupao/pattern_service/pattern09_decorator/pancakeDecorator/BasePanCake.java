package com.gupao.pattern_service.pattern09_decorator.pancakeDecorator;

public class BasePanCake extends PanCake {

	@Override
	String getContent() {
		return "煎饼";
	}

	@Override
	int getPrice() {
		return 5;
	}
}
