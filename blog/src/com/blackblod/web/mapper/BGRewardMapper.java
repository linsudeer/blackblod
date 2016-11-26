package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGReward;

public interface BGRewardMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGReward record);

    int insertSelective(BGReward record);

    BGReward selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGReward record);

    int updateByPrimaryKey(BGReward record);
}