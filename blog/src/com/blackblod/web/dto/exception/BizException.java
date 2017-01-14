package com.blackblod.web.dto.exception;

public class BizException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4368988581717267028L;
	
	private String code;
	
	public BizException(ResultCode resultCode){
		this(resultCode.getCode(),resultCode.getMessage());
	}
	
	public BizException(String code,String msg){
		super(msg);
		this.code = code;
	}
	
	public String getCode(){
		return this.code;
	}

}
