package com.blackblod.web.type.date;

import com.blackblod.web.bean.TypeBean;

public enum DateType implements TypeBean {
	
	SECOND("1","秒"),
	MINUTE("2","分"),
	HOUR("3","小时"),
	DAY("4,","日"),
	MONTH("5","月"),
	YEAR("6","年");
	
	private String code;
	
	private String name;
	
	private DateType(String code, String name) {
		this.code = code;
		this.name = name;
	}

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
}
