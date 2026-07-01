package com.huawei.digitalpayment.consumer.service.iml;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.service.ILoginModuleService;
import com.huawei.http.BaseResp;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/service/iml/DefaultLoginModuleService;", "Lcom/huawei/digitalpayment/consumer/service/ILoginModuleService;", "<init>", "()V", "getIdentityPinIntent", "Landroid/content/Intent;", "ServiceModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultLoginModuleService implements ILoginModuleService {
    private static int component2 = 0;
    private static int copydefault = 1;

    @Override
    public void autoLogin(ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        int i2 = component2 + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ILoginModuleService.DefaultImpls.autoLogin(this, apiCallback);
        if (i3 == 0) {
            throw null;
        }
        int i4 = component2 + 111;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void identityPIN(Activity activity, Bundle bundle, ApiCallback<Bundle> apiCallback) {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ILoginModuleService.DefaultImpls.identityPIN(this, activity, bundle, apiCallback);
        if (i3 != 0) {
            throw null;
        }
    }

    @Override
    public Intent getIdentityPinIntent() {
        int i = 2 % 2;
        Intent intent = new Intent();
        int i2 = copydefault + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return intent;
    }
}
