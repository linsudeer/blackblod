package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGDomainTag;

public interface DomainTagMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGDomainTag record);

    int insertSelective(BGDomainTag record);

    BGDomainTag selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGDomainTag record);

    int updateByPrimaryKey(BGDomainTag record);
}