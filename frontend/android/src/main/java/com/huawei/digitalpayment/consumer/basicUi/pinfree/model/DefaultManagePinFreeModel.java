package com.huawei.digitalpayment.consumer.basicUi.pinfree.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.basicUi.pinfree.repository.ManagePinFreeRepository;
import com.huawei.digitalpayment.consumer.basicUi.pinfree.repository.QueryFreePinRepository;
import com.huawei.digitalpayment.consumer.basicUi.response.FreePinResponse;
import com.huawei.http.BaseResp;
import javax.inject.Inject;

public class DefaultManagePinFreeModel implements ManagePinFreeModel {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    @Inject
    public DefaultManagePinFreeModel() {
    }

    @Override
    public void managePinFreePayment(String str, String str2, String str3, ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        new ManagePinFreeRepository(str, str2, str3).sendRequest(apiCallback);
        int i2 = component3 + 103;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void queryFreePin(ApiCallback<FreePinResponse> apiCallback) {
        int i = 2 % 2;
        new QueryFreePinRepository().sendRequest(apiCallback);
        int i2 = component3 + 55;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
