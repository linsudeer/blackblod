package com.blackblod.web.ctrl.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.blackblod.web.blo.UserBlo;
import com.blackblod.web.dmo.UserDmo;
import com.blackblod.web.dto.RegisterDto;
import com.blackblod.web.dto.RequestDto;
import com.blackblod.web.dto.ResponseDto;
import com.blackblod.web.dto.VoidDto;
import com.blackblod.web.dto.exception.BizException;
import com.blackblod.web.util.BeanUtils;
import com.blackblod.web.util.ResponseDtoUtils;

@RestController
@RequestMapping("/web/customer")
public class CustomerCtrl {
	
	@Autowired
	private UserBlo customerBlo;

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
	public ResponseDto<VoidDto> register( @RequestBody RequestDto<RegisterDto> params){
		try{
			UserDmo user = BeanUtils.convert(params, UserDmo.class);
			customerBlo.register(user);
		}catch (BizException e) {
			return ResponseDtoUtils.create(e);
		}
		return ResponseDtoUtils.createSuccess();
	}
	
	public ResponseDto<VoidDto> checkEmail(){
		
		return null;
		
	}
}
