package com.blackblod.web.mapper;

import com.blackblod.web.dmo.BGNotification;

public interface BGNotificationMapper {
    int deleteByPrimaryKey(String oId);

    int insert(BGNotification record);

    int insertSelective(BGNotification record);

    BGNotification selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(BGNotification record);

    int updateByPrimaryKey(BGNotification record);
}