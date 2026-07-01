package com.huawei.digitalpayment.consumer.baselib.service;

import android.content.Context;
import com.huawei.common.listener.ApiCallback;
import java.util.Map;

public interface ILiveVerifyService {
    boolean isSupportLive();

    void startLiveVerify(Context context, Map<String, Object> map, Map<String, Object> map2, ApiCallback<String> apiCallback);
}
