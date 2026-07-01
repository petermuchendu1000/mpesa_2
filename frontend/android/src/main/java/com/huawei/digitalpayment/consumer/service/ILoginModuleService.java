package com.huawei.digitalpayment.consumer.service;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin._init_lambda2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00032\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tH\u0016¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/service/ILoginModuleService;", "", "identityPIN", "", "activity", "Landroid/app/Activity;", "bundle", "Landroid/os/Bundle;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "getIdentityPinIntent", "Landroid/content/Intent;", "autoLogin", "callbacks", "Lcom/huawei/http/BaseResp;", "Companion", "ServiceModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ILoginModuleService {

    public static final Companion INSTANCE = Companion.copydefault;

    void autoLogin(ApiCallback<BaseResp> callbacks);

    Intent getIdentityPinIntent();

    void identityPIN(Activity activity, Bundle bundle, ApiCallback<Bundle> callback);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/service/ILoginModuleService$Companion;", "", "<init>", "()V", "IDENTIFY_PIN", "", "getIDENTIFY_PIN", "()Ljava/lang/String;", "ServiceModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component3 = 0;
        private static int getAsAtTimestamp = 1;
        static final Companion copydefault = new Companion();
        private static final String component2 = RoutePathConstants.IDENTIFY_PIN;

        private Companion() {
        }

        static {
            int i = component3 + 75;
            component1 = i % 128;
            int i2 = i % 2;
        }

        public final String getIDENTIFY_PIN() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp;
            int i3 = i2 + 9;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = component2;
            int i4 = i2 + 123;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int component2 = 0;
        private static int copydefault = 1;

        public static void identityPIN(ILoginModuleService iLoginModuleService, Activity activity, Bundle bundle, ApiCallback<Bundle> apiCallback) {
            int i = 2 % 2;
            int i2 = copydefault + 111;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(activity, "");
            RouteUtils.routeWithExecute(activity, ILoginModuleService.INSTANCE.getIDENTIFY_PIN(), bundle);
            int i4 = component2 + 13;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 77 / 0;
            }
        }

        public static void autoLogin(ILoginModuleService iLoginModuleService, ApiCallback<BaseResp> apiCallback) {
            int i = 2 % 2;
            int i2 = copydefault + 99;
            component2 = i2 % 128;
            int i3 = i2 % 2;
        }

        public static void copydefault() {
            _init_lambda2.component3[0] = r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.ShareDataUIState[0];
        }
    }
}
