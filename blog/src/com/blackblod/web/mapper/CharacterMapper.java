package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGCharacter;

public interface CharacterMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGCharacter record);

    int insertSelective(BGCharacter record);

    BGCharacter selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGCharacter record);

    int updateByPrimaryKeyWithBLOBs(BGCharacter record);

    int updateByPrimaryKey(BGCharacter record);
}