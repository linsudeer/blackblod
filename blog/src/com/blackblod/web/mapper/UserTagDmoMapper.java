package com.blackblod.web.mapper;

import com.blackblod.web.dmo.UserTagDmo;

public interface UserTagDmoMapper {
    int deleteByOId(String oId);

    int insert(UserTagDmo record);

    int insertSelective(UserTagDmo record);

    UserTagDmo selectByOId(String oId);

    int updateByOIdSelective(UserTagDmo record);

    int updateByOId(UserTagDmo record);
}