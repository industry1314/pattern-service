package com.gupao.pattern_service.pattern05_delegate;

public class MathHomework implements ICourseHomework {
    @Override
    public void collectHomework(String className) {
        System.out.println("收作业啦，科目名称为：" + className);
    }
}
