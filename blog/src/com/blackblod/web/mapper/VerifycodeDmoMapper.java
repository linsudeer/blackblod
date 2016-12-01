package com.blackblod.web.mapper;

import com.blackblod.web.dmo.VerifycodeDmo;

public interface VerifycodeDmoMapper {
    int deleteByOId(String oId);

    int insert(VerifycodeDmo record);

    int insertSelective(VerifycodeDmo record);

    VerifycodeDmo selectByOId(String oId);

    int updateByOIdSelective(VerifycodeDmo record);

    int updateByOId(VerifycodeDmo record);
}