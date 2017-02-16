package com.blackblod.web.mapper.basic;

public interface BaseMapper <T> {

	int removeByOId(T oId);

    int save(T record);

    int saveSelective(T record);

    T getByOId(String oId);

    int updateSelective(T record);

    int update(T record);
}
