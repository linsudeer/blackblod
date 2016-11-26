package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGTag;
import com.blackblod.web.dmo.BGTagWithBLOBs;

public interface BGTagMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGTagWithBLOBs record);

    int insertSelective(BGTagWithBLOBs record);

    BGTagWithBLOBs selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGTagWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BGTagWithBLOBs record);

    int updateByPrimaryKey(BGTag record);
}