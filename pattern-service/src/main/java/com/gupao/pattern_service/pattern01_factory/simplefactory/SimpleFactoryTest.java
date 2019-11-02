package com.gupao.pattern_service.pattern01_factory.simplefactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gupao.pattern_service.pattern01_factory.ICourse;
import com.gupao.pattern_service.pattern01_factory.JavaCourse;

/**
 * 简单工厂测试类
 */
public class SimpleFactoryTest {

	public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
		// 基本方式
		// ICourse course = new JavaCourse();
		// course.haveClass();

		// 简单工厂方式1
		CourseFactory factory = new CourseFactory();
		ICourse javaCourse1 = factory.getCourseByStringName("java");
		if (javaCourse1 != null) {
			javaCourse1.haveClass();
		}

		ICourse javaCourse2 = factory.getCourseByClassName("com.gupao.pattern_service.factory.JavaCourse");
		if (javaCourse2 != null) {
			javaCourse2.haveClass();
		}

		ICourse javaCourse3 = factory.getCourseByClass(JavaCourse.class);
		if (javaCourse3 != null) {
			javaCourse3.haveClass();
		}

		Logger logger = LoggerFactory.getLogger(SimpleFactoryTest.class);
		logger.debug("我正在练习简单工厂");
	}
}
