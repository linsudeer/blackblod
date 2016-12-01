package com.blackblod.web.mapper;

import com.blackblod.web.dmo.LinkDmo;
import com.blackblod.web.dmo.LinkDmoWithBLOBs;

public interface LinkDmoMapper {
    int deleteByOId(String oId);

    int insert(LinkDmoWithBLOBs record);

    int insertSelective(LinkDmoWithBLOBs record);

    LinkDmoWithBLOBs selectByOId(String oId);

    int updateByOIdSelective(LinkDmoWithBLOBs record);

    int updateByOIdWithBLOBs(LinkDmoWithBLOBs record);

    int updateByOId(LinkDmo record);
}