package com.blackblod.web.mapper;

import com.blackblod.web.dmo.TagTagDmo;

public interface TagTagDmoMapper {
    int deleteByOId(String oId);

    int insert(TagTagDmo record);

    int insertSelective(TagTagDmo record);

    TagTagDmo selectByOId(String oId);

    int updateByOIdSelective(TagTagDmo record);

    int updateByOId(TagTagDmo record);
}