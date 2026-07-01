package com.huawei.digitalpayment.home.data.source.locaL;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getExecute", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalMiniApp;", "ConsumerHomeModule_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LocalMiniAppKt {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    public static final String getExecute(LocalMiniApp localMiniApp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(localMiniApp, "");
        String str = "macle://" + localMiniApp.getAppId();
        int i2 = component2 + 57;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
