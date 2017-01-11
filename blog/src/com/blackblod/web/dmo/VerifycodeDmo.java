package com.blackblod.web.dmo;
/**
 * 验证码
 * @author Songli Li
 * @date 2017年1月10日 下午5:15:28
 */
public class VerifycodeDmo {
    private String oId;

    private String userId;//使用者

    private Integer type;//类型

    private Integer bizType;//业务类型

    private String receiver;//接受者

    private String code;//验证码

    private Integer status;//状态

    private Long expired;//过期时间

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getBizType() {
        return bizType;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getExpired() {
        return expired;
    }

    public void setExpired(Long expired) {
        this.expired = expired;
    }
}