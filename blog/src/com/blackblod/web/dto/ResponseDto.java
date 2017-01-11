package com.blackblod.web.dto;

/**
 * 响应Dto
 * @author Songli Li
 * @date 2017年1月10日 下午5:33:34
 * @param <T>
 */
public class ResponseDto <T> {

	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
