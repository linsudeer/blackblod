package com.blackblod.web.dmo;
/**
 * 邀请码
 * @author Songli Li
 * @date 2017年1月10日 下午5:19:06
 */
public class InvitecodeDmo {
    private String oId;

    private String code;//邀请码

    private String generatorId;//生成用户id

    private String userId;//使用者id

    private Long useTime;//使用时间

    private Integer status;//状态

    private String memo;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGeneratorId() {
        return generatorId;
    }

    public void setGeneratorId(String generatorId) {
        this.generatorId = generatorId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getUseTime() {
        return useTime;
    }

    public void setUseTime(Long useTime) {
        this.useTime = useTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}