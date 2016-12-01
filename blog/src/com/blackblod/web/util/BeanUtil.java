package com.blackblod.web.util;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;

/**
 * BeanUtil
 * @author Songli Li
 * @date 2016年11月19日 下午4:03:03
 */
public class BeanUtil {

	/**
	 * dozer 更强大的javabean映射工具
	 * 参考 https://zhuanlan.zhihu.com/p/23791061
	 */
	private static final DozerBeanMapper MAPPER = new DozerBeanMapper();
	
	static {
		List<String> files = new ArrayList<String>();
		files.add("config/dozer-bean.xml");
		MAPPER.setMappingFiles(files);
	}
	
	/**
	 * 转换bean dto -> dmo
	 * @author Songlin Li
	 * @date 2016年12月1日 下午5:37:07
	 * @param obj
	 * @param clazz
	 * @return
	 */
	public static <T> T convert(Object obj,Class<T> clazz){
		if(obj == null){
			return null;
		}
		
		return MAPPER.map(obj, clazz);
	}
}
