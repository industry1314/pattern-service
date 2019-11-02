package com.gupao.pattern_service.pattern01_factory;

public class PythonCourse implements ICourse {
	@Override
	public void haveClass() {
		System.out.println("开始上Python课程");
	}
}
