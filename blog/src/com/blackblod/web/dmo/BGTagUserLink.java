package com.blackblod.web.dmo;

public class BGTagUserLink {
    private String oId;

    private String linkId;

    private String tagId;

    private String userId;

    private Double linkScore;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Double getLinkScore() {
        return linkScore;
    }

    public void setLinkScore(Double linkScore) {
        this.linkScore = linkScore;
    }
}