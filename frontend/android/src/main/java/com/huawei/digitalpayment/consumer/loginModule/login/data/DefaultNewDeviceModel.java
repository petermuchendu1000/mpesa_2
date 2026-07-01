package com.huawei.digitalpayment.consumer.loginModule.login.data;

import android.text.TextUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request.IdentityVerifyParams;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.network.IdentityVerifyRepository;
import com.huawei.digitalpayment.consumer.loginModule.register.data.AutoLoginModel;
import javax.inject.Inject;

public class DefaultNewDeviceModel implements NewDeviceModel, AutoLoginModel {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;

    @Inject
    public DefaultNewDeviceModel() {
    }

    @Override
    public void identityVerify(IdentityVerifyParams identityVerifyParams, ApiCallback<LocalLoginInfo> apiCallback) {
        int i = 2 % 2;
        sendRequest(new IdentityVerifyRepository(identityVerifyParams), apiCallback);
        int i2 = ShareDataUIState + 75;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void identityVerifyAndLogin(IdentityVerifyParams identityVerifyParams, final ApiCallback<LocalLoginInfo> apiCallback) {
        int i = 2 % 2;
        identityVerify(identityVerifyParams, new ApiCallback<LocalLoginInfo>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component3 + 101;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                copydefault(localLoginInfo);
                int i5 = component2 + 115;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void copydefault(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                if (!TextUtils.isEmpty(localLoginInfo.getExecute())) {
                    int i3 = component2 + 67;
                    component3 = i3 % 128;
                    if (i3 % 2 != 0) {
                        apiCallback.onSuccess(localLoginInfo);
                        return;
                    } else {
                        apiCallback.onSuccess(localLoginInfo);
                        int i4 = 72 / 0;
                        return;
                    }
                }
                DefaultNewDeviceModel.this.autoLogin(apiCallback);
                int i5 = component3 + 77;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 80 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 43;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    apiCallback.onError(baseException);
                    int i4 = 17 / 0;
                } else {
                    apiCallback.onError(baseException);
                }
                int i5 = component3 + 45;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = ShareDataUIState + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }
}
