package com.huawei.digitalpayment.consumer.loginModule.mpin.data;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.loginModule.mpin.request.GetPinTokenParams;
import javax.inject.Inject;

public class GetTokenModel implements IGetTokenModel {
    private static int ShareDataUIState = 1;
    private static int component2;

    @Inject
    public GetTokenModel() {
    }

    @Override
    public void getPinToken(GetPinTokenParams getPinTokenParams, ApiCallback<String> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<String> paymentRequest = new PaymentRequest<String>(this) {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public Object convert(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = component1 + 3;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    ShareDataUIState(jsonObject);
                    throw null;
                }
                String strShareDataUIState = ShareDataUIState(jsonObject);
                int i4 = copydefault + 105;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 43 / 0;
                }
                return strShareDataUIState;
            }

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 71;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 105;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                return "authSensitiveOperationToken";
            }

            protected String ShareDataUIState(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = component1 + 39;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                JsonElement jsonElement = jsonObject.get("pinToken");
                if (jsonElement == null) {
                    return "";
                }
                String asString = jsonElement.getAsString();
                int i5 = component1 + 77;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return asString;
            }
        };
        paymentRequest.addParams(getPinTokenParams);
        paymentRequest.addParams("pinVersion", AppConfigManager.getAppConfig().getPinKeyVersion());
        sendRequest(paymentRequest, apiCallback);
        int i2 = ShareDataUIState + 85;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }
}
