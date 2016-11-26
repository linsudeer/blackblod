package com.blackblod.web.dmo;
/**
 * 用户表和标签表的中间表
 * @author Songlin Li
 * @date 2016-11-19
 */
public class BGUserTag {
    private String oId;

    private String user_oId;

    private String tag_oId;

    private Integer type;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getUser_oId() {
        return user_oId;
    }

    public void setUser_oId(String user_oId) {
        this.user_oId = user_oId;
    }

    public String getTag_oId() {
        return tag_oId;
    }

    public void setTag_oId(String tag_oId) {
        this.tag_oId = tag_oId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}