package com.blackblod.web.mapper;

import com.blackblod.web.dmo.DomainDmo;
import com.blackblod.web.dmo.DomainDmoWithBLOBs;

public interface DomainDmoMapper {
    int deleteByOId(String oId);

    int insert(DomainDmoWithBLOBs record);

    int insertSelective(DomainDmoWithBLOBs record);

    DomainDmoWithBLOBs selectByOId(String oId);

    int updateByOIdSelective(DomainDmoWithBLOBs record);

    int updateByOIdWithBLOBs(DomainDmoWithBLOBs record);

    int updateByOId(DomainDmo record);
}