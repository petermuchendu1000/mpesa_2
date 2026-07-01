package com.huawei.digitalpayment.consumer.service;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.Utils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.module.UserLifecycleManager;
import com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo;
import com.huawei.digitalpayment.consumer.loginModule.register.repository.AutoLoginRepository;
import com.huawei.digitalpayment.consumer.mpin.ui.activity.IdentifyPinActivity;
import com.huawei.digitalpayment.consumer.service.ILoginModuleService;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/service/LoginModuleService;", "Lcom/huawei/digitalpayment/consumer/service/ILoginModuleService;", "<init>", "()V", "getIdentityPinIntent", "Landroid/content/Intent;", "autoLogin", "", "callbacks", "Lcom/huawei/common/listener/ApiCallback;", "Lcom/huawei/http/BaseResp;", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LoginModuleService implements ILoginModuleService {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 51 % 128;
    private static int component2 = 0;
    private static int component3 = 1;

    @Override
    public void identityPIN(Activity activity, Bundle bundle, ApiCallback<Bundle> apiCallback) {
        int i = 2 % 2;
        int i2 = component3 + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ILoginModuleService.DefaultImpls.identityPIN(this, activity, bundle, apiCallback);
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
        int i5 = component3 + 91;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public Intent getIdentityPinIntent() {
        int i = 2 % 2;
        Intent intent = new Intent();
        intent.setClassName(Utils.getApp().getPackageName(), IdentifyPinActivity.class.getName());
        int i2 = component3 + 91;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return intent;
    }

    @Override
    public void autoLogin(final ApiCallback<BaseResp> callbacks) {
        int i = 2 % 2;
        new AutoLoginRepository().sendRequest(new ApiCallback<LocalLoginInfo>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public void onSuccess(LocalLoginInfo localLoginInfo) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 57;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(localLoginInfo);
                if (i4 == 0) {
                    throw null;
                }
            }

            public void onSuccess2(LocalLoginInfo value) {
                int i2 = 2 % 2;
                int i3 = component1 + 89;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                super.onSuccess(value);
                UserLifecycleManager.get().loginSuccess(Utils.getApp(), GsonUtils.toJson(value), true);
                ApiCallback<BaseResp> apiCallback = callbacks;
                if (apiCallback != null) {
                    int i5 = ShareDataUIState + 77;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    apiCallback.onSuccess(value);
                }
                int i7 = ShareDataUIState + 53;
                component1 = i7 % 128;
                int i8 = i7 % 2;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                ApiCallback<BaseResp> apiCallback = callbacks;
                if (apiCallback != null) {
                    int i3 = component1 + 113;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                    apiCallback.onError(e);
                    if (i4 != 0) {
                        throw null;
                    }
                    int i5 = ShareDataUIState + 87;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
        });
        int i2 = ShareDataUIState + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    static {
        if (51 % 2 == 0) {
            throw null;
        }
    }
}
