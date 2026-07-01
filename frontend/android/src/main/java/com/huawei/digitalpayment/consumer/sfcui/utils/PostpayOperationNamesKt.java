package com.huawei.digitalpayment.consumer.sfcui.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, d2 = {"getPostPayDescription", "", "description", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PostpayOperationNamesKt {
    private static int component1 = 0;
    private static int component2 = 1;

    public static final String getPostPayDescription(String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            str = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(new Regex("\\s").split(str, 0).get(1), "(", "", false, 4, (Object) null), ")", "", false, 4, (Object) null), "+WA", "", false, 4, (Object) null), "+", " | ", false, 4, (Object) null);
        } catch (Exception unused) {
        }
        int i2 = component2 + 123;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 55 / 0;
        }
        return str;
    }
}
