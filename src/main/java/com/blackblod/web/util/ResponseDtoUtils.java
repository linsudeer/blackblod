package com.blackblod.web.util;

import com.blackblod.web.dto.ResponseDto;
import com.blackblod.web.dto.exception.BizException;
import com.blackblod.web.dto.exception.ResultCode;

public class ResponseDtoUtils {
	
	/**
	 * 创建成功ResponseDto
	 * 
	 * @return
	 */
	public static <T> ResponseDto<T> createSuccess() {
		return createSuccess(null);
	}

	/**
	 * 创建成功ResponseDto
	 * 
	 * @param data
	 * @return
	 */
	public static <T> ResponseDto<T> createSuccess(T data) {
		return create(ResultCode.SUCCESS_CODE, ResultCode.SUCCESS_MSG, data);
	}
	
	/**
	 * 创建系统错误ResponseDto
	 * 
	 * @return
	 */
	public static <T> ResponseDto<T> createSysError() {
		return create(ResultCode.SYS_ERROR_CODE, ResultCode.SYS_ERROR_MSG, null);
	}

	/**
	 * 根据结果码创建ResponseDto
	 * 
	 * @param code
	 * @return
	 */
	public static <T> ResponseDto<T> create(ResultCode code) {
		return create(code, null);
	}
	
	/**
	 * 根据结果码创建ResponseDto
	 * 
	 * @param code
	 * @param data
	 * @return
	 */
	public static <T> ResponseDto<T> create(ResultCode code, T data) {
		return create(code.getCode(), code.getMessage(), data);
	}
	
	/**
	 * 根据异常创建ResponseDto
	 * 
	 * @param ex
	 * @return
	 */
	public static <T> ResponseDto<T> create(BizException e) {
		return create(e.getCode(), e.getMessage(), null);
	}

	public static <T> ResponseDto<T> create(String code,String message,T data){
		ResponseDto<T> result = new ResponseDto<T>();
		result.setData(data);
		result.setCode(code);
		result.setMessage(message);
		return result;
	}
}
