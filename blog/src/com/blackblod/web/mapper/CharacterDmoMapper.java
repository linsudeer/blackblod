package com.blackblod.web.mapper;

import com.blackblod.web.dmo.CharacterDmo;

public interface CharacterDmoMapper {
    int deleteByOId(String oId);

    int insert(CharacterDmo record);

    int insertSelective(CharacterDmo record);

    CharacterDmo selectByOId(String oId);

    int updateByOIdSelective(CharacterDmo record);

    int updateByOIdWithBLOBs(CharacterDmo record);

    int updateByOId(CharacterDmo record);
}