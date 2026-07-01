package com.huawei.digitalpayment.consumer.baselib.service;

import java.util.Map;

public interface IReportListener {
    void openMiniAppFail(String str);

    void openMiniAppSuccess(String str);

    void report(String str);

    void report(String str, Map<String, Object> map);

    void reportAll(String str);

    void unionFetch(boolean z, String str, String str2, String str3);
}
