package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGUser;

public interface UserMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGUser record);

    int insertSelective(BGUser record);

    BGUser selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGUser record);

    int updateByPrimaryKey(BGUser record);
}