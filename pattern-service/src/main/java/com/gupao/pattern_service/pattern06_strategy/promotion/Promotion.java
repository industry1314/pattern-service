package com.gupao.pattern_service.pattern06_strategy.promotion;

public class Promotion {

    private String promotionWay; // 活动名称
    private String amount; // 优惠金额

    public Promotion(String promotionWay, String amount) {
        this.promotionWay = promotionWay;
        this.amount = amount;
    }

    public String getPromotionWay() {
        return promotionWay;
    }

    public void setPromotionWay(String promotionWay) {
        this.promotionWay = promotionWay;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
