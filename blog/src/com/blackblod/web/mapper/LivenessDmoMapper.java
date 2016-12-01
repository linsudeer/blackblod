package com.blackblod.web.mapper;

import com.blackblod.web.dmo.LivenessDmo;

public interface LivenessDmoMapper {
    int deleteByOId(String oId);

    int insert(LivenessDmo record);

    int insertSelective(LivenessDmo record);

    LivenessDmo selectByOId(String oId);

    int updateByOIdSelective(LivenessDmo record);

    int updateByOId(LivenessDmo record);
}