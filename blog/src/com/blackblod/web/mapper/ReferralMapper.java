package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGReferral;

public interface ReferralMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGReferral record);

    int insertSelective(BGReferral record);

    BGReferral selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGReferral record);

    int updateByPrimaryKey(BGReferral record);
}