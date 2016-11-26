package com.blackblod.web.dmo;

public class BGCharacter {
    private String oId;

    private String characterUserId;

    private String characterContent;

    private String characterImg;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public String getCharacterUserId() {
        return characterUserId;
    }

    public void setCharacterUserId(String characterUserId) {
        this.characterUserId = characterUserId;
    }

    public String getCharacterContent() {
        return characterContent;
    }

    public void setCharacterContent(String characterContent) {
        this.characterContent = characterContent;
    }

    public String getCharacterImg() {
        return characterImg;
    }

    public void setCharacterImg(String characterImg) {
        this.characterImg = characterImg;
    }
}