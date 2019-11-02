package com.gupao.pattern_service.pattern09_decorator.pancakeDecorator;

/**
 * 煎饼
 */
public abstract class PanCake {

	/**
	 * 煎饼套餐内容
	 * 
	 * @return
	 */
	abstract String getContent();

	/**
	 * 价格
	 * 
	 * @return
	 */
	abstract int getPrice();
}
