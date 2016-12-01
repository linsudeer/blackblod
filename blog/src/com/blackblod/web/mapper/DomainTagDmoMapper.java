package com.blackblod.web.mapper;

import com.blackblod.web.dmo.DomainTagDmo;

public interface DomainTagDmoMapper {
    int deleteByOId(String oId);

    int insert(DomainTagDmo record);

    int insertSelective(DomainTagDmo record);

    DomainTagDmo selectByOId(String oId);

    int updateByOIdSelective(DomainTagDmo record);

    int updateByOId(DomainTagDmo record);
}