package com.blackblod.web.mapper;

import com.blackblod.web.dmo.VoteDmo;

public interface VoteDmoMapper {
    int deleteByOId(String oId);

    int insert(VoteDmo record);

    int insertSelective(VoteDmo record);

    VoteDmo selectByOId(String oId);

    int updateByOIdSelective(VoteDmo record);

    int updateByOId(VoteDmo record);
}