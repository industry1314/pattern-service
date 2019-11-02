package com.gupao.pattern_service.pattern06_strategy.promotion;

public class CashBackStrategy implements PromotionStrategy {
    @Override
    public void executePromotion(Promotion promotion) {
        System.out.println("现金返现：正在进行" + promotion.getPromotionWay() + "活动，返现金额为：" + promotion.getAmount());
    }
}
