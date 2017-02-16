package com.blackblod.web.dto.exception;

import com.blackblod.web.bean.TypeBean;

public enum BizResultCode implements TypeBean,ResultCode{

	SUCCESS("0", "成功"), //
	SYS_ERROR("1", "系统错误"), //
	EMPTY_INVITECODE("2", "邀请码为空"), //
	ERROR_INVITECODE("3", "邀请码不存在"), //
	EMPTY_USERNAME("4", "用户名为空"), //
	EMPTY_PWD("5", "密码为空"), //
	ERROR_PWD("6", "密码错误"), //
	OLDPWD_ERROR("7", "原密码输入错误"), //
	EMPTY_MOBILE("8","手机号为空"),//
	ERROR_MOBILE_CHECKCODE("9","手机验证码错误"),//
	MOBILE_UNREGISTER("10","该手机号尚未注册"),// 
	MOBILE_TOKEN_ERROR("11","手机验证码错误"),//
	MOBILE_HAS_REGISTED("12","该手机号码已注册"),//
	EMPTY_MOBILE_CHENCKCODE("13","手机验证码为空"),//
	NEED_LOGIN("14","用户权限不足,请登录"),//
	MOBILE_UNMATCHED_CHECKCODE("15","验证码与该手机号不匹配"),
	DUPLICATE_KEY("19", "唯一数据冲突,请检查录入信息中是否存在重复数据"), //
	NUMBER_FORMAT_ERROR("20", "数字格式错误"), //
	CHECKCODE_NOT_SENT("27","尚未获取手机验证码"), //
	WECHAT_MOBILE_BINDED("28", "该手机号码已绑定微信账号，请使用微信登录"), //
	PLEASE_CHANGE_MOBILE("29","该手机号码已被绑定，请绑定其他手机号码"), //
	CHECKCODE_HAS_EXPIRED("30","该验证码已经过期，请重新获取"),
	TOKEN_HAS_EXPIRED("31","登录信息已过期，请重新登录"),
	SAME_OLD_NEW_PASSWORD("32","新旧密码不能一致"),
	ERROR_ACCOUNT_PWD("33","账号或密码有误，请重新输入"),//
	MOBILE_TOO_LONG("34","手机号过长，请重新输入"), 
	MOBILE_TOO_SHORT("35","手机号过短请重新输入");
	
	private String code;
	private String name;
	
	private BizResultCode(String code,String name){
		this.code = code;
		this.name= name;
	}
	@Override
	public String getCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCode(String code) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
