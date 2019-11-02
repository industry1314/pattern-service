package com.gupao.pattern_service.pattern01_factory;

public class JavaNote implements INote {
	
	@Override
	public void writeNote() {
		System.out.println("创建JAVA笔记");
	}
	
}
