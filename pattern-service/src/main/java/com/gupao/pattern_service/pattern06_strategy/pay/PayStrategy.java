package com.gupao.pattern_service.pattern06_strategy.pay;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {

    private static Map<String, Payment> PAY_STRATEGY = new HashMap<String, Payment>();

    static {
        PAY_STRATEGY.put(Payway.UNIONPAY, new UnionPay());
        PAY_STRATEGY.put(Payway.ALIPAY, new AliPay());
        PAY_STRATEGY.put(Payway.WECHATPAY, new WechatPay());
    }

    private PayStrategy() {
    }

    public static Payment getPayment(String payway) {
        if (PAY_STRATEGY.containsKey(payway)) {
            return PAY_STRATEGY.get(payway);
        }
        return PAY_STRATEGY.get(Payway.DEFAULT_PAY);
    }

    public interface Payway {
        String UNIONPAY = "UNIONPAY";
        String WECHATPAY = "WECHATPAY";
        String ALIPAY = "ALIPAY";
        String DEFAULT_PAY = UNIONPAY;
    }
}
