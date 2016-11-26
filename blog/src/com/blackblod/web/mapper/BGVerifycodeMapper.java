package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGVerifycode;

public interface BGVerifycodeMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGVerifycode record);

    int insertSelective(BGVerifycode record);

    BGVerifycode selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGVerifycode record);

    int updateByPrimaryKey(BGVerifycode record);
}