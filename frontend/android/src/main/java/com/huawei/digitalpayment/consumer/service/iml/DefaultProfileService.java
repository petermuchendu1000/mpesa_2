package com.huawei.digitalpayment.consumer.service.iml;

import com.huawei.digitalpayment.consumer.service.IProfileService;

public class DefaultProfileService implements IProfileService {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Override
    public String getUserProfile() {
        int i = 2 % 2;
        int i2 = component1 + 19;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        int i3 = 28 / 0;
        return null;
    }
}
