package com.blackblod.web.dto;

public class RegisterDto {

	/**
     * 邮箱
     */
    private String userEmail;
    
    /**
     * 密码
     */
    private String userPassword;
    
    /**
     * 邀请码
     */
    private String inviteCode;

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getInviteCode() {
		return inviteCode;
	}

	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}
    
    
}
