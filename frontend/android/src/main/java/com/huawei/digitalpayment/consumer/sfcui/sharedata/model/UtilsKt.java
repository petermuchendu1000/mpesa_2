package com.huawei.digitalpayment.consumer.sfcui.sharedata.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0002¨\u0006\u0004"}, d2 = {"asSafeDouble", "", "", "retainDigitsAndDot", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UtilsKt {
    private static int component3 = 1;
    private static int copydefault;

    public static final double asSafeDouble(String str) {
        double d2;
        int i = 2 % 2;
        int i2 = component3 + 79;
        copydefault = i2 % 128;
        Object obj = null;
        try {
        } catch (Exception unused) {
            d2 = 0.0d;
        }
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Double.parseDouble(retainDigitsAndDot(str));
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        d2 = Double.parseDouble(retainDigitsAndDot(str));
        int i3 = copydefault + 47;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return d2;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[PHI: r5
  0x003f: PHI (r5v8 char) = (r5v3 char), (r5v9 char) binds: [B:10:0x003d, B:7:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043 A[PHI: r5
  0x0043: PHI (r5v4 char) = (r5v3 char), (r5v8 char), (r5v9 char) binds: [B:10:0x003d, B:12:0x0041, B:7:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String retainDigitsAndDot(java.lang.String r8) throws java.io.IOException {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Appendable r1 = (java.lang.Appendable) r1
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        L17:
            if (r4 >= r2) goto L52
            int r5 = com.huawei.digitalpayment.consumer.sfcui.sharedata.model.UtilsKt.copydefault
            int r5 = r5 + 81
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.model.UtilsKt.component3 = r6
            int r5 = r5 % 2
            if (r5 != 0) goto L33
            char r5 = r8.charAt(r4)
            boolean r6 = java.lang.Character.isDigit(r5)
            r7 = 61
            int r7 = r7 / r3
            if (r6 == 0) goto L3f
            goto L43
        L33:
            char r5 = r8.charAt(r4)
            boolean r6 = java.lang.Character.isDigit(r5)
            r6 = r6 ^ 1
            if (r6 == 0) goto L43
        L3f:
            r6 = 46
            if (r5 != r6) goto L4f
        L43:
            r1.append(r5)
            int r5 = com.huawei.digitalpayment.consumer.sfcui.sharedata.model.UtilsKt.copydefault
            int r5 = r5 + 41
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.model.UtilsKt.component3 = r6
            int r5 = r5 % r0
        L4f:
            int r4 = r4 + 1
            goto L17
        L52:
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            java.lang.String r8 = r1.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.model.UtilsKt.retainDigitsAndDot(java.lang.String):java.lang.String");
    }
}
