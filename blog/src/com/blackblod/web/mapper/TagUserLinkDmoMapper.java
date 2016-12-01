package com.blackblod.web.mapper;

import com.blackblod.web.dmo.TagUserLinkDmo;

public interface TagUserLinkDmoMapper {
    int deleteByOId(String oId);

    int insert(TagUserLinkDmo record);

    int insertSelective(TagUserLinkDmo record);

    TagUserLinkDmo selectByOId(String oId);

    int updateByOIdSelective(TagUserLinkDmo record);

    int updateByOId(TagUserLinkDmo record);
}