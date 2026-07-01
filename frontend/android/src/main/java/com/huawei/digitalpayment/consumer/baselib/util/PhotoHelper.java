package com.huawei.digitalpayment.consumer.baselib.util;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/util/PhotoHelper;", "", "<init>", "()V", "idPhoto", "", "getIdPhoto", "()Ljava/lang/String;", "setIdPhoto", "(Ljava/lang/String;)V", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PhotoHelper {
    public static final PhotoHelper INSTANCE = new PhotoHelper();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static String component3;
    private static int copydefault;

    private PhotoHelper() {
    }

    public final String getIdPhoto() {
        int i = 2 % 2;
        int i2 = component1 + 105;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return component3;
        }
        throw null;
    }

    public final void setIdPhoto(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        component3 = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 43;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        int i = ShareDataUIState + 35;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
