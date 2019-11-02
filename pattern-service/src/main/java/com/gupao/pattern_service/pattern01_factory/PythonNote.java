package com.gupao.pattern_service.pattern01_factory;

public class PythonNote implements INote {
	@Override
	public void writeNote() {
		System.out.println("创建Python笔记");
	}
}
