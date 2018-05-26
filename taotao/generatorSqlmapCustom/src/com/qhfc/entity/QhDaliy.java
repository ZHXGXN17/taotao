package com.qhfc.entity;

public class QhDaliy {
    private String daliyId;

    private String userName;

    private String deptName;

    private String uploadTime;

    private String workContent;

    public String getDaliyId() {
        return daliyId;
    }

    public void setDaliyId(String daliyId) {
        this.daliyId = daliyId == null ? null : daliyId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime == null ? null : uploadTime.trim();
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent == null ? null : workContent.trim();
    }
}