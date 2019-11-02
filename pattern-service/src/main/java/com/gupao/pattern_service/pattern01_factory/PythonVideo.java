package com.gupao.pattern_service.pattern01_factory;

public class PythonVideo implements IVideo {
	@Override
	public void recordVideo() {
		System.out.println("开始录制Python视频");
	}
}
