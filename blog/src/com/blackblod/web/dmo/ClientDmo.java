package com.blackblod.web.dmo;

public class ClientDmo {
    private String oId;

    private String clientName;

    private String clientVersion;

    private String clientHost;

    private String clientRuntimeEnv;

    private Long clientLatestAddArticleTime;

    private Long clientLatestAddCommentTime;

    private String clientAdminEmail;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientVersion() {
        return clientVersion;
    }

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    public String getClientHost() {
        return clientHost;
    }

    public void setClientHost(String clientHost) {
        this.clientHost = clientHost;
    }

    public String getClientRuntimeEnv() {
        return clientRuntimeEnv;
    }

    public void setClientRuntimeEnv(String clientRuntimeEnv) {
        this.clientRuntimeEnv = clientRuntimeEnv;
    }

    public Long getClientLatestAddArticleTime() {
        return clientLatestAddArticleTime;
    }

    public void setClientLatestAddArticleTime(Long clientLatestAddArticleTime) {
        this.clientLatestAddArticleTime = clientLatestAddArticleTime;
    }

    public Long getClientLatestAddCommentTime() {
        return clientLatestAddCommentTime;
    }

    public void setClientLatestAddCommentTime(Long clientLatestAddCommentTime) {
        this.clientLatestAddCommentTime = clientLatestAddCommentTime;
    }

    public String getClientAdminEmail() {
        return clientAdminEmail;
    }

    public void setClientAdminEmail(String clientAdminEmail) {
        this.clientAdminEmail = clientAdminEmail;
    }
}