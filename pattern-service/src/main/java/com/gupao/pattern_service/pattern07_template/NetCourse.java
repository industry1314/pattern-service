package com.gupao.pattern_service.pattern07_template;

public abstract class NetCourse {

    public void doCourse() {
        //1.准备课前资料。制作PPT
        doPreSource();
        //2.直播上课，录制视频
        doLiveClass();
        //3.上传资料
        uploadResource();
        //4.布置作业
        assignHomework();
        //5.检查课后作业

        if (hasHomework()){
            checkHomework();
        }
    }

    private void doPreSource() {
        System.out.println("老师：准备课前资料。制作PPT");
    }

    private void doLiveClass() {
        System.out.println("老师：直播上课，录制视频");
    }

    private void uploadResource() {
        System.out.println("老师：上传资料");
    }

    private void assignHomework() {
        System.out.println("老师：布置作业");
    }

    // 模板方法，由子类来实现
    protected abstract void checkHomework();

    // 钩子方法，用于子类，让业务逻辑按需调整
    protected boolean hasHomework() {
        return false;
    }

}
