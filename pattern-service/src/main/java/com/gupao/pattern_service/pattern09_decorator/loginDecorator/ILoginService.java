package com.gupao.pattern_service.pattern09_decorator.loginDecorator;

public interface ILoginService {

    /**
     * 按照用户ID登录
     *
     * @param id
     * @param password
     * @return
     */
    JsonResult loginByID(String id, String password);

    /**
     * 按照手机号登录
     *
     * @param phoneNumber
     * @param password
     * @return
     */
    JsonResult loginByPhoneNumber(String phoneNumber, String password);

}
