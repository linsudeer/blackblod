package com.blackblod.web.mapper;

import com.blackblod.web.dmo.CommentDmo;

public interface CommentDmoMapper {
    int deleteByOId(String oId);

    int insert(CommentDmo record);

    int insertSelective(CommentDmo record);

    CommentDmo selectByOId(String oId);

    int updateByOIdSelective(CommentDmo record);

    int updateByOIdWithBLOBs(CommentDmo record);

    int updateByOId(CommentDmo record);
}