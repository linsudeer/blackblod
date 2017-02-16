package com.blackblod.web.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.dozer.DozerBeanMapper;

import com.blackblod.web.bean.transfer.StringNullTransfer;
import com.blackblod.web.bean.transfer.Transfer;


/**
 * BeanUtil
 * @author Songli Li
 * @date 2016年11月19日 下午4:03:03
 */
public class BeanUtils {

	/**
	 * dozer 更强大的javabean映射工具
	 * 参考 https://zhuanlan.zhihu.com/p/23791061
	 */
	private static final DozerBeanMapper MAPPER = new DozerBeanMapper();
	
	static {
		List<String> files = new ArrayList<String>();
		files.add("config/dozer-bean.xml");
//		MAPPER.setMappingFiles(files);
	}
	
	/**
	 * 转换bean dto -> dmo 默认 String null-> ""
	 * @author Songlin Li
	 * @date 2016年12月6日 下午2:36:27
	 * @param orig
	 * @param clazz
	 * @return
	 */
	public static <T> T convert(Object orig, Class<T> clazz) {
		return convert(orig, clazz, new StringNullTransfer());
	}
	
	public static <T> List<T> convertList(List<?> orig, Class<T> clazz) {
		return convertList(orig, clazz, null);
	}
	
	/**
	 * 转换bean dto -> dmo
	 * @author Songlin Li
	 * @date 2016年12月1日 下午5:37:07
	 * @param obj
	 * @param clazz
	 * @return
	 */
	public static <T> T convert(Object orig, Class<T> clazz, Transfer transfer) {
		if (orig == null) {
			return null;
		}

		Object o = orig;
		if (transfer != null) {
			o = transfer.transfer(orig);
		}

		return MAPPER.map(o, clazz);
	}
	
	public static <T> List<T> convertList(List<?> orig, Class<T> clazz, Transfer transfer) {
		List<T> dest = null;

		if (!CollectionUtils.isEmpty(orig)) {
			dest = new ArrayList<T>();
			for (Object each : orig) {
				T destEntry = convert(each, clazz, transfer);
				dest.add(destEntry);
			}

		} else if (orig != null) {
			dest = new ArrayList<T>();
		}
		return dest;
	}
}
