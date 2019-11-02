package com.gupao.pattern_service.pattern09_decorator.pancakeDecorator;

public class EggPanCakeDecorator extends PanCakeDecorator {

	public EggPanCakeDecorator(PanCake panCake) {
		super(panCake);
	}

	@Override
	String getContent() {
		return super.getContent() + "+一个鸡蛋";
	}

	@Override
	int getPrice() {
		return super.getPrice() + 2;
	}
}
