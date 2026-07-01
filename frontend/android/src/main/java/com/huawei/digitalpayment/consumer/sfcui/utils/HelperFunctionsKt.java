package com.huawei.digitalpayment.consumer.sfcui.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a&\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0010\b\u0000\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u00020\u0003H\u0086\b¢\u0006\u0002\u0010\u0004\u001a,\u0010\u0005\u001a\u0002H\u0001\"\u0010\b\u0000\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u00020\u00032\u0006\u0010\u0006\u001a\u0002H\u0001H\u0086\b¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"toEnumOrNull", "T", "", "", "(Ljava/lang/String;)Ljava/lang/Enum;", "toEnumOrDefault", "default", "(Ljava/lang/String;Ljava/lang/Enum;)Ljava/lang/Enum;", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HelperFunctionsKt {
    private static int component3 = 1;
    private static int copydefault;

    public static final <T extends Enum<T>> T toEnumOrDefault(String str, T t) {
        int i = 2 % 2;
        int i2 = component3 + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.reifiedOperationMarker(5, "T");
        int i4 = copydefault + 63;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return t;
    }

    public static final <T extends Enum<T>> T toEnumOrNull(String str) {
        int i;
        int i2 = 2 % 2;
        int i3 = copydefault + 101;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            i = 3;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            i = 5;
        }
        Intrinsics.reifiedOperationMarker(i, "T");
        int i4 = component3 + 47;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }
}
