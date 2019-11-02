package com.gupao.pattern_service.pattern09_decorator.pancakeDecorator;

public class SausagePanCakeDecorator extends PanCakeDecorator {

	public SausagePanCakeDecorator(PanCake panCake) {
		super(panCake);
	}

	@Override
	String getContent() {
		return super.getContent() + "+一根香肠";
	}

	@Override
	int getPrice() {
		return super.getPrice() + 3;
	}
}
