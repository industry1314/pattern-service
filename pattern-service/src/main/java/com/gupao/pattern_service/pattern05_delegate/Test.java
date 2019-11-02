package com.gupao.pattern_service.pattern05_delegate;

public class Test {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        LearningCommissary learningCommissary = new LearningCommissary();
        teacher.collectHomework(learningCommissary, "math");
        teacher.collectHomework(learningCommissary, "english");
        teacher.collectHomework(learningCommissary, "biology");
    }
}
