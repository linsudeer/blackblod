package com.blackblod.web.mapper;

import com.blackblod.web.dmo.UserDmo;

public interface UserDmoMapper {
	
    int deleteByOId(String oId);

    String insert(UserDmo record);

    String insertSelective(UserDmo record);

    UserDmo selectByOId(String oId);

    int updateByOIdSelective(UserDmo record);

    int updateByOId(UserDmo record);
}