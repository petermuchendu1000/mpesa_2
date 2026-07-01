package com.huawei.digitalpayment.consumer.service;

import android.app.Activity;
import android.os.Bundle;
import com.huawei.common.listener.ApiCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH&J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/service/IRiskService;", "", "startProcess", "", "activity", "Landroid/app/Activity;", "bundle", "Landroid/os/Bundle;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "ServiceModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IRiskService {
    void startProcess(Activity activity, Bundle bundle, ApiCallback<Bundle> callback);

    void startProcess(Bundle bundle);

    void startProcess(Bundle bundle, ApiCallback<Bundle> callback);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        private static int component1 = 0;
        private static int component2 = 1;

        public static void startProcess(IRiskService iRiskService, Bundle bundle, ApiCallback<Bundle> apiCallback) {
            int i = 2 % 2;
            int i2 = component2 + 91;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(bundle, "");
            Object obj = null;
            iRiskService.startProcess(null, bundle, apiCallback);
            int i4 = component2 + 19;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public static void startProcess(IRiskService iRiskService, Bundle bundle) {
            int i = 2 % 2;
            int i2 = component1 + 115;
            component2 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(bundle, "");
                iRiskService.startProcess(bundle, null);
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(bundle, "");
            iRiskService.startProcess(bundle, null);
            int i3 = component1 + 83;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }
    }
}
