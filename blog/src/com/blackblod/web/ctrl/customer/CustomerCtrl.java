package com.blackblod.web.ctrl.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.blackblod.web.blo.CustomerBlo;
import com.blackblod.web.dmo.UserDmo;
import com.blackblod.web.dto.CustomerDto;
import com.blackblod.web.dto.LoginDto;
import com.blackblod.web.dto.RequestDto;
import com.blackblod.web.dto.ResponseDto;
import com.blackblod.web.util.BeanUtils;

@RestController
@RequestMapping("/web/customer")
public class CustomerCtrl {
	
	@Autowired
	private CustomerBlo customerBlo;

	public ModelAndView login(){
		return null;
	}
	
	/**
	 * 注册
	 * @author Songlin Li
	 * @date 2016年12月1日 下午5:40:47
	 * @param customer
	 * @return
	 */
	@RequestMapping("/register")
	public @ResponseBody ResponseDto<CustomerDto> register( @RequestBody RequestDto<LoginDto> params){
		UserDmo user = BeanUtils.convert(params, UserDmo.class);
		int oId = customerBlo.register(user);
		System.out.println(oId);
		return null;
	}
}
