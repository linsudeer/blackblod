package com.blackblod.web.repo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blackblod.web.dmo.UserDmo;
import com.blackblod.web.mapper.UserDmoMapper;
import com.blackblod.web.repo.UserRepo;
@Repository
public class UserRepoImpl implements UserRepo{

	@Autowired
	private UserDmoMapper userMapper;

	@Override
	public String save(UserDmo user) {
		return userMapper.insert(user);
	}
	
	@Override
	public String saveSelective(UserDmo user) {
		return userMapper.insertSelective(user);
	}

	@Override
	public void update(UserDmo user) {
		userMapper.updateByOId(user);
	}
	
	@Override
	public void updateSelective(UserDmo user) {
		userMapper.updateByOIdSelective(user);
	}

	@Override
	public void delete(String oId) {
		// TODO Auto-generated method stub
		
	}
	

}