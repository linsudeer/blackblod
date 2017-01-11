package com.blackblod.web.blo;

import com.blackblod.web.dmo.UserDmo;
import com.blackblod.web.dto.CustomerDto;

/**
 * 客户接口
 * @author Songli Li
 * @date 2016年11月28日 下午6:26:56
 */
public interface CustomerBlo {

	/**
	 * 注册
	 * @author Songlin Li
	 * @date 2016年11月30日 下午3:40:29
	 */
	public int register(UserDmo user);
	
	/**
	 * 登录
	 * @author Songlin Li
	 * @date 2016年11月30日 下午3:40:38
	 * @return
	 */
	public CustomerDto login(UserDmo user);
}
