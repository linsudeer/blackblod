package com.blackblod.web.dmo;

public class BGTagTag {
    private String oId;

    private String tag1_oId;

    private String tag2_oId;

    private Integer weight;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getTag1_oId() {
        return tag1_oId;
    }

    public void setTag1_oId(String tag1_oId) {
        this.tag1_oId = tag1_oId;
    }

    public String getTag2_oId() {
        return tag2_oId;
    }

    public void setTag2_oId(String tag2_oId) {
        this.tag2_oId = tag2_oId;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}