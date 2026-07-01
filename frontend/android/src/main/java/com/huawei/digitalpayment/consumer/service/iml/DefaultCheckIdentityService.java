package com.huawei.digitalpayment.consumer.service.iml;

import android.os.Bundle;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.service.ICheckIdentityService;
import java.util.Map;

public class DefaultCheckIdentityService implements ICheckIdentityService {
    private static int component1 = 1;
    private static int component3;

    @Override
    public void checkIdentity(Bundle bundle, ApiCallback<Map<String, String>> apiCallback) {
        int i = 2 % 2;
        int i2 = component1 + 69;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }
}
