package com.gupao.pattern_service.pattern07_template;

public class NetClassTemplate {

	public static void main(String[] args) {
		NetCourse javaCourse = new JavaCourse();
		javaCourse.doCourse();
		System.out.println("================================");
		NetCourse bigDataCourse = new BigDataCourse(true);
		bigDataCourse.doCourse();
	}
}
