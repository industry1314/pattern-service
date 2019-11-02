package com.gupao.pattern_service.pattern05_delegate;

/**
 * 学习委员
 */
public class LearningCommissary {

    public void collectHomework(String className) throws Exception {
        if ("math".equals(className)) {
            new MathHomework().collectHomework(className);
        } else if ("english".equals(className)) {
            new EnglishHomework().collectHomework(className);
        } else {
            throw new Exception("科目不存在，请核对");
        }
    }
}
