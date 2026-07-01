package com.huawei.digitalpayment.consumer.base.util;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/AdpuNfcUtils;", "", "<init>", "()V", "nfcData", "", "getNfcData", "()Ljava/lang/String;", "setNfcData", "(Ljava/lang/String;)V", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AdpuNfcUtils {
    public static final AdpuNfcUtils INSTANCE = new AdpuNfcUtils();
    private static int ShareDataUIState = 0;
    private static String component1 = null;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    private AdpuNfcUtils() {
    }

    public final String getNfcData() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 7;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            str = component1;
            int i4 = 82 / 0;
        } else {
            str = component1;
        }
        int i5 = i2 + 73;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setNfcData(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        component1 = str;
        int i5 = i3 + 59;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        int i = component3 + 97;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
