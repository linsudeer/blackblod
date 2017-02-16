package com.blackblod.web.bean;
/**
 * Type Bean 定义type必须实现此方法,统一规范
 * @author Songli Li
 * @date 2016年11月19日 下午5:25:18
 */
public interface TypeBean {

	public String getCode();
	
	public void setCode(String code);
	
	public String getName();
	
	public void setName(String name);
}
