package com.gupao.pattern_service.pattern01_factory.factorymethod;

import com.gupao.pattern_service.pattern01_factory.ICourse;
import com.gupao.pattern_service.pattern01_factory.JavaCourse;

public class JavaCourseFactory implements CourseFactory {

	@Override
	public ICourse createCourse() {
		return new JavaCourse();
	}

}
