package com.blackblod.web.mapper;

import com.blackblod.web.dmo.PointtransferDmo;

public interface PointtransferDmoMapper {
    int deleteByOId(String oId);

    int insert(PointtransferDmo record);

    int insertSelective(PointtransferDmo record);

    PointtransferDmo selectByOId(String oId);

    int updateByOIdSelective(PointtransferDmo record);

    int updateByOId(PointtransferDmo record);
}