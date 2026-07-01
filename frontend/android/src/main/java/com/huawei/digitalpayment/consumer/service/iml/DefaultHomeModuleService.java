package com.huawei.digitalpayment.consumer.service.iml;

import com.huawei.digitalpayment.consumer.service.IHomeModuleService;

public class DefaultHomeModuleService implements IHomeModuleService {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    @Override
    public String getMiniAppName(String str, String str2) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 41;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 7 / 0;
        }
        int i5 = i2 + 81;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str2;
    }
}
