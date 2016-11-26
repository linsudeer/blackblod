package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGEmotion;

public interface BGEmotionMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGEmotion record);

    int insertSelective(BGEmotion record);

    BGEmotion selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGEmotion record);

    int updateByPrimaryKey(BGEmotion record);
}