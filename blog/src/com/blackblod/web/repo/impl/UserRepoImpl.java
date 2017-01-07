package com.blackblod.web.repo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blackblod.web.dmo.UserDmo;
import com.blackblod.web.mapper.UserMapper;
import com.blackblod.web.repo.UserRepo;
@Repository
public class UserRepoImpl implements UserRepo{

	@Autowired
	private UserMapper userMapper;

	@Override
	public int save(UserDmo user) {
		return userMapper.insert(user);
	}
	
	@Override
	public int saveSelective(UserDmo user) {
		return userMapper.insertSelective(user);
	}

	@Override
	public void update(UserDmo user) {
		userMapper.updateByPrimaryKey(user);
	}
	
	@Override
	public void updateSelective(UserDmo user) {
		userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public void delete(String oId) {
		// TODO Auto-generated method stub
		
	}
	

}
