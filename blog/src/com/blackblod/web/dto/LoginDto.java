package com.blackblod.web.dto;

public class LoginDto {
	
	/**
	 * 昵称
	 */
	private String userNickname;

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

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
    
}
