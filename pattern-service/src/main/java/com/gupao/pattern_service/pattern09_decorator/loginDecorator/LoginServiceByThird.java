package com.gupao.pattern_service.pattern09_decorator.loginDecorator;

public class LoginServiceByThird {

	ILoginService loginService;

	public LoginServiceByThird(ILoginService loginService) {
		this.loginService = loginService;
	}

	JsonResult loginByID(String id, String password) {
		return loginService.loginByID(id, password);
	}

	JsonResult loginByPhoneNumber(String phoneNumber, String password) {
		return loginService.loginByPhoneNumber(phoneNumber, password);
	}

	JsonResult loginByQQ(String qq, String password) {
		return null;
	}

	JsonResult loginByWeChat(String wechat, String password) {
		return null;
	}
}
