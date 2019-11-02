package com.gupao.pattern_service.pattern01_factory.factorymethod;

import com.gupao.pattern_service.pattern01_factory.ICourse;

public interface CourseFactory {
    // 创建课程
    ICourse createCourse();
}
