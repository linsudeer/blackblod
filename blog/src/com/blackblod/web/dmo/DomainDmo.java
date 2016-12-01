package com.blackblod.web.dmo;

public class DomainDmo {
    private String oId;

    private String domainTitle;

    private String domainURI;

    private String domainType;

    private Integer domainSort;

    private Integer domainTagCnt;

    private Integer domainStatus;

    private String domainSeoTitle;

    private String domainSeoKeywords;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getDomainTitle() {
        return domainTitle;
    }

    public void setDomainTitle(String domainTitle) {
        this.domainTitle = domainTitle;
    }

    public String getDomainURI() {
        return domainURI;
    }

    public void setDomainURI(String domainURI) {
        this.domainURI = domainURI;
    }

    public String getDomainType() {
        return domainType;
    }

    public void setDomainType(String domainType) {
        this.domainType = domainType;
    }

    public Integer getDomainSort() {
        return domainSort;
    }

    public void setDomainSort(Integer domainSort) {
        this.domainSort = domainSort;
    }

    public Integer getDomainTagCnt() {
        return domainTagCnt;
    }

    public void setDomainTagCnt(Integer domainTagCnt) {
        this.domainTagCnt = domainTagCnt;
    }

    public Integer getDomainStatus() {
        return domainStatus;
    }

    public void setDomainStatus(Integer domainStatus) {
        this.domainStatus = domainStatus;
    }

    public String getDomainSeoTitle() {
        return domainSeoTitle;
    }

    public void setDomainSeoTitle(String domainSeoTitle) {
        this.domainSeoTitle = domainSeoTitle;
    }

    public String getDomainSeoKeywords() {
        return domainSeoKeywords;
    }

    public void setDomainSeoKeywords(String domainSeoKeywords) {
        this.domainSeoKeywords = domainSeoKeywords;
    }
}