package com.gupao.pattern_service.pattern07_template;

public class JavaCourse extends NetCourse {
    @Override
    protected void checkHomework() {
        System.out.println("检查Java作业");
    }
}
