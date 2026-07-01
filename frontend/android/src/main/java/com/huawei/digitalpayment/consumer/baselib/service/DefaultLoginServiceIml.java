package com.huawei.digitalpayment.consumer.baselib.service;

import android.app.Activity;
import android.text.TextUtils;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.Utils;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.module.UserLifecycleManager;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.init.TokenHelper;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0016J\"\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0016J\u0018\u0010\u0015\u001a\u00020\u00102\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/service/DefaultLoginServiceIml;", "Lcom/huawei/digitalpayment/consumer/baselib/service/ILoginService;", "<init>", "()V", "resetPinCallback", "Lcom/huawei/common/listener/ApiCallback;", "", "getResetPinCallback", "()Lcom/huawei/common/listener/ApiCallback;", "setResetPinCallback", "(Lcom/huawei/common/listener/ApiCallback;)V", "inactiveResetPinCallback", "getInactiveResetPinCallback", "setInactiveResetPinCallback", "isLogin", "logout", "", "resetPin", "callback", "activity", "Landroid/app/Activity;", "inactiveResetPin", "dealResetPinSuccessResult", "dealInactiveResetPinSuccessResult", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DefaultLoginServiceIml implements ILoginService {
    private static int ShareDataUIState = 1;
    private static int component3;
    private ApiCallback<Boolean> component1;
    private ApiCallback<Boolean> copydefault;

    protected final ApiCallback<Boolean> getResetPinCallback() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        ApiCallback<Boolean> apiCallback = this.copydefault;
        int i5 = i3 + 51;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return apiCallback;
    }

    protected final void setResetPinCallback(ApiCallback<Boolean> apiCallback) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 9;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.copydefault = apiCallback;
        int i5 = i2 + 11;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
    }

    protected final ApiCallback<Boolean> getInactiveResetPinCallback() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        ApiCallback<Boolean> apiCallback = this.component1;
        int i5 = i3 + 31;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return apiCallback;
    }

    protected final void setInactiveResetPinCallback(ApiCallback<Boolean> apiCallback) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 49;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.component1 = apiCallback;
        int i5 = i2 + 19;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
    }

    @Override
    public boolean isLogin() {
        int i = 2 % 2;
        if (TextUtils.isEmpty(TokenHelper.INSTANCE.getLoginToken())) {
            return false;
        }
        Iterator<Activity> it = ActivityUtils.getActivityList().iterator();
        int i2 = component3 + 111;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = ShareDataUIState + 65;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            if (TextUtils.equals(RouteUtils.getActivityName(it.next()), "main")) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void logout() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            RouteUtils.routeWithExecute((Activity) null, RoutePathConstants.LOGIN, 268468224);
            UserLifecycleManager.get().logout(Utils.getApp());
            int i3 = component3 + 63;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        RouteUtils.routeWithExecute((Activity) null, RoutePathConstants.LOGIN, 268468224);
        UserLifecycleManager.get().logout(Utils.getApp());
        throw null;
    }

    @Override
    public void resetPin(ApiCallback<Boolean> callback) {
        int i = 2 % 2;
        int i2 = component3 + 49;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            this.copydefault = callback;
            RouteUtils.routeWithExecute(RoutePathConstants.FORGET_PIN_START);
        } else {
            this.copydefault = callback;
            RouteUtils.routeWithExecute(RoutePathConstants.FORGET_PIN_START);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override
    public void resetPin(Activity activity, ApiCallback<Boolean> callback) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            this.copydefault = callback;
            RouteUtils.routeWithExecute(activity, RoutePathConstants.FORGET_PIN_START);
            int i3 = 82 / 0;
        } else {
            this.copydefault = callback;
            RouteUtils.routeWithExecute(activity, RoutePathConstants.FORGET_PIN_START);
        }
    }

    @Override
    public void inactiveResetPin(ApiCallback<Boolean> callback) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.component1 = callback;
        RouteUtils.routeWithExecute(RoutePathConstants.RESET_PIN_OTP);
        int i4 = component3 + 29;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 103;
        com.huawei.digitalpayment.consumer.baselib.service.DefaultLoginServiceIml.ShareDataUIState = r1 % 128;
        r1 = r1 % 2;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r2);
        r2.onSuccess(true);
        r5.copydefault = null;
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dealResetPinSuccessResult() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.service.DefaultLoginServiceIml.component3
            int r2 = r1 + 79
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.baselib.service.DefaultLoginServiceIml.ShareDataUIState = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L17
            com.huawei.common.listener.ApiCallback<java.lang.Boolean> r2 = r5.copydefault
            r4 = 72
            int r4 = r4 / r3
            if (r2 == 0) goto L31
            goto L1b
        L17:
            com.huawei.common.listener.ApiCallback<java.lang.Boolean> r2 = r5.copydefault
            if (r2 == 0) goto L31
        L1b:
            int r1 = r1 + 103
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.service.DefaultLoginServiceIml.ShareDataUIState = r3
            int r1 = r1 % r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r0 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r2.onSuccess(r1)
            r1 = 0
            r5.copydefault = r1
            return r0
        L31:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.service.DefaultLoginServiceIml.dealResetPinSuccessResult():boolean");
    }

    @Override
    public boolean dealInactiveResetPinSuccessResult() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 29;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            ApiCallback<Boolean> apiCallback = this.component1;
            if (apiCallback == null) {
                return false;
            }
            if (apiCallback != null) {
                int i4 = i2 + 19;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                apiCallback.onSuccess(true);
                int i6 = component3 + 67;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
            }
            this.component1 = null;
            int i8 = ShareDataUIState + 39;
            component3 = i8 % 128;
            if (i8 % 2 == 0) {
                return true;
            }
            throw null;
        }
        obj.hashCode();
        throw null;
    }
}
