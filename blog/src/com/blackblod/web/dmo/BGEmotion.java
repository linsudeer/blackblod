package com.blackblod.web.dmo;

public class BGEmotion {
    private String oId;

    private String emotionUserId;

    private String emotionContent;

    private Integer emotionSort;

    private Integer emotionType;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getEmotionUserId() {
        return emotionUserId;
    }

    public void setEmotionUserId(String emotionUserId) {
        this.emotionUserId = emotionUserId;
    }

    public String getEmotionContent() {
        return emotionContent;
    }

    public void setEmotionContent(String emotionContent) {
        this.emotionContent = emotionContent;
    }

    public Integer getEmotionSort() {
        return emotionSort;
    }

    public void setEmotionSort(Integer emotionSort) {
        this.emotionSort = emotionSort;
    }

    public Integer getEmotionType() {
        return emotionType;
    }

    public void setEmotionType(Integer emotionType) {
        this.emotionType = emotionType;
    }
}