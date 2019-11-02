package com.gupao.pattern_service.pattern06_strategy.promotion;

/**
 * 优惠活动,执行优惠活动的时候，根据promotion判定使用怎么的优惠策略
 */
public class PromotionActivity {

    public void promotionExecute(Promotion promotion) {
        String promotionWay = promotion.getPromotionWay();
        PromotionStrategy couponStrategy = null;
        if ("Coupon".equals(promotionWay)) {
        	couponStrategy = new CouponStrategy();
        } else if ("CachBack".equals(promotionWay)) {
            couponStrategy = new CashBackStrategy();
        }
        couponStrategy.executePromotion(promotion);
    }

    /**
     * 使用工厂模式
     *
     * @param promotion
     */
    public void promotionExecute2(Promotion promotion) {
        String promotionWay = promotion.getPromotionWay();
        PromotionStrategy strategy = PromotionStrategyFactory.getStrategy(promotionWay);
        strategy.executePromotion(promotion);
    }
}
