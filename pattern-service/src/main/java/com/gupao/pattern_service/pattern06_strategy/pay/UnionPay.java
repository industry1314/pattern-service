package com.gupao.pattern_service.pattern06_strategy.pay;

public class UnionPay implements Payment {
	@Override
	public String getName() {
		return "云闪付";
	}

	@Override
	public double getBalance() {
		return 500;
	}

	@Override
	public PayResult pay(double amount) {
		System.out.println("正在进行云闪付支付");
		if (amount > getBalance()) {
			return new PayResult("500", "余额不足，支付失败", "余额不足，支付失败");
		}
		return new PayResult("200", "支付成功", "使用云闪付支付成功，支付金额为:" + amount);
	}
}
