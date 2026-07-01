package com.huawei.digitalpayment.consumer.service;

import android.os.Bundle;
import com.huawei.common.listener.ApiCallback;
import java.util.Map;

public interface ICheckIdentityService {
    void checkIdentity(Bundle bundle, ApiCallback<Map<String, String>> apiCallback);
}
