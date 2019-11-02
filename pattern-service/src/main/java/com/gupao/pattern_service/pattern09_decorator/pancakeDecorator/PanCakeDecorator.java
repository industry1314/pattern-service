package com.gupao.pattern_service.pattern09_decorator.pancakeDecorator;

public class PanCakeDecorator extends PanCake {

	private PanCake panCake; // 被装饰对象

	public PanCakeDecorator(PanCake panCake) {
		this.panCake = panCake;
	}

	@Override
	String getContent() {
		return this.panCake.getContent();
	}

	@Override
	int getPrice() {
		return this.panCake.getPrice();
	}
}
