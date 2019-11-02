package com.gupao.pattern_service.pattern01_factory.simplefactory;

import com.gupao.pattern_service.pattern01_factory.ICourse;
import com.gupao.pattern_service.pattern01_factory.JavaCourse;
import com.gupao.pattern_service.pattern01_factory.PythonCourse;

public class CourseFactory {

	public ICourse getCourseByStringName(String courseName) {
		if ("java".equals(courseName)) {
			return new JavaCourse();
		} else if ("python".equals(courseName)) {
			return new PythonCourse();
		}
		return null;
	}

	public ICourse getCourseByClassName(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		if (className != null && !"".equals(className)) {
			return (ICourse) Class.forName(className).newInstance();
		}
		return null;
	}

	public ICourse getCourseByClass(Class<?> clazz) throws IllegalAccessException, InstantiationException {
		if (clazz != null) {
			return (ICourse) clazz.newInstance();
		}
		return null;
	}
}
