package com.blackblod.web.dmo;

public class BGLink {
    private String oId;

    private Integer linkType;

    private Integer linkSubmitCnt;

    private Integer linkClickCnt;

    private Integer linkGoodCnt;

    private Integer linkBadCnt;

    private Integer linkBaiduRefCnt;

    private Double linkScore;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public Integer getLinkType() {
        return linkType;
    }

    public void setLinkType(Integer linkType) {
        this.linkType = linkType;
    }

    public Integer getLinkSubmitCnt() {
        return linkSubmitCnt;
    }

    public void setLinkSubmitCnt(Integer linkSubmitCnt) {
        this.linkSubmitCnt = linkSubmitCnt;
    }

    public Integer getLinkClickCnt() {
        return linkClickCnt;
    }

    public void setLinkClickCnt(Integer linkClickCnt) {
        this.linkClickCnt = linkClickCnt;
    }

    public Integer getLinkGoodCnt() {
        return linkGoodCnt;
    }

    public void setLinkGoodCnt(Integer linkGoodCnt) {
        this.linkGoodCnt = linkGoodCnt;
    }

    public Integer getLinkBadCnt() {
        return linkBadCnt;
    }

    public void setLinkBadCnt(Integer linkBadCnt) {
        this.linkBadCnt = linkBadCnt;
    }

    public Integer getLinkBaiduRefCnt() {
        return linkBaiduRefCnt;
    }

    public void setLinkBaiduRefCnt(Integer linkBaiduRefCnt) {
        this.linkBaiduRefCnt = linkBaiduRefCnt;
    }

    public Double getLinkScore() {
        return linkScore;
    }

    public void setLinkScore(Double linkScore) {
        this.linkScore = linkScore;
    }
}