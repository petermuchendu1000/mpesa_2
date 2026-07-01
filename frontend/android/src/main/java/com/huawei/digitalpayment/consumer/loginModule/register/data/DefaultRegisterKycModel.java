package com.huawei.digitalpayment.consumer.loginModule.register.data;

import android.text.TextUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.register.repository.AsyncRegisterVerifyRepository;
import com.huawei.digitalpayment.consumer.loginModule.register.repository.RegisterVerifyRepository;
import com.huawei.digitalpayment.consumer.loginModule.register.request.RegisterParams;
import javax.inject.Inject;

public class DefaultRegisterKycModel implements RegisterKycModel, AutoLoginModel {
    private static int component2 = 1;
    private static int copydefault;

    @Inject
    public DefaultRegisterKycModel() {
    }

    @Override
    public void registerWithKyc(RegisterParams registerParams, final ApiCallback<LocalLoginInfo> apiCallback) {
        int i = 2 % 2;
        sendRequest(new RegisterVerifyRepository(registerParams), new ApiCallback<LocalLoginInfo>() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public void onSuccess(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component2 + 117;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                component3(localLoginInfo);
                int i5 = component2 + 73;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void component3(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component2 + 69;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    if (!TextUtils.isEmpty(localLoginInfo.getExecute())) {
                        int i4 = component1 + 23;
                        component2 = i4 % 128;
                        int i5 = i4 % 2;
                        if ((!localLoginInfo.getExecute().endsWith(RoutePathConstants.NEW_MAIN)) && !localLoginInfo.getExecute().endsWith(RoutePathConstants.MAIN)) {
                            apiCallback.onSuccess(localLoginInfo);
                            return;
                        }
                    }
                    DefaultRegisterKycModel.this.autoLogin(apiCallback);
                    return;
                }
                TextUtils.isEmpty(localLoginInfo.getExecute());
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component1 + 45;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                apiCallback.onError(baseException);
                if (i4 == 0) {
                    throw null;
                }
            }
        });
        int i2 = component2 + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void asyncRegisterWithKyc(RegisterParams registerParams, final ApiCallback<LocalLoginInfo> apiCallback) {
        int i = 2 % 2;
        sendRequest(new AsyncRegisterVerifyRepository(registerParams), new ApiCallback<LocalLoginInfo>(this) {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component1 + 115;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                component3(localLoginInfo);
                if (i4 == 0) {
                    throw null;
                }
            }

            public void component3(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component1 + 101;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                apiCallback.onSuccess(localLoginInfo);
                int i5 = copydefault + 25;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = copydefault + 105;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                apiCallback.onError(baseException);
                int i5 = component1 + 77;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component2 + 97;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
