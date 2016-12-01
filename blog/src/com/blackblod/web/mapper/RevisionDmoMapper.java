package com.blackblod.web.mapper;

import com.blackblod.web.dmo.RevisionDmo;

public interface RevisionDmoMapper {
    int deleteByOId(String oId);

    int insert(RevisionDmo record);

    int insertSelective(RevisionDmo record);

    RevisionDmo selectByOId(String oId);

    int updateByOIdSelective(RevisionDmo record);

    int updateByOIdWithBLOBs(RevisionDmo record);

    int updateByOId(RevisionDmo record);
}