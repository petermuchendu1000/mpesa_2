package com.huawei.digitalpayment.consumer.baselib.service;

import android.content.Context;
import com.blankj.utilcode.util.ThreadUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import java.util.Map;

public class EmptyDefaultOcrServiceIml implements IOcrService {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    @Override
    public void startOcr(Context context, Map<String, Object> map, ApiCallback<String> apiCallback) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        component1(apiCallback, 1001, "");
        int i4 = component2 + 79;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void component1(final ApiCallback<String> apiCallback, final int i, final String str) {
        int i2 = 2 % 2;
        ThreadUtils.runOnUiThread(new Runnable(this) {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public void run() {
                int i3 = 2 % 2;
                int i4 = component1 + 77;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    ApiCallback apiCallback2 = apiCallback;
                    if (apiCallback2 != null) {
                        apiCallback2.onError(new BaseException(String.valueOf(i), str));
                    }
                    int i5 = ShareDataUIState + 27;
                    component1 = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                throw null;
            }
        });
        int i3 = component2 + 57;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public boolean isSupportOcr() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 121;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 91;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }
}
