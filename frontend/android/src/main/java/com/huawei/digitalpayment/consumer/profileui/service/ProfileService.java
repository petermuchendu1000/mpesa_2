package com.huawei.digitalpayment.consumer.profileui.service;

import com.blankj.utilcode.util.GsonUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalCustomer;
import com.huawei.digitalpayment.consumer.profile.util.ProfileHelper;
import com.huawei.digitalpayment.consumer.service.IProfileService;

public class ProfileService implements IProfileService {
    private static int component1 = 1;
    private static int component3;

    @Override
    public String getUserProfile() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LocalCustomer customer = ProfileHelper.INSTANCE.getCustomer();
        if (customer == null) {
            int i4 = component3 + 47;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 15 / 0;
            }
            return null;
        }
        String json = GsonUtils.toJson(customer);
        int i6 = component3 + 29;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            return json;
        }
        throw null;
    }

    @Override
    public String getNickName() {
        int i = 2 % 2;
        LocalCustomer customer = ProfileHelper.INSTANCE.getCustomer();
        if (customer == null) {
            int i2 = component1 + 33;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return "";
            }
            throw null;
        }
        String name = customer.getName();
        int i3 = component3 + 117;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 95 / 0;
        }
        return name;
    }

    @Override
    public String getShowMsisdn() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LocalCustomer customer = ProfileHelper.INSTANCE.getCustomer();
        if (customer != null) {
            String showMsisdn = customer.getShowMsisdn();
            String phoneNumberCode = AppConfigManager.getAppConfig().getPhoneNumberCode();
            if (showMsisdn != null && showMsisdn.startsWith(phoneNumberCode)) {
                showMsisdn = showMsisdn.replaceFirst(AppConfigManager.getAppConfig().getPhoneNumberCode(), "");
                int i4 = component3 + 7;
                component1 = i4 % 128;
                int i5 = i4 % 2;
            }
            return "(+" + phoneNumberCode + ") " + showMsisdn;
        }
        int i6 = component1 + 101;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return "";
    }

    @Override
    public String getUserAvatar() {
        LocalCustomer customer;
        int i = 2 % 2;
        int i2 = component1 + 73;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            customer = ProfileHelper.INSTANCE.getCustomer();
            int i3 = 88 / 0;
            if (customer == null) {
                return "";
            }
        } else {
            customer = ProfileHelper.INSTANCE.getCustomer();
            if (customer == null) {
                return "";
            }
        }
        String avatar = customer.getAvatar();
        int i4 = component3 + 29;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return avatar;
        }
        throw null;
    }
}
