package com.gupao.pattern_service.pattern06_strategy.promotion;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {

    private static Map<String, PromotionStrategy> STRATEGY = new HashMap<String, PromotionStrategy>();

    static {
        STRATEGY.put("Coupon", new CouponStrategy());
        STRATEGY.put("CashBack", new CashBackStrategy());
        STRATEGY.put("GroupBuy", new GroupBuyStrategy());
    }

    private PromotionStrategyFactory() {
    }

    public static PromotionStrategy getStrategy(String promotionKey) {
        return STRATEGY.get(promotionKey);
    }


}
