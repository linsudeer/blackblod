package com.blackblod.web.repo;

import com.blackblod.web.dmo.UserDmo;

public interface UserRepo {

	public int save(UserDmo user);
	
	public void update(UserDmo user);
	
	public void delete(String oId);

	int saveSelective(UserDmo user);

	void updateSelective(UserDmo user);
}
