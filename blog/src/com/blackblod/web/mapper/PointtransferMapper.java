package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGPointtransfer;

public interface PointtransferMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGPointtransfer record);

    int insertSelective(BGPointtransfer record);

    BGPointtransfer selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGPointtransfer record);

    int updateByPrimaryKey(BGPointtransfer record);
}