package com.huawei.digitalpayment.consumer.sfcui.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\n\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/utils/NumberValidator;", "", "<init>", "()V", "validatePhoneNumber", "", "phoneNumber", "", "numberCleaner", "number", "numberCodeAdder", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NumberValidator {
    public static final int $stable = 0;
    public static final NumberValidator INSTANCE = new NumberValidator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    private NumberValidator() {
    }

    public final boolean validatePhoneNumber(String phoneNumber) {
        int i = 2 % 2;
        try {
            Intrinsics.checkNotNull(phoneNumber);
            boolean zMatches = new Regex("(254[1/7]\\d{8}$)|(^0[1|7]{1}[0-9]{8}$)").matches(phoneNumber);
            int i2 = component3 + 27;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return zMatches;
            }
            int i3 = 3 % 4;
            return zMatches;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public final String numberCleaner(String number) {
        StringBuilder sb;
        int i = 2 % 2;
        int i2 = component3 + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (number != null) {
            String str = number;
            if (str.length() != 0) {
                String strReplace = new Regex("[^0-9]+").replace(str, "");
                if (strReplace.length() > 9) {
                    strReplace = strReplace.substring(strReplace.length() - 9);
                    Intrinsics.checkNotNullExpressionValue(strReplace, "");
                    sb = new StringBuilder("0");
                } else {
                    sb = new StringBuilder("0");
                }
                sb.append(strReplace);
                number = sb.toString();
            } else {
                int i4 = component3 + 93;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return "";
                }
                throw null;
            }
        }
        int i5 = copydefault + 71;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return number;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r6.length() > 9) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String numberCodeAdder(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.utils.NumberValidator.copydefault
            int r1 = r1 + 81
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.utils.NumberValidator.component3 = r2
            int r1 = r1 % r0
            java.lang.String r2 = "254"
            r3 = 9
            if (r1 == 0) goto L1e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)     // Catch: java.lang.Exception -> L58
            int r1 = r6.length()     // Catch: java.lang.Exception -> L58
            r4 = 55
            if (r1 <= r4) goto L42
            goto L27
        L1e:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)     // Catch: java.lang.Exception -> L58
            int r1 = r6.length()     // Catch: java.lang.Exception -> L58
            if (r1 <= r3) goto L42
        L27:
            int r0 = r6.length()     // Catch: java.lang.Exception -> L58
            int r0 = r0 - r3
            java.lang.String r0 = r6.substring(r0)     // Catch: java.lang.Exception -> L58
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L58
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L58
            r1.<init>(r2)     // Catch: java.lang.Exception -> L58
            r1.append(r0)     // Catch: java.lang.Exception -> L58
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Exception -> L58
            goto L60
        L42:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L58
            r1.<init>(r2)     // Catch: java.lang.Exception -> L58
            r1.append(r6)     // Catch: java.lang.Exception -> L58
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Exception -> L58
            int r1 = com.huawei.digitalpayment.consumer.sfcui.utils.NumberValidator.copydefault
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.utils.NumberValidator.component3 = r2
            int r1 = r1 % r0
            goto L60
        L58:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.String r6 = java.lang.String.valueOf(r6)
        L60:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.utils.NumberValidator.numberCodeAdder(java.lang.String):java.lang.String");
    }

    static {
        int i = component1 + 37;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 7 / 0;
        }
    }
}
