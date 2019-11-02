package com.gupao.pattern_service.pattern06_strategy.pay;

public class PayStrategyTest {

	public static void main(String[] args) {
		System.out.println(PayStrategy.getPayment(PayStrategy.Payway.ALIPAY).pay(100));
		System.out.println(PayStrategy.getPayment(PayStrategy.Payway.UNIONPAY).pay(200));
		System.out.println(PayStrategy.getPayment(PayStrategy.Payway.WECHATPAY).pay(300));
	}
}
