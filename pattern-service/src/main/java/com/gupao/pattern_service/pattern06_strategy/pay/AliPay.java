package com.gupao.pattern_service.pattern06_strategy.pay;

public class AliPay implements Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    public double getBalance() {
        return 300;
    }

    @Override
    public PayResult pay(double amount) {
        System.out.println("正在进行支付宝支付");
        if (amount > getBalance()) {
            return new PayResult("500", "余额不足，支付失败", "余额不足，支付失败");
        }
        return new PayResult("200", "支付成功", "使用支付宝支付成功，支付金额为:" + amount);
    }
}
