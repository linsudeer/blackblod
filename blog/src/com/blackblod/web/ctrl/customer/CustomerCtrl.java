package com.blackblod.web.ctrl.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.blackblod.web.blo.CustomerBlo;
import com.blackblod.web.dto.CustomerDto;

@RestController
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
	public ModelAndView register(CustomerDto customer){
		customerBlo.register(customer);
		return null;
	}
}
