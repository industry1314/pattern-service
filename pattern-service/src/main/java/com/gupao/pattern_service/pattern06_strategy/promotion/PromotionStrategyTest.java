package com.gupao.pattern_service.pattern06_strategy.promotion;

public class PromotionStrategyTest {

	public static void main(String[] args) {
		PromotionActivity promotionActivity = new PromotionActivity();
		promotionActivity.promotionExecute(new Promotion("Coupon", "5.0"));
		System.out.println("================方式2：=================");
		promotionActivity.promotionExecute2(new Promotion("Coupon", "5.0"));
		promotionActivity.promotionExecute2(new Promotion("CashBack", "2.0"));
		promotionActivity.promotionExecute2(new Promotion("GroupBuy", "3.0"));
	}
}
