package com.gupao.pattern_service.pattern01_factory.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        IFactory javaFactory = new JavaFactory();
        javaFactory.createCourse().haveClass();
        javaFactory.createNote().writeNote();
        javaFactory.createVideo().recordVideo();

        Logger logger = LoggerFactory.getLogger(AbstractFactoryTest.class);
        logger.debug("====================华丽分割线=================");

        PythonFactory pythonFactory = new PythonFactory();
        pythonFactory.createCourse().haveClass();
        pythonFactory.createNote().writeNote();
        pythonFactory.createVideo().recordVideo();
    }
}
