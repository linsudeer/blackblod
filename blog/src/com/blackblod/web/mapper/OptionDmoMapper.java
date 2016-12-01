package com.blackblod.web.mapper;

import com.blackblod.web.dmo.OptionDmo;

public interface OptionDmoMapper {
    int deleteByOId(String oId);

    int insert(OptionDmo record);

    int insertSelective(OptionDmo record);

    OptionDmo selectByOId(String oId);

    int updateByOIdSelective(OptionDmo record);

    int updateByOIdWithBLOBs(OptionDmo record);

    int updateByOId(OptionDmo record);
}