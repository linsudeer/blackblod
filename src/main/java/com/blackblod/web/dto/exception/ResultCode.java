package com.blackblod.web.dto.exception;

public interface ResultCode {
	
	String SUCCESS_CODE = "0";

	String SUCCESS_MSG = "成功";

	String SYS_ERROR_CODE = "1";

	String SYS_ERROR_MSG = "系统错误";

	String getCode();

	String getMessage();
}
