package com.huawei.digitalpayment.consumer.login.model;

import android.os.Build;
import com.google.gson.JsonObject;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.baselib.config.IAppConfig;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.service.IPushService;
import com.huawei.digitalpayment.consumer.baselib.util.PhoneUtils;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.model.LoginInfoRemote;
import com.huawei.digitalpayment.consumer.loginModule.util.LoginUtils;
import com.huawei.digitalpayment.consumer.loginModule.util.ModelMappingUtils;

public class BiometricLoginModel implements IBiometricLoginModel {
    private static int component1 = 0;
    private static int copydefault = 1;

    @Override
    public void biometricLogin(String str, String str2, ApiCallback<LocalLoginInfo> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<LocalLoginInfo> paymentRequest = new PaymentRequest<LocalLoginInfo>(this) {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public Object convert(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = component2 + 87;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                LocalLoginInfo localLoginInfoShareDataUIState = ShareDataUIState(jsonObject);
                int i5 = component2 + 125;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return localLoginInfoShareDataUIState;
            }

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState;
                int i4 = i3 + 13;
                component2 = i4 % 128;
                Object obj = null;
                if (i4 % 2 != 0) {
                    throw null;
                }
                int i5 = i3 + 47;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    return "biometricLogin";
                }
                obj.hashCode();
                throw null;
            }

            protected LocalLoginInfo ShareDataUIState(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = component2 + 109;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    LoginInfoRemote loginInfoRemote = (LoginInfoRemote) SecureGsonUtils.fromJson(jsonObject.toString(), LoginInfoRemote.class);
                    if (loginInfoRemote == null) {
                        loginInfoRemote = new LoginInfoRemote();
                        int i4 = ShareDataUIState + 51;
                        component2 = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    LoginUtils.saveIdentityId(jsonObject);
                    return ModelMappingUtils.toLocalLoginInfo(loginInfoRemote, jsonObject.toString());
                }
                throw null;
            }
        };
        paymentRequest.addParams("initiatorMsisdn", PhoneUtils.getRecentLoginPhone());
        paymentRequest.addParams("credential", str2);
        paymentRequest.addParams("biometricType", str);
        paymentRequest.addParams("osVersion", Build.VERSION.RELEASE);
        paymentRequest.addParams("deviceType", Build.BRAND);
        paymentRequest.addParams("deviceToken", ((IPushService) RouteUtils.getService(IPushService.class)).getFirebaseToken());
        paymentRequest.addParams("tcVersion", SPUtils.getInstance().getString(SPConstant.TERMS_VERSION));
        paymentRequest.addParams("isReturnTheme", Boolean.valueOf(((IAppConfig) RouteUtils.getService(IAppConfig.class)).useTheme()));
        sendRequest(paymentRequest, apiCallback);
        int i2 = copydefault + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }
}
