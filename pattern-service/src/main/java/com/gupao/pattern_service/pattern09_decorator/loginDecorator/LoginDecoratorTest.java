package com.gupao.pattern_service.pattern09_decorator.loginDecorator;

public class LoginDecoratorTest {

	public static void main(String[] args) {
		LoginServiceByThird loginService = new LoginServiceByThird(new LoginServiceImpl());
		loginService.loginByID("", "");
		loginService.loginByPhoneNumber("", "");
		loginService.loginByQQ("", "");
		loginService.loginByWeChat("", "");
	}
}
