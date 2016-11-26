package com.blackblod.web.dmo;

public class BGReferral {
    private String oId;

    private String referralUser;

    private String referralDataId;

    private Integer referralType;

    private String referralIP;

    private Integer referralClick;

    private String referralUserHasPoint;

    private String referralAuthorHasPoint;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getReferralUser() {
        return referralUser;
    }

    public void setReferralUser(String referralUser) {
        this.referralUser = referralUser;
    }

    public String getReferralDataId() {
        return referralDataId;
    }

    public void setReferralDataId(String referralDataId) {
        this.referralDataId = referralDataId;
    }

    public Integer getReferralType() {
        return referralType;
    }

    public void setReferralType(Integer referralType) {
        this.referralType = referralType;
    }

    public String getReferralIP() {
        return referralIP;
    }

    public void setReferralIP(String referralIP) {
        this.referralIP = referralIP;
    }

    public Integer getReferralClick() {
        return referralClick;
    }

    public void setReferralClick(Integer referralClick) {
        this.referralClick = referralClick;
    }

    public String getReferralUserHasPoint() {
        return referralUserHasPoint;
    }

    public void setReferralUserHasPoint(String referralUserHasPoint) {
        this.referralUserHasPoint = referralUserHasPoint;
    }

    public String getReferralAuthorHasPoint() {
        return referralAuthorHasPoint;
    }

    public void setReferralAuthorHasPoint(String referralAuthorHasPoint) {
        this.referralAuthorHasPoint = referralAuthorHasPoint;
    }
}