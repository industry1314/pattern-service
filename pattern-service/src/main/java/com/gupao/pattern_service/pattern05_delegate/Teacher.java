package com.gupao.pattern_service.pattern05_delegate;

/**
 * 老师让学习委员收作业
 */
public class Teacher {

    public void collectHomework(LearningCommissary learningCommissary, String className){
        try {
            learningCommissary.collectHomework(className);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
