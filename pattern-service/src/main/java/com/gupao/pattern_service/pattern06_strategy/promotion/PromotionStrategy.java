package com.gupao.pattern_service.pattern06_strategy.promotion;

/**
 * 促销策略顶层接口
 */
public interface PromotionStrategy {

    /**
     * 执行促销活动
     */
    void executePromotion(Promotion promotion);
}
