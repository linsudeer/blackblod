package com.blackblod.web.mapper;

import com.blackblod.web.dmo.TagDmo;
import com.blackblod.web.dmo.TagDmoWithBLOBs;

public interface TagDmoMapper {
    int deleteByOId(String oId);

    int insert(TagDmoWithBLOBs record);

    int insertSelective(TagDmoWithBLOBs record);

    TagDmoWithBLOBs selectByOId(String oId);

    int updateByOIdSelective(TagDmoWithBLOBs record);

    int updateByOIdWithBLOBs(TagDmoWithBLOBs record);

    int updateByOId(TagDmo record);
}