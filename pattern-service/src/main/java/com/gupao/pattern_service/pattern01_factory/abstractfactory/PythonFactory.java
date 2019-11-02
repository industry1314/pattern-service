package com.gupao.pattern_service.pattern01_factory.abstractfactory;

import com.gupao.pattern_service.pattern01_factory.ICourse;
import com.gupao.pattern_service.pattern01_factory.INote;
import com.gupao.pattern_service.pattern01_factory.IVideo;
import com.gupao.pattern_service.pattern01_factory.PythonCourse;
import com.gupao.pattern_service.pattern01_factory.PythonNote;
import com.gupao.pattern_service.pattern01_factory.PythonVideo;

public class PythonFactory implements IFactory {

	@Override
	public ICourse createCourse() {
		return new PythonCourse();
	}

	@Override
	public INote createNote() {
		return new PythonNote();
	}

	@Override
	public IVideo createVideo() {
		return new PythonVideo();
	}

}
