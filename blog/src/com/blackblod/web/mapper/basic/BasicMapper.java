package com.blackblod.web.mapper.basic;

import com.blackblod.web.dmo.BGUser;

public interface BasicMapper <T> {

	int deleteByPrimaryKey(T oId);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
