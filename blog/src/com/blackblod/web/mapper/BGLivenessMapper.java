package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGLiveness;

public interface BGLivenessMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGLiveness record);

    int insertSelective(BGLiveness record);

    BGLiveness selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGLiveness record);

    int updateByPrimaryKey(BGLiveness record);
}