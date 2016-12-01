package com.blackblod.web.mapper;

import com.blackblod.web.dmo.InvitecodeDmo;

public interface InvitecodeDmoMapper {
    int deleteByOId(String oId);

    int insert(InvitecodeDmo record);

    int insertSelective(InvitecodeDmo record);

    InvitecodeDmo selectByOId(String oId);

    int updateByOIdSelective(InvitecodeDmo record);

    int updateByOIdWithBLOBs(InvitecodeDmo record);

    int updateByOId(InvitecodeDmo record);
}