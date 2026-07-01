package com.huawei.digitalpayment.consumer.baselib.service;

import android.content.Context;
import com.huawei.common.listener.ApiCallback;
import java.util.Map;

public interface IOcrService {
    boolean isSupportOcr();

    void startOcr(Context context, Map<String, Object> map, ApiCallback<String> apiCallback);
}
