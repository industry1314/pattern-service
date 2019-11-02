package com.gupao.pattern_service.pattern05_delegate;

public class EnglishHomework implements ICourseHomework {
    @Override
    public void collectHomework(String className) {
        System.out.println("收作业啦，科目名称为：" + className);
    }
}
