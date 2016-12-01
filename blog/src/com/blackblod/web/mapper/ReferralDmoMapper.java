package com.blackblod.web.mapper;

import com.blackblod.web.dmo.ReferralDmo;

public interface ReferralDmoMapper {
    int deleteByOId(String oId);

    int insert(ReferralDmo record);

    int insertSelective(ReferralDmo record);

    ReferralDmo selectByOId(String oId);

    int updateByOIdSelective(ReferralDmo record);

    int updateByOId(ReferralDmo record);
}