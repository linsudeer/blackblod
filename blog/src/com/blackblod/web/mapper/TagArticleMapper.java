package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGTagArticle;

public interface TagArticleMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGTagArticle record);

    int insertSelective(BGTagArticle record);

    BGTagArticle selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGTagArticle record);

    int updateByPrimaryKey(BGTagArticle record);
}