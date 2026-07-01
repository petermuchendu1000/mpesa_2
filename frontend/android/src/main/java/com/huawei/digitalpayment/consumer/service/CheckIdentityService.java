package com.huawei.digitalpayment.consumer.service;

import android.os.Bundle;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import java.util.Map;

public class CheckIdentityService implements ICheckIdentityService {
    private static int ShareDataUIState = 1;
    private static int copydefault;

    public static ApiCallback<Map<String, String>> getCallback() {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ApiCallback<Map<String, String>> callBack = CheckIdentityCallBackManager.INSTANCE.getCallBack();
        int i4 = copydefault + 43;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return callBack;
    }

    public static void setCallback(ApiCallback<Map<String, String>> apiCallback) {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        CheckIdentityCallBackManager.INSTANCE.setCallback(apiCallback);
        int i4 = copydefault + 61;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void checkIdentity(Bundle bundle, ApiCallback<Map<String, String>> apiCallback) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            CheckIdentityCallBackManager.INSTANCE.setCallback(apiCallback);
            RouteUtils.routeWithExecute(RoutePathConstants.CHECK_IDENTITY, bundle);
            int i3 = copydefault + 103;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 55 / 0;
                return;
            }
            return;
        }
        CheckIdentityCallBackManager.INSTANCE.setCallback(apiCallback);
        RouteUtils.routeWithExecute(RoutePathConstants.CHECK_IDENTITY, bundle);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
