package com.huawei.digitalpayment.consumer.basicUi.model;

import android.os.Build;
import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.JsonObject;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.service.IPushService;
import com.huawei.digitalpayment.consumer.basicUi.response.LocalQueryLoginType;
import com.huawei.digitalpayment.consumer.basicUi.response.NetworkQueryLoginType;
import com.huawei.digitalpayment.consumer.basicUi.util.ModelMappingUtils;
import javax.inject.Inject;

public class DefaultSplashModel implements ISplashModel {
    private static int component2 = 0;
    private static int component3 = 1;

    @Inject
    public DefaultSplashModel() {
    }

    @Override
    public void queryLoginType(String str, ApiCallback<LocalQueryLoginType> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<LocalQueryLoginType> paymentRequest = new PaymentRequest<LocalQueryLoginType>(this) {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public Object convert(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = copydefault + 53;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                LocalQueryLoginType localQueryLoginTypeComponent1 = component1(jsonObject);
                int i5 = copydefault + 79;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    return localQueryLoginTypeComponent1;
                }
                throw null;
            }

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 37;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 67 / 0;
                }
                int i6 = i3 + 77;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return "queryLoginType";
            }

            protected LocalQueryLoginType component1(JsonObject jsonObject) {
                LocalQueryLoginType localQueryLoginType;
                int i2 = 2 % 2;
                int i3 = copydefault + 87;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                String string = jsonObject.toString();
                if (i4 == 0) {
                    localQueryLoginType = ModelMappingUtils.toLocalQueryLoginType((NetworkQueryLoginType) GsonUtils.fromJson(string, NetworkQueryLoginType.class));
                    int i5 = 37 / 0;
                } else {
                    localQueryLoginType = ModelMappingUtils.toLocalQueryLoginType((NetworkQueryLoginType) GsonUtils.fromJson(string, NetworkQueryLoginType.class));
                }
                int i6 = component2 + 33;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    return localQueryLoginType;
                }
                throw null;
            }
        };
        paymentRequest.addParams("initiatorMsisdn", str);
        paymentRequest.addParams("osVersion", Build.VERSION.RELEASE);
        paymentRequest.addParams("deviceType", Build.MODEL);
        paymentRequest.addParams("deviceToken", ((IPushService) RouteUtils.getService(IPushService.class)).getFirebaseToken());
        sendRequest(paymentRequest, apiCallback);
        int i2 = component2 + 89;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
