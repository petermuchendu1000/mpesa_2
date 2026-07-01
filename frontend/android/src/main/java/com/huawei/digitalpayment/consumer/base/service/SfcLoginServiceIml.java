package com.huawei.digitalpayment.consumer.base.service;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.Utils;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.module.UserLifecycleManager;
import com.huawei.digitalpayment.consumer.base.constants.BaseRoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.init.TokenHelper;
import com.huawei.digitalpayment.consumer.baselib.service.DefaultLoginServiceIml;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/service/SfcLoginServiceIml;", "Lcom/huawei/digitalpayment/consumer/baselib/service/DefaultLoginServiceIml;", "<init>", "()V", "isLogin", "", "logout", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SfcLoginServiceIml extends DefaultLoginServiceIml {
    private static int ShareDataUIState = 1;
    private static int component1;

    @Override
    public boolean isLogin() {
        int i = 2 % 2;
        if (TextUtils.isEmpty(TokenHelper.INSTANCE.getLoginToken())) {
            int i2 = ShareDataUIState + 87;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        for (Activity activity : ActivityUtils.getActivityList()) {
            int i4 = ShareDataUIState + 111;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            if (StringsKt.contains$default((CharSequence) activity.toString(), (CharSequence) "NewHomeActivity", false, 2, (Object) null)) {
                return true;
            }
            int i6 = component1 + 21;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            if (StringsKt.contains$default((CharSequence) activity.toString(), (CharSequence) "ThemeActivity", false, 2, (Object) null)) {
                return true;
            }
        }
        int i8 = ShareDataUIState + 27;
        component1 = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    @Override
    public void logout() {
        int i = 2 % 2;
        Bundle bundle = new Bundle(1);
        bundle.putBoolean("sessionOut", true);
        RouteUtils.routeWithExecute(BaseRoutePathConstants.SFC_SPLASH, bundle);
        ActivityUtils.finishAllActivities();
        UserLifecycleManager.get().logout(Utils.getApp());
        int i2 = ShareDataUIState + 53;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }
}
