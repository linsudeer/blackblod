package com.blackblod.web.dmo;

public class DomainDmoWithBLOBs extends DomainDmo {
    private String domainDescription;

    private String domainIconPath;

    private String domainCSS;

    private String domainSeoDesc;

    public String getDomainDescription() {
        return domainDescription;
    }

    public void setDomainDescription(String domainDescription) {
        this.domainDescription = domainDescription;
    }

    public String getDomainIconPath() {
        return domainIconPath;
    }

    public void setDomainIconPath(String domainIconPath) {
        this.domainIconPath = domainIconPath;
    }

    public String getDomainCSS() {
        return domainCSS;
    }

    public void setDomainCSS(String domainCSS) {
        this.domainCSS = domainCSS;
    }

    public String getDomainSeoDesc() {
        return domainSeoDesc;
    }

    public void setDomainSeoDesc(String domainSeoDesc) {
        this.domainSeoDesc = domainSeoDesc;
    }
}