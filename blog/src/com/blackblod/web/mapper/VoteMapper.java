package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGVote;

public interface VoteMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGVote record);

    int insertSelective(BGVote record);

    BGVote selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGVote record);

    int updateByPrimaryKey(BGVote record);
}