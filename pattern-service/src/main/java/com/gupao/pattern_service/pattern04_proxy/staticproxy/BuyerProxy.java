package com.gupao.pattern_service.pattern04_proxy.staticproxy;

public class BuyerProxy implements Buyer {

    private TicketBuyer ticketBuyer;

    public BuyerProxy(TicketBuyer ticketBuyer){
        this.ticketBuyer = ticketBuyer;
    }
    @Override
    public void buy() {
        System.out.println("我是黄牛，专业帮助他人购票");
        ticketBuyer.buy();
        System.out.println("购票完成，非常happy");
    }
}
