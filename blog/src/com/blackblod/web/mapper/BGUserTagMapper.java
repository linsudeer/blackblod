package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGUserTag;

public interface BGUserTagMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGUserTag record);

    int insertSelective(BGUserTag record);

    BGUserTag selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGUserTag record);

    int updateByPrimaryKey(BGUserTag record);
}