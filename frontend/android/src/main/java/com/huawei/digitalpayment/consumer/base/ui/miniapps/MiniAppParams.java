package com.huawei.digitalpayment.consumer.base.ui.miniapps;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/ui/miniapps/MiniAppParams;", "", "<init>", "()V", "KEY_SELECTED_CATEGORY", "", "getKEY_SELECTED_CATEGORY", "()Ljava/lang/String;", "KEY_SERVICE_RESPONSE", "getKEY_SERVICE_RESPONSE", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiniAppParams {
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int equals = 1;
    public static final MiniAppParams INSTANCE = new MiniAppParams();
    private static final String copydefault = "CATEGORY";
    private static final String component2 = "SERVICE_LIST";

    private MiniAppParams() {
    }

    static {
        int i = ShareDataUIState + 87;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public final String getKEY_SELECTED_CATEGORY() {
        int i = 2 % 2;
        int i2 = component1 + 15;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = copydefault;
        int i5 = i3 + 47;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getKEY_SERVICE_RESPONSE() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 83;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = component2;
        int i5 = i2 + 73;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
