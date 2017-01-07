package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGTagUserLink;

public interface TagUserLinkMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGTagUserLink record);

    int insertSelective(BGTagUserLink record);

    BGTagUserLink selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGTagUserLink record);

    int updateByPrimaryKey(BGTagUserLink record);
}