package com.gupao.pattern_service.pattern01_factory.abstractfactory;

import com.gupao.pattern_service.pattern01_factory.ICourse;
import com.gupao.pattern_service.pattern01_factory.INote;
import com.gupao.pattern_service.pattern01_factory.IVideo;

public interface IFactory {

	// 创建课程
	ICourse createCourse();

	// 创建笔记
	INote createNote();

	IVideo createVideo();

}
