package com.gupao.pattern_service.pattern04_proxy.staticproxy;

public class TicketBuyer implements Buyer {

    private String name;

    public TicketBuyer(String name) {
        this.name = name;
    }

    @Override
    public void buy() {
        System.out.println("我是" + name + "，我要买一张从人间到地狱的票");
    }
}
