package com.blackblod.web.repo;

import com.blackblod.web.dmo.UserDmo;

public interface UserRepo {

	public String save(UserDmo user);
	
	public void update(UserDmo user);
	
	public void delete(String oId);

	String saveSelective(UserDmo user);

	void updateSelective(UserDmo user);
}
