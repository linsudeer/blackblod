package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGArticle;
import com.blackblod.web.dmo.BGArticleWithBLOBs;

public interface BGArticleMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGArticleWithBLOBs record);

    int insertSelective(BGArticleWithBLOBs record);

    BGArticleWithBLOBs selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGArticleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BGArticleWithBLOBs record);

    int updateByPrimaryKey(BGArticle record);
}