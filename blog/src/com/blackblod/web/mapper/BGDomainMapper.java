package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGDomain;
import com.blackblod.web.dmo.BGDomainWithBLOBs;

public interface BGDomainMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGDomainWithBLOBs record);

    int insertSelective(BGDomainWithBLOBs record);

    BGDomainWithBLOBs selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGDomainWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BGDomainWithBLOBs record);

    int updateByPrimaryKey(BGDomain record);
}