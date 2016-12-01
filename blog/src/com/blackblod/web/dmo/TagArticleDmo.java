package com.blackblod.web.dmo;

public class TagArticleDmo {
    private String oId;

    private String article_oId;

    private String tag_oId;

    private Integer articleCommentCount;

    private Long articleLatestCmtTime;

    private Double redditScore;

    private Integer articlePerfect;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getArticle_oId() {
        return article_oId;
    }

    public void setArticle_oId(String article_oId) {
        this.article_oId = article_oId;
    }

    public String getTag_oId() {
        return tag_oId;
    }

    public void setTag_oId(String tag_oId) {
        this.tag_oId = tag_oId;
    }

    public Integer getArticleCommentCount() {
        return articleCommentCount;
    }

    public void setArticleCommentCount(Integer articleCommentCount) {
        this.articleCommentCount = articleCommentCount;
    }

    public Long getArticleLatestCmtTime() {
        return articleLatestCmtTime;
    }

    public void setArticleLatestCmtTime(Long articleLatestCmtTime) {
        this.articleLatestCmtTime = articleLatestCmtTime;
    }

    public Double getRedditScore() {
        return redditScore;
    }

    public void setRedditScore(Double redditScore) {
        this.redditScore = redditScore;
    }

    public Integer getArticlePerfect() {
        return articlePerfect;
    }

    public void setArticlePerfect(Integer articlePerfect) {
        this.articlePerfect = articlePerfect;
    }
}