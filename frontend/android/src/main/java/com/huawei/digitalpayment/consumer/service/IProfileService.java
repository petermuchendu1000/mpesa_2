package com.huawei.digitalpayment.consumer.service;

import com.huawei.common.util.SPUtils;

public interface IProfileService {
    public static final String RECENT_IDENTITY_ID = "recentIdentityID";

    String getUserProfile();

    default String getIdentityId() {
        int i = 2 % 2;
        return SPUtils.getInstance().getString("recentIdentityID");
    }

    default String getNickName() {
        int i = 2 % 2;
        return null;
    }

    default String getRole() {
        int i = 2 % 2;
        return null;
    }

    default String getShowMsisdn() {
        int i = 2 % 2;
        return null;
    }

    default String getUserAvatar() {
        int i = 2 % 2;
        return null;
    }
}
