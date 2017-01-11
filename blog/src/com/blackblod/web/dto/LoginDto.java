package com.blackblod.web.dto;

public class LoginDto {

	/**
     * 邮箱
     */
    private String userEmail;
    
    /**
     * 密码
     */
    private String userPassword;

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
    
    
    
}
