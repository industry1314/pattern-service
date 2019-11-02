package com.gupao.pattern_service.pattern10_observer;

public class Question {

    private String userName; // 提问者名称
    private String content; // 问题内容

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
