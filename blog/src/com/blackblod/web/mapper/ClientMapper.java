package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGClient;

public interface ClientMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGClient record);

    int insertSelective(BGClient record);

    BGClient selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGClient record);

    int updateByPrimaryKey(BGClient record);
}