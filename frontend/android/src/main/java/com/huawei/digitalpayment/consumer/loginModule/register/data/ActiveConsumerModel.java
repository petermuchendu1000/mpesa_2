package com.huawei.digitalpayment.consumer.loginModule.register.data;

import android.text.TextUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.register.repository.ActiveConsumerRepository;
import com.huawei.digitalpayment.consumer.loginModule.register.repository.AsyncRegisterVerifyRepository;
import com.huawei.digitalpayment.consumer.loginModule.register.repository.RegisterVerifyRepository;
import com.huawei.digitalpayment.consumer.loginModule.register.repository.SetPinRepository;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ActiveConsumerParams;
import com.huawei.digitalpayment.consumer.loginModule.register.request.RegisterParams;
import com.huawei.digitalpayment.consumer.loginModule.register.request.SetPinParams;

public interface ActiveConsumerModel extends AutoLoginModel {
    default void activeConsumer(ActiveConsumerParams activeConsumerParams, final ApiCallback<LocalLoginInfo> apiCallback) {
        int i = 2 % 2;
        sendRequest(new ActiveConsumerRepository(activeConsumerParams), new ApiCallback<LocalLoginInfo>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public void onSuccess(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component1 + 73;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                component2(localLoginInfo);
                int i5 = component1 + 95;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void component2(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component2 + 101;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                if (!TextUtils.isEmpty(localLoginInfo.getExecute()) && (!localLoginInfo.getExecute().contains(RoutePathConstants.MAIN))) {
                    int i5 = component2 + 113;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    if (!localLoginInfo.getExecute().contains(RoutePathConstants.NEW_MAIN)) {
                        apiCallback.onSuccess(localLoginInfo);
                        int i7 = component2 + 99;
                        component1 = i7 % 128;
                        int i8 = i7 % 2;
                        return;
                    }
                }
                ActiveConsumerModel.m10701$$Nest$mautoLoginAndGetConfig(ActiveConsumerModel.this, apiCallback);
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                ApiCallback apiCallback2 = apiCallback;
                if (apiCallback2 != null) {
                    int i3 = component1 + 25;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                    apiCallback2.onError(baseException);
                    int i5 = component1 + 121;
                    component2 = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 3 % 4;
                    }
                }
            }
        });
    }

    private default void component2(final ApiCallback<LocalLoginInfo> apiCallback) {
        int i = 2 % 2;
        autoLogin(new ApiCallback<LocalLoginInfo>(this) {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public void onSuccess(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component1 + 79;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                ShareDataUIState(localLoginInfo);
                if (i4 != 0) {
                    throw null;
                }
            }

            public void ShareDataUIState(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 55;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                super.onSuccess(localLoginInfo);
                ApiCallback apiCallback2 = apiCallback;
                if (apiCallback2 != null) {
                    int i5 = ShareDataUIState + 121;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    apiCallback2.onSuccess(localLoginInfo);
                    if (i6 == 0) {
                        int i7 = 71 / 0;
                    }
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                super.onError(baseException);
                ApiCallback apiCallback2 = apiCallback;
                if (apiCallback2 != null) {
                    int i3 = ShareDataUIState + 39;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    apiCallback2.onError(baseException);
                    if (i4 == 0) {
                        throw null;
                    }
                }
                int i5 = ShareDataUIState + 101;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
    }

    default void setPin(SetPinParams setPinParams, final ApiCallback<LocalLoginInfo> apiCallback) {
        int i = 2 % 2;
        sendRequest(new SetPinRepository(setPinParams), new ApiCallback<LocalLoginInfo>() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public void onSuccess(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component2 + 23;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                component1(localLoginInfo);
                if (i4 != 0) {
                    int i5 = 99 / 0;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
            
                r3.ShareDataUIState.autoLogin(r2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
            
                if (android.text.TextUtils.isEmpty(r4.getExecute()) == false) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
            
                if (android.text.TextUtils.isEmpty(r4.getExecute()) == false) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
            
                r2.onSuccess(r4);
                r4 = com.huawei.digitalpayment.consumer.loginModule.register.data.ActiveConsumerModel.AnonymousClass4.component2 + 21;
                com.huawei.digitalpayment.consumer.loginModule.register.data.ActiveConsumerModel.AnonymousClass4.component1 = r4 % 128;
                r4 = r4 % 2;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void component1(com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo r4) {
                /*
                    r3 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.loginModule.register.data.ActiveConsumerModel.AnonymousClass4.component2
                    int r1 = r1 + 5
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.loginModule.register.data.ActiveConsumerModel.AnonymousClass4.component1 = r2
                    int r1 = r1 % r0
                    if (r1 == 0) goto L1d
                    java.lang.String r1 = r4.getExecute()
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    r2 = 55
                    int r2 = r2 / 0
                    if (r1 != 0) goto L36
                    goto L27
                L1d:
                    java.lang.String r1 = r4.getExecute()
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    if (r1 != 0) goto L36
                L27:
                    com.huawei.common.listener.ApiCallback r1 = r2
                    r1.onSuccess(r4)
                    int r4 = com.huawei.digitalpayment.consumer.loginModule.register.data.ActiveConsumerModel.AnonymousClass4.component2
                    int r4 = r4 + 21
                    int r1 = r4 % 128
                    com.huawei.digitalpayment.consumer.loginModule.register.data.ActiveConsumerModel.AnonymousClass4.component1 = r1
                    int r4 = r4 % r0
                    return
                L36:
                    com.huawei.digitalpayment.consumer.loginModule.register.data.ActiveConsumerModel r4 = com.huawei.digitalpayment.consumer.loginModule.register.data.ActiveConsumerModel.this
                    com.huawei.common.listener.ApiCallback r0 = r2
                    r4.autoLogin(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.data.ActiveConsumerModel.AnonymousClass4.component1(com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo):void");
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component1 + 33;
                int i4 = i3 % 128;
                component2 = i4;
                int i5 = i3 % 2;
                ApiCallback apiCallback2 = apiCallback;
                if (apiCallback2 != null) {
                    int i6 = i4 + 1;
                    component1 = i6 % 128;
                    int i7 = i6 % 2;
                    apiCallback2.onError(baseException);
                    if (i7 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    int i8 = component2 + 115;
                    component1 = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
        });
    }

    default void registerWithKyc(RegisterParams registerParams, final ApiCallback<LocalLoginInfo> apiCallback) {
        int i = 2 % 2;
        sendRequest(new RegisterVerifyRepository(registerParams), new ApiCallback<LocalLoginInfo>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component1 + 71;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                component2(localLoginInfo);
                int i5 = component1 + 17;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 68 / 0;
                }
            }

            public void component2(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component1 + 1;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                ActiveConsumerModel.this.autoLogin(apiCallback);
                int i5 = copydefault + 5;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component1 + 61;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    apiCallback.onError(baseException);
                    int i4 = 62 / 0;
                } else {
                    apiCallback.onError(baseException);
                }
                int i5 = copydefault + 27;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
    }

    default void asyncRegisterWithKyc(RegisterParams registerParams, final ApiCallback<LocalLoginInfo> apiCallback) {
        int i = 2 % 2;
        sendRequest(new AsyncRegisterVerifyRepository(registerParams), new ApiCallback<LocalLoginInfo>(this) {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public void onSuccess(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 119;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                component1(localLoginInfo);
                if (i4 != 0) {
                    int i5 = 79 / 0;
                }
                int i6 = ShareDataUIState + 113;
                copydefault = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 60 / 0;
                }
            }

            public void component1(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = copydefault + 49;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    apiCallback.onSuccess(localLoginInfo);
                    throw null;
                }
                apiCallback.onSuccess(localLoginInfo);
                int i4 = copydefault + 19;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = copydefault + 45;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                apiCallback.onError(baseException);
                if (i4 == 0) {
                    throw null;
                }
            }
        });
    }

    static void m10701$$Nest$mautoLoginAndGetConfig(ActiveConsumerModel activeConsumerModel, ApiCallback apiCallback) {
        int i = 2 % 2;
        activeConsumerModel.component2(apiCallback);
    }
}
