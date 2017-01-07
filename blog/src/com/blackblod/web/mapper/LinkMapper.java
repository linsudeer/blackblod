package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGLink;
import com.blackblod.web.dmo.BGLinkWithBLOBs;

public interface LinkMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGLinkWithBLOBs record);

    int insertSelective(BGLinkWithBLOBs record);

    BGLinkWithBLOBs selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGLinkWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BGLinkWithBLOBs record);

    int updateByPrimaryKey(BGLink record);
}