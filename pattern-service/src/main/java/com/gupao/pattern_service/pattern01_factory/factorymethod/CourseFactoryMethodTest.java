package com.gupao.pattern_service.pattern01_factory.factorymethod;

import com.gupao.pattern_service.pattern01_factory.ICourse;

/**
 * 工厂方法测试类
 */
public class CourseFactoryMethodTest {

	public static void main(String[] args) {
		CourseFactory javaCourseFactory = new JavaCourseFactory();
		ICourse javaCourse = javaCourseFactory.createCourse();
		javaCourse.haveClass();

		CourseFactory pythonCourseFactory = new PythonCourseFactory();
		ICourse pythonCourse = pythonCourseFactory.createCourse();
		pythonCourse.haveClass();
	}
}
