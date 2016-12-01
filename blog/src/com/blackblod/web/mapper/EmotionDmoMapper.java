package com.blackblod.web.mapper;

import com.blackblod.web.dmo.EmotionDmo;

public interface EmotionDmoMapper {
    int deleteByOId(String oId);

    int insert(EmotionDmo record);

    int insertSelective(EmotionDmo record);

    EmotionDmo selectByOId(String oId);

    int updateByOIdSelective(EmotionDmo record);

    int updateByOId(EmotionDmo record);
}