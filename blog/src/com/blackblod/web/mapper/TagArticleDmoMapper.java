package com.blackblod.web.mapper;

import com.blackblod.web.dmo.TagArticleDmo;

public interface TagArticleDmoMapper {
    int deleteByOId(String oId);

    int insert(TagArticleDmo record);

    int insertSelective(TagArticleDmo record);

    TagArticleDmo selectByOId(String oId);

    int updateByOIdSelective(TagArticleDmo record);

    int updateByOId(TagArticleDmo record);
}