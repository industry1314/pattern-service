package com.gupao.pattern_service.pattern07_template;

public class BigDataCourse extends NetCourse {

    private boolean hasHomework = false;

    public BigDataCourse(boolean hasHomework){
        this.hasHomework = hasHomework;
    }
    @Override
    protected void checkHomework() {
        System.out.println("检查大数据作业");
    }

    @Override
    protected boolean hasHomework() {
        return hasHomework;
    }
}
