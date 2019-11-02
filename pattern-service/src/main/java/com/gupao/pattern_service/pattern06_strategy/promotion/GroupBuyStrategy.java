package com.gupao.pattern_service.pattern06_strategy.promotion;

public class GroupBuyStrategy implements PromotionStrategy {
    @Override
    public void executePromotion(Promotion promotion) {
        System.out.println("团购：正在进行" + promotion.getPromotionWay() + "活动，团购优惠金额为：" + promotion.getAmount());
    }
}
