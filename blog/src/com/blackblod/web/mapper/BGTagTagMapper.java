package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGTagTag;

public interface BGTagTagMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGTagTag record);

    int insertSelective(BGTagTag record);

    BGTagTag selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGTagTag record);

    int updateByPrimaryKey(BGTagTag record);
}