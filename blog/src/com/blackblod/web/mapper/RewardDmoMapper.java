package com.blackblod.web.mapper;

import com.blackblod.web.dmo.RewardDmo;

public interface RewardDmoMapper {
    int deleteByOId(String oId);

    int insert(RewardDmo record);

    int insertSelective(RewardDmo record);

    RewardDmo selectByOId(String oId);

    int updateByOIdSelective(RewardDmo record);

    int updateByOId(RewardDmo record);
}