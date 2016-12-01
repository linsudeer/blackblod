package com.blackblod.web.mapper;

import com.blackblod.web.dmo.ArticleDmo;
import com.blackblod.web.dmo.ArticleDmoWithBLOBs;

public interface ArticleDmoMapper {
    int deleteByOId(String oId);

    int insert(ArticleDmoWithBLOBs record);

    int insertSelective(ArticleDmoWithBLOBs record);

    ArticleDmoWithBLOBs selectByOId(String oId);

    int updateByOIdSelective(ArticleDmoWithBLOBs record);

    int updateByOIdWithBLOBs(ArticleDmoWithBLOBs record);

    int updateByOId(ArticleDmo record);
}