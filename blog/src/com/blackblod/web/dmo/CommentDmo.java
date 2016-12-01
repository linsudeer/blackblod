package com.blackblod.web.dmo;

public class CommentDmo {
    private String oId;

    private String clientCommentId;

    private Long commentCreateTime;

    private String commentAuthorEmail;

    private String commentAuthorId;

    private String commentOnArticleId;

    private String commentSharpURL;

    private String commentOriginalCommentId;

    private Integer commentStatus;

    private String commentIP;

    private String commentUA;

    private Integer commentAnonymous;

    private Integer commentGoodCnt;

    private Integer commentBadCnt;

    private Double commentScore;

    private Integer commentReplyCnt;

    private String commentContent;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getClientCommentId() {
        return clientCommentId;
    }

    public void setClientCommentId(String clientCommentId) {
        this.clientCommentId = clientCommentId;
    }

    public Long getCommentCreateTime() {
        return commentCreateTime;
    }

    public void setCommentCreateTime(Long commentCreateTime) {
        this.commentCreateTime = commentCreateTime;
    }

    public String getCommentAuthorEmail() {
        return commentAuthorEmail;
    }

    public void setCommentAuthorEmail(String commentAuthorEmail) {
        this.commentAuthorEmail = commentAuthorEmail;
    }

    public String getCommentAuthorId() {
        return commentAuthorId;
    }

    public void setCommentAuthorId(String commentAuthorId) {
        this.commentAuthorId = commentAuthorId;
    }

    public String getCommentOnArticleId() {
        return commentOnArticleId;
    }

    public void setCommentOnArticleId(String commentOnArticleId) {
        this.commentOnArticleId = commentOnArticleId;
    }

    public String getCommentSharpURL() {
        return commentSharpURL;
    }

    public void setCommentSharpURL(String commentSharpURL) {
        this.commentSharpURL = commentSharpURL;
    }

    public String getCommentOriginalCommentId() {
        return commentOriginalCommentId;
    }

    public void setCommentOriginalCommentId(String commentOriginalCommentId) {
        this.commentOriginalCommentId = commentOriginalCommentId;
    }

    public Integer getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(Integer commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getCommentIP() {
        return commentIP;
    }

    public void setCommentIP(String commentIP) {
        this.commentIP = commentIP;
    }

    public String getCommentUA() {
        return commentUA;
    }

    public void setCommentUA(String commentUA) {
        this.commentUA = commentUA;
    }

    public Integer getCommentAnonymous() {
        return commentAnonymous;
    }

    public void setCommentAnonymous(Integer commentAnonymous) {
        this.commentAnonymous = commentAnonymous;
    }

    public Integer getCommentGoodCnt() {
        return commentGoodCnt;
    }

    public void setCommentGoodCnt(Integer commentGoodCnt) {
        this.commentGoodCnt = commentGoodCnt;
    }

    public Integer getCommentBadCnt() {
        return commentBadCnt;
    }

    public void setCommentBadCnt(Integer commentBadCnt) {
        this.commentBadCnt = commentBadCnt;
    }

    public Double getCommentScore() {
        return commentScore;
    }

    public void setCommentScore(Double commentScore) {
        this.commentScore = commentScore;
    }

    public Integer getCommentReplyCnt() {
        return commentReplyCnt;
    }

    public void setCommentReplyCnt(Integer commentReplyCnt) {
        this.commentReplyCnt = commentReplyCnt;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }
}