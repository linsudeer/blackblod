package com.blackblod.web.dmo;

public class BGFollow {
    private String oId;

    private String followerId;

    private String followingId;

    private Integer followingType;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getFollowerId() {
        return followerId;
    }

    public void setFollowerId(String followerId) {
        this.followerId = followerId;
    }

    public String getFollowingId() {
        return followingId;
    }

    public void setFollowingId(String followingId) {
        this.followingId = followingId;
    }

    public Integer getFollowingType() {
        return followingType;
    }

    public void setFollowingType(Integer followingType) {
        this.followingType = followingType;
    }
}