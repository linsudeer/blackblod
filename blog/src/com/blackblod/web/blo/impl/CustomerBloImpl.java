package com.blackblod.web.blo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackblod.web.blo.CustomerBlo;
import com.blackblod.web.dmo.UserDmo;
import com.blackblod.web.dto.CustomerDto;
import com.blackblod.web.dto.exception.BizException;
import com.blackblod.web.dto.exception.BizResultCode;
import com.blackblod.web.repo.UserRepo;
import com.blackblod.web.util.StringUtils;

@Service
public class CustomerBloImpl implements CustomerBlo{
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public int register(UserDmo user) {
		if(StringUtils.isEmpty(user.getUserEmail())){
			throw new BizException(BizResultCode.EMPTY_USERNAME);
		}
		if(StringUtils.isEmpty(user.getUserPassword())){
			throw new BizException(BizResultCode.EMPTY_PWD);
		}
		return userRepo.save(user);
	}

	@Override
	public CustomerDto login(UserDmo user) {
		// TODO Auto-generated method stub
		return null;
	}

}
