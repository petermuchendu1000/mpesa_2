package com.huawei.digitalpayment.consumer.basic.model;

import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.util.encrypt.EncryptUtils;
import com.huawei.http.BaseResp;

public class BiometricOpenModel implements IBiometricOpenModel {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;

    @Override
    public void biometricOpen(String str, String str2, String str3, ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>(this) {
            private static int component1 = 1;
            private static int component3;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3;
                int i4 = i3 + 117;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 37;
                component1 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 98 / 0;
                }
                return "openBiometricLogin";
            }
        };
        paymentRequest.addParams("biometricType", str);
        paymentRequest.addParams("credential", str2);
        paymentRequest.addParams("initiatorPin", EncryptUtils.encryptWithPinKey(str3));
        paymentRequest.addParams("pinVersion", AppConfigManager.getAppConfig().getPinKeyVersion());
        sendRequest(paymentRequest, apiCallback);
        int i2 = ShareDataUIState + 21;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }
}
