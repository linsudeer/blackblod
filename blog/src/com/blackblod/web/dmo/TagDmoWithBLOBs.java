package com.blackblod.web.dmo;

public class TagDmoWithBLOBs extends TagDmo {
    private String tagDescription;

    private String tagCSS;

    private String tagSeoDesc;

    public String getTagDescription() {
        return tagDescription;
    }

    public void setTagDescription(String tagDescription) {
        this.tagDescription = tagDescription;
    }

    public String getTagCSS() {
        return tagCSS;
    }

    public void setTagCSS(String tagCSS) {
        this.tagCSS = tagCSS;
    }

    public String getTagSeoDesc() {
        return tagSeoDesc;
    }

    public void setTagSeoDesc(String tagSeoDesc) {
        this.tagSeoDesc = tagSeoDesc;
    }
}