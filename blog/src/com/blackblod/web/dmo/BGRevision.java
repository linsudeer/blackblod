package com.blackblod.web.dmo;

public class BGRevision {
    private String oId;

    private Integer revisionDataType;

    private String revisionDataId;

    private String revisionAuthorId;

    private String revisionData;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public Integer getRevisionDataType() {
        return revisionDataType;
    }

    public void setRevisionDataType(Integer revisionDataType) {
        this.revisionDataType = revisionDataType;
    }

    public String getRevisionDataId() {
        return revisionDataId;
    }

    public void setRevisionDataId(String revisionDataId) {
        this.revisionDataId = revisionDataId;
    }

    public String getRevisionAuthorId() {
        return revisionAuthorId;
    }

    public void setRevisionAuthorId(String revisionAuthorId) {
        this.revisionAuthorId = revisionAuthorId;
    }

    public String getRevisionData() {
        return revisionData;
    }

    public void setRevisionData(String revisionData) {
        this.revisionData = revisionData;
    }
}