package com.gupao.pattern_service.pattern06_strategy.promotion;

/**
 * 代金券促销策略
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void executePromotion(Promotion promotion) {
        System.out.println("优惠券：正在进行" + promotion.getPromotionWay() + "活动，优惠金额为：" + promotion.getAmount());
    }
}
