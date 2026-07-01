package com.huawei.digitalpayment.consumer.loginModule.register.data;

import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.register.repository.SetPinRepository;
import com.huawei.digitalpayment.consumer.loginModule.register.request.SetPinParams;

public interface SetPinModel extends AutoLoginModel {
    default void setPin(SetPinParams setPinParams, final ApiCallback<LocalLoginInfo> apiCallback) {
        int i = 2 % 2;
        sendRequest(new SetPinRepository(setPinParams), new ApiCallback<LocalLoginInfo>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = component1 + 9;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                component2(localLoginInfo);
                int i5 = component3 + 79;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 8 / 0;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
            
                r3.copydefault.autoLogin(r2);
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
                r4 = com.huawei.digitalpayment.consumer.loginModule.register.data.SetPinModel.AnonymousClass1.component1 + 17;
                com.huawei.digitalpayment.consumer.loginModule.register.data.SetPinModel.AnonymousClass1.component3 = r4 % 128;
                r4 = r4 % 2;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void component2(com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo r4) {
                /*
                    r3 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.loginModule.register.data.SetPinModel.AnonymousClass1.component3
                    int r1 = r1 + 59
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.loginModule.register.data.SetPinModel.AnonymousClass1.component1 = r2
                    int r1 = r1 % r0
                    if (r1 == 0) goto L1d
                    java.lang.String r1 = r4.getExecute()
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    r2 = 41
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
                    int r4 = com.huawei.digitalpayment.consumer.loginModule.register.data.SetPinModel.AnonymousClass1.component1
                    int r4 = r4 + 17
                    int r1 = r4 % 128
                    com.huawei.digitalpayment.consumer.loginModule.register.data.SetPinModel.AnonymousClass1.component3 = r1
                    int r4 = r4 % r0
                    return
                L36:
                    com.huawei.digitalpayment.consumer.loginModule.register.data.SetPinModel r4 = com.huawei.digitalpayment.consumer.loginModule.register.data.SetPinModel.this
                    com.huawei.common.listener.ApiCallback r0 = r2
                    r4.autoLogin(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.data.SetPinModel.AnonymousClass1.component2(com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo):void");
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 89;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ApiCallback apiCallback2 = apiCallback;
                if (apiCallback2 != null) {
                    apiCallback2.onError(baseException);
                    int i4 = component1 + 61;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
        });
    }
}
