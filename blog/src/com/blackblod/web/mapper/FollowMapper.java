package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGFollow;

public interface FollowMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGFollow record);

    int insertSelective(BGFollow record);

    BGFollow selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGFollow record);

    int updateByPrimaryKey(BGFollow record);
}