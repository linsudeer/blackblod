package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGInvitecode;

public interface InvitecodeMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGInvitecode record);

    int insertSelective(BGInvitecode record);

    BGInvitecode selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGInvitecode record);

    int updateByPrimaryKeyWithBLOBs(BGInvitecode record);

    int updateByPrimaryKey(BGInvitecode record);
}