package com.blackblod.web.mapper;

import com.blackblod.web.dmo.NotificationDmo;

public interface NotificationDmoMapper {
    int deleteByOId(String oId);

    int insert(NotificationDmo record);

    int insertSelective(NotificationDmo record);

    NotificationDmo selectByOId(String oId);

    int updateByOIdSelective(NotificationDmo record);

    int updateByOId(NotificationDmo record);
}