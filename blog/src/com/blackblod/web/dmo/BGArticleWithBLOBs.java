package com.blackblod.web.dmo;

public class BGArticleWithBLOBs extends BGArticle {
	
	private static final long serialVersionUID = 1L;

	private String articleContent;

    private String articleRewardContent;

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getArticleRewardContent() {
        return articleRewardContent;
    }

    public void setArticleRewardContent(String articleRewardContent) {
        this.articleRewardContent = articleRewardContent;
    }
}