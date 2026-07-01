package com.huawei.digitalpayment.consumer.sfcui.utils;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"isNotNullOrEmpty", "", "", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StringExtensionsKt {
    private static int component2 = 0;
    private static int copydefault = 1;

    public static final boolean isNotNullOrEmpty(String str) {
        boolean z;
        int i = 2 % 2;
        int i2 = copydefault + 5;
        component2 = i2 % 128;
        String str2 = str;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            int i3 = component2 + 97;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        return !z;
    }
}
