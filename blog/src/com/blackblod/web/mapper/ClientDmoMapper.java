package com.blackblod.web.mapper;

import com.blackblod.web.dmo.ClientDmo;

public interface ClientDmoMapper {
    int deleteByOId(String oId);

    int insert(ClientDmo record);

    int insertSelective(ClientDmo record);

    ClientDmo selectByOId(String oId);

    int updateByOIdSelective(ClientDmo record);

    int updateByOId(ClientDmo record);
}