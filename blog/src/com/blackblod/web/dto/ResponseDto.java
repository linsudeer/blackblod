package com.blackblod.web.dto;

/**
 * 响应Dto
 * @author Songli Li
 * @date 2017年1月10日 下午5:33:34
 * @param <T>
 */
public class ResponseDto <T> {
	
	/**
	 * 返回码
	 */
	private String code;
	
	/**
	 * 返回信息
	 */
	private String message;

	/**
	 * 返回数据
	 */
	private T data;
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
