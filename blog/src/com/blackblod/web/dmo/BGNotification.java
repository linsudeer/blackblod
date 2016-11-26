package com.blackblod.web.dmo;

public class BGNotification {
    private String oId;

    private String userId;

    private String dataId;

    private Integer dataType;

    private String hasRead;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public String getHasRead() {
        return hasRead;
    }

    public void setHasRead(String hasRead) {
        this.hasRead = hasRead;
    }
}