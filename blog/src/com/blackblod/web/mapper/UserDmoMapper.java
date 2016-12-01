package com.blackblod.web.mapper;

import com.blackblod.web.dmo.UserDmo;

public interface UserDmoMapper {
	
    int deleteByOId(String oId);

    int insert(UserDmo record);

    int insertSelective(UserDmo record);

    UserDmo selectByOId(String oId);

    int updateByOIdSelective(UserDmo record);

    int updateByOId(UserDmo record);
}