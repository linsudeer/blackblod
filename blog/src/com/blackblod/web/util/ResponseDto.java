/**
 * 
 */
package com.blackblod.web.util;


/**
 * @author zhen.ling
 *
 */
public class ResponseDto<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2533487770189091990L;

	private String code;

	private String message;

	private T data;

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

}
