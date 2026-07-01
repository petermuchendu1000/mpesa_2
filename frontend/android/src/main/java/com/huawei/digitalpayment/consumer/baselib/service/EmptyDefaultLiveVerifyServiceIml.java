package com.huawei.digitalpayment.consumer.baselib.service;

import android.content.Context;
import com.blankj.utilcode.util.ThreadUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import java.util.Map;

public class EmptyDefaultLiveVerifyServiceIml implements ILiveVerifyService {
    private static int component3 = 1;
    private static int copydefault;

    @Override
    public void startLiveVerify(Context context, Map<String, Object> map, Map<String, Object> map2, ApiCallback<String> apiCallback) {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState(apiCallback, 1001, "");
        int i4 = copydefault + 53;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void ShareDataUIState(final ApiCallback<String> apiCallback, final int i, final String str) {
        int i2 = 2 % 2;
        ThreadUtils.runOnUiThread(new Runnable(this) {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public void run() {
                int i3 = 2 % 2;
                int i4 = component1 + 51;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                ApiCallback apiCallback2 = apiCallback;
                if (apiCallback2 != null) {
                    apiCallback2.onError(new BaseException(String.valueOf(i), str));
                }
                int i6 = component2 + 79;
                component1 = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i3 = copydefault + 69;
        component3 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override
    public boolean isSupportLive() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        copydefault = i2 % 128;
        return i2 % 2 != 0;
    }
}
