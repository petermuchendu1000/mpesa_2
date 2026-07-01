package com.huawei.digitalpayment.consumer.sfcui.utils;

import java.util.Date;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0001¨\u0006\u0004"}, d2 = {"now", "Ljava/util/Date;", "asHumanReadable", "", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DateExtensionsKt {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    public static final Date now() {
        int i = 2 % 2;
        Date date = new Date(System.currentTimeMillis());
        int i2 = copydefault + 15;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return date;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String asHumanReadable(java.util.Date r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r3 = "d"
            java.util.Locale r4 = java.util.Locale.ENGLISH
            r2.<init>(r3, r4)
            java.lang.String r2 = r2.format(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            int r1 = java.lang.Integer.parseInt(r2)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r3 = "MMM yyyy"
            java.util.Locale r4 = java.util.Locale.ENGLISH
            r2.<init>(r3, r4)
            java.lang.String r5 = r2.format(r5)
            r2 = 11
            if (r2 > r1) goto L32
            r2 = 14
            if (r1 >= r2) goto L32
            goto L57
        L32:
            int r2 = r1 % 10
            r3 = 1
            if (r2 != r3) goto L3a
            java.lang.String r2 = "st"
            goto L59
        L3a:
            if (r2 != r0) goto L48
            int r2 = com.huawei.digitalpayment.consumer.sfcui.utils.DateExtensionsKt.ShareDataUIState
            int r2 = r2 + 53
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.utils.DateExtensionsKt.copydefault = r3
            int r2 = r2 % r0
            java.lang.String r2 = "nd"
            goto L59
        L48:
            r3 = 3
            if (r2 != r3) goto L57
            int r2 = com.huawei.digitalpayment.consumer.sfcui.utils.DateExtensionsKt.ShareDataUIState
            int r2 = r2 + 75
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.utils.DateExtensionsKt.copydefault = r3
            int r2 = r2 % r0
            java.lang.String r2 = "rd"
            goto L59
        L57:
            java.lang.String r2 = "th"
        L59:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = " "
            r3.append(r1)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            int r1 = com.huawei.digitalpayment.consumer.sfcui.utils.DateExtensionsKt.copydefault
            int r1 = r1 + 109
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.utils.DateExtensionsKt.ShareDataUIState = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L7c
            return r5
        L7c:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.utils.DateExtensionsKt.asHumanReadable(java.util.Date):java.lang.String");
    }
}
