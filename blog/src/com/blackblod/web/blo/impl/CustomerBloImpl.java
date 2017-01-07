package com.blackblod.web.blo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackblod.web.blo.CustomerBlo;
import com.blackblod.web.dmo.UserDmo;
import com.blackblod.web.dto.CustomerDto;
import com.blackblod.web.repo.UserRepo;
import com.blackblod.web.util.BeanUtils;

@Service
public class CustomerBloImpl implements CustomerBlo{
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public int register(CustomerDto customer) {
		UserDmo user = BeanUtils.convert(customer, UserDmo.class);
		return userRepo.save(user);
	}

	@Override
	public CustomerDto login(CustomerDto customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
