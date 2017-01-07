package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGOption;

public interface OptionMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGOption record);

    int insertSelective(BGOption record);

    BGOption selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGOption record);

    int updateByPrimaryKeyWithBLOBs(BGOption record);

    int updateByPrimaryKey(BGOption record);
}