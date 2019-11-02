package com.gupao.pattern_service.pattern04_proxy.staticproxy;

public class StaticProxyTest {

	public static void main(String[] args) {
		TicketBuyer ticketBuyer = new TicketBuyer("购票人李狗蛋");
		BuyerProxy buyerProxy = new BuyerProxy(ticketBuyer);
		buyerProxy.buy();
	}

}
