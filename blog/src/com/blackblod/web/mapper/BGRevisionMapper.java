package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGRevision;

public interface BGRevisionMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGRevision record);

    int insertSelective(BGRevision record);

    BGRevision selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGRevision record);

    int updateByPrimaryKeyWithBLOBs(BGRevision record);

    int updateByPrimaryKey(BGRevision record);
}