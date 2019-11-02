package com.gupao.pattern_service.pattern09_decorator.pancakeDecorator;

public class PanCakeDecoratorTest {

	public static void main(String[] args) {
		PanCake panCake = new BasePanCake();
		// 加一个鸡蛋
		panCake = new EggPanCakeDecorator(panCake);
		// 加一个鸡蛋
		panCake = new EggPanCakeDecorator(panCake);
		// 加一个香肠
		panCake = new SausagePanCakeDecorator(panCake);
		// 加一个香肠
		panCake = new SausagePanCakeDecorator(panCake);

		System.out.println(panCake.getContent() + "的价格为：" + panCake.getPrice());
	}
}
