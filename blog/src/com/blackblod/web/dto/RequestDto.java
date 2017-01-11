package com.blackblod.web.dto;

/**
 * 请求Dto
 * @author Songli Li
 * @date 2017年1月10日 下午5:30:03
 * @param <T>
 */
public class RequestDto<T> {

	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
