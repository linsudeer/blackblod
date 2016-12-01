package com.blackblod.web.mapper;

import com.blackblod.web.dmo.FollowDmo;

public interface FollowDmoMapper {
    int deleteByOId(String oId);

    int insert(FollowDmo record);

    int insertSelective(FollowDmo record);

    FollowDmo selectByOId(String oId);

    int updateByOIdSelective(FollowDmo record);

    int updateByOId(FollowDmo record);
}