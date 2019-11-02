package com.gupao.pattern_service.pattern01_factory.factorymethod;

import com.gupao.pattern_service.pattern01_factory.ICourse;
import com.gupao.pattern_service.pattern01_factory.PythonCourse;

public class PythonCourseFactory implements CourseFactory {

	@Override
	public ICourse createCourse() {
		return new PythonCourse();
	}

}
