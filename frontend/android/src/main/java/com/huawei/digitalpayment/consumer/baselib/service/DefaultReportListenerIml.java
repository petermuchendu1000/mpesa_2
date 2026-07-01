package com.huawei.digitalpayment.consumer.baselib.service;

import java.util.Map;

public class DefaultReportListenerIml implements IReportListener {
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public void openMiniAppFail(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void openMiniAppSuccess(String str) {
        int i = 2 % 2;
        int i2 = component3 + 97;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void report(String str) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void report(String str, Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void reportAll(String str) {
        int i = 2 % 2;
        int i2 = component3 + 51;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void unionFetch(boolean z, String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }
}
