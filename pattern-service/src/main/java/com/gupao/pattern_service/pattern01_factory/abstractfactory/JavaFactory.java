package com.gupao.pattern_service.pattern01_factory.abstractfactory;

import com.gupao.pattern_service.pattern01_factory.ICourse;
import com.gupao.pattern_service.pattern01_factory.INote;
import com.gupao.pattern_service.pattern01_factory.IVideo;
import com.gupao.pattern_service.pattern01_factory.JavaCourse;
import com.gupao.pattern_service.pattern01_factory.JavaNote;
import com.gupao.pattern_service.pattern01_factory.JavaVideo;

public class JavaFactory implements IFactory {

	@Override
	public ICourse createCourse() {
		return new JavaCourse();
	}

	@Override
	public INote createNote() {
		return new JavaNote();
	}

	@Override
	public IVideo createVideo() {
		return new JavaVideo();
	}

}
