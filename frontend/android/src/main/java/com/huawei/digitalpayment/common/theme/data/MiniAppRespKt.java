package com.huawei.digitalpayment.common.theme.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getExecute", "", "Lcom/huawei/digitalpayment/common/theme/data/MiniAppResp;", "CommonHomeThemeModule_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class MiniAppRespKt {
    private static int component2 = 1;
    private static int copydefault;

    public static final String getExecute(MiniAppResp miniAppResp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(miniAppResp, "");
        String str = "macle://" + miniAppResp.getAppId();
        int i2 = copydefault + 65;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
