package com.gupao.pattern_service.pattern06_strategy.pay;

/**
 * 支付接口
 */
public interface Payment {

	/**
	 * 获取支付方式
	 * 
	 * @return
	 */
	String getName();

	/**
	 * 获取余额
	 * 
	 * @return
	 */
	double getBalance();

	PayResult pay(double amount);
}
