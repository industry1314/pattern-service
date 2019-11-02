package com.gupao.pattern_service.pattern02_singleton.serializable;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {

	private static final long serialVersionUID = -4253708430671957566L;

	private SeriableSingleton() {

	}

	private static SeriableSingleton INSTANCE = new SeriableSingleton();

	public static SeriableSingleton getInstance() {
		return INSTANCE;
	}

	// 注意这里返回的类型是Object，而不是SeriableSingleton
	public Object readResolve() {
		return INSTANCE;
	}
	
	

}
