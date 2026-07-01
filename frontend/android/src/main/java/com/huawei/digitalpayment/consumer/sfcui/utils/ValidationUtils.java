package com.huawei.digitalpayment.consumer.sfcui.utils;

import android.util.Patterns;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/utils/ValidationUtils;", "", "<init>", "()V", "isValidEmail", "", "email", "", "isValidAmount", "amount", "isValidPhoneNumber", "phoneNumber", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidationUtils {
    public static final int $stable = 0;
    public static final ValidationUtils INSTANCE = new ValidationUtils();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;

    private ValidationUtils() {
    }

    public final boolean isValidEmail(String email) {
        int i = 2 % 2;
        int i2 = component2 + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(email, "");
        String str = email;
        if (str.length() <= 0 || !Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
            return false;
        }
        int i4 = component2 + 1;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public final boolean isValidAmount(String amount) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(amount, "");
        if (amount.length() > 0) {
            int i2 = component2 + 57;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                StringsKt.toDoubleOrNull(amount);
                throw null;
            }
            Double doubleOrNull = StringsKt.toDoubleOrNull(amount);
            if (doubleOrNull != null && doubleOrNull.doubleValue() > 0.0d) {
                int i3 = component3 + 61;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isValidPhoneNumber(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            r1 = 2
            int r2 = r1 % r1
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            kotlin.text.Regex r2 = new kotlin.text.Regex
            java.lang.String r3 = "[^0-9+]"
            r2.<init>(r3)
            java.lang.String r7 = r2.replace(r7, r0)
            java.lang.String r0 = "254"
            r2 = 0
            r3 = 0
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r7, r0, r2, r1, r3)
            if (r0 == 0) goto L28
            int r0 = r7.length()
            r4 = 12
            if (r0 != r4) goto L28
            goto L75
        L28:
            java.lang.String r0 = "+254"
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r7, r0, r2, r1, r3)
            if (r0 == 0) goto L39
            int r0 = r7.length()
            r4 = 13
            if (r0 != r4) goto L39
            goto L75
        L39:
            java.lang.String r0 = "07"
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r7, r0, r2, r1, r3)
            r4 = 10
            if (r0 == 0) goto L5e
            int r0 = com.huawei.digitalpayment.consumer.sfcui.utils.ValidationUtils.component2
            int r0 = r0 + 43
            int r5 = r0 % 128
            com.huawei.digitalpayment.consumer.sfcui.utils.ValidationUtils.component3 = r5
            int r0 = r0 % r1
            if (r0 != 0) goto L57
            int r0 = r7.length()
            r5 = 54
            if (r0 != r5) goto L5e
            goto L75
        L57:
            int r0 = r7.length()
            if (r0 != r4) goto L5e
            goto L75
        L5e:
            java.lang.String r0 = "01"
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r7, r0, r2, r1, r3)
            if (r0 == 0) goto L76
            int r7 = r7.length()
            if (r7 != r4) goto L76
            int r7 = com.huawei.digitalpayment.consumer.sfcui.utils.ValidationUtils.component2
            int r7 = r7 + 73
            int r0 = r7 % 128
            com.huawei.digitalpayment.consumer.sfcui.utils.ValidationUtils.component3 = r0
            int r7 = r7 % r1
        L75:
            r2 = 1
        L76:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.utils.ValidationUtils.isValidPhoneNumber(java.lang.String):boolean");
    }

    static {
        int i = ShareDataUIState + 109;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
