package com.huawei.digitalpayment.consumer.base.util;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/IVEncryptHelper;", "", "<init>", "()V", "ivLoginEncrypt", "", "getIvLoginEncrypt", "()Ljava/lang/String;", "setIvLoginEncrypt", "(Ljava/lang/String;)V", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IVEncryptHelper {
    public static final IVEncryptHelper INSTANCE = new IVEncryptHelper();
    private static String ShareDataUIState = null;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    private IVEncryptHelper() {
    }

    public final String getIvLoginEncrypt() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 61;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            str = ShareDataUIState;
            int i4 = 23 / 0;
        } else {
            str = ShareDataUIState;
        }
        int i5 = i3 + 3;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setIvLoginEncrypt(String str) {
        int i = 2 % 2;
        int i2 = component3 + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState = str;
        if (i3 != 0) {
            throw null;
        }
    }

    static {
        int i = component2 + 121;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
