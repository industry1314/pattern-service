package com.gupao.pattern_service.pattern09_decorator.loginDecorator;

public class JsonResult {

	private String code;
	private String message;
	private Object data;

	public JsonResult(String code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	@Override
	public String toString() {
		return "JsonResult{" + "code='" + code + '\'' + ", message='" + message + '\'' + ", data=" + data + '}';
	}
}
