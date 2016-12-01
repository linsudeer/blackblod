package com.blackblod.web.dmo;

public class PointtransferDmo {
    private String oId;

    private String fromId;

    private String toId;

    private Integer sum;

    private Integer fromBalance;

    private Integer toBalance;

    private Long time;

    private Integer type;

    private String dataId;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getToId() {
        return toId;
    }

    public void setToId(String toId) {
        this.toId = toId;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getFromBalance() {
        return fromBalance;
    }

    public void setFromBalance(Integer fromBalance) {
        this.fromBalance = fromBalance;
    }

    public Integer getToBalance() {
        return toBalance;
    }

    public void setToBalance(Integer toBalance) {
        this.toBalance = toBalance;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }
}