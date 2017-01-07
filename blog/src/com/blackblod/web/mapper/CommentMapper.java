package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGComment;

public interface CommentMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGComment record);

    int insertSelective(BGComment record);

    BGComment selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGComment record);

    int updateByPrimaryKeyWithBLOBs(BGComment record);

    int updateByPrimaryKey(BGComment record);
}