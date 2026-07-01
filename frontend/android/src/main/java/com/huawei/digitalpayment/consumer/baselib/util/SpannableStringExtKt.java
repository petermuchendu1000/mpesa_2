package com.huawei.digitalpayment.consumer.baselib.util;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.huawei.digitalpayment.consumer.baselib.widget.text.TypefaceManager;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a$\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\u001a\u001a\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001a\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b\u001a\u001a\u0010\f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006\u001a\u001c\u0010\r\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, d2 = {"bold", "Landroid/text/SpannableString;", "text", "", "medium", "color", "", "ignoreCase", "", "span", "what", "", "size", "typeface", "Landroid/graphics/Typeface;", "ConsumerBaseLib_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SpannableStringExtKt {
    private static int ShareDataUIState = 1;
    private static int copydefault;

    public static final SpannableString bold(SpannableString spannableString, String str) {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(spannableString, "");
            Intrinsics.checkNotNullParameter(str, "");
            return component2(spannableString, str, TypefaceManager.INSTANCE.getTypeface_bold());
        }
        Intrinsics.checkNotNullParameter(spannableString, "");
        Intrinsics.checkNotNullParameter(str, "");
        component2(spannableString, str, TypefaceManager.INSTANCE.getTypeface_bold());
        throw null;
    }

    public static final SpannableString medium(SpannableString spannableString, String str) {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(spannableString, "");
            Intrinsics.checkNotNullParameter(str, "");
            return component2(spannableString, str, TypefaceManager.INSTANCE.getTypeface_medium());
        }
        Intrinsics.checkNotNullParameter(spannableString, "");
        Intrinsics.checkNotNullParameter(str, "");
        component2(spannableString, str, TypefaceManager.INSTANCE.getTypeface_medium());
        throw null;
    }

    public static SpannableString color$default(SpannableString spannableString, String str, int i, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = ShareDataUIState + 109;
        copydefault = i4 % 128;
        if (i4 % 2 == 0 ? (i2 & 4) != 0 : (i2 & 4) != 0) {
            z = false;
        }
        SpannableString spannableStringColor = color(spannableString, str, i, z);
        int i5 = ShareDataUIState + 41;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return spannableStringColor;
    }

    public static final SpannableString color(SpannableString spannableString, String str, int i, boolean z) {
        int iIndexOf$default;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(spannableString, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            int i3 = copydefault + 31;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            String string = spannableString.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            String lowerCase = string.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            String lowerCase2 = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            iIndexOf$default = StringsKt.indexOf$default((CharSequence) lowerCase, lowerCase2, 0, false, 6, (Object) null);
            int i5 = copydefault + 125;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        } else {
            String string2 = spannableString.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            iIndexOf$default = StringsKt.indexOf$default((CharSequence) string2, str, 0, false, 6, (Object) null);
        }
        if (iIndexOf$default != -1) {
            spannableString.setSpan(new ForegroundColorSpan(i), iIndexOf$default, str.length() + iIndexOf$default, 33);
        }
        return spannableString;
    }

    public static final SpannableString color(SpannableString spannableString, String str, int i) {
        SpannableString spannableStringColor;
        int i2 = 2 % 2;
        int i3 = copydefault + 111;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(spannableString, "");
            Intrinsics.checkNotNullParameter(str, "");
            spannableStringColor = color(spannableString, str, i, true);
        } else {
            Intrinsics.checkNotNullParameter(spannableString, "");
            Intrinsics.checkNotNullParameter(str, "");
            spannableStringColor = color(spannableString, str, i, false);
        }
        int i4 = ShareDataUIState + 101;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return spannableStringColor;
    }

    public static final SpannableString span(SpannableString spannableString, String str, Object obj) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(spannableString, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        String string = spannableString.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) string, str, 0, false, 6, (Object) null);
        if (iIndexOf$default != -1) {
            int i2 = ShareDataUIState + 65;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            spannableString.setSpan(obj, iIndexOf$default, str.length() + iIndexOf$default, 33);
        }
        int i4 = copydefault + 49;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return spannableString;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0049 A[PHI: r1
  0x0049: PHI (r1v6 int) = (r1v5 int), (r1v8 int) binds: [B:8:0x0047, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.text.SpannableString size(android.text.SpannableString r10, java.lang.String r11, int r12) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.util.SpannableStringExtKt.ShareDataUIState
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.util.SpannableStringExtKt.copydefault = r2
            int r1 = r1 % r0
            r2 = -1
            java.lang.String r3 = ""
            if (r1 == 0) goto L2e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r3)
            java.lang.String r1 = r10.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r6 = 0
            r7 = 1
            r8 = 106(0x6a, float:1.49E-43)
            r9 = 0
            r5 = r11
            int r1 = kotlin.text.StringsKt.indexOf$default(r4, r5, r6, r7, r8, r9)
            if (r1 == r2) goto L67
            goto L49
        L2e:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r3)
            java.lang.String r1 = r10.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r5 = r11
            int r1 = kotlin.text.StringsKt.indexOf$default(r4, r5, r6, r7, r8, r9)
            if (r1 == r2) goto L67
        L49:
            android.text.style.AbsoluteSizeSpan r2 = new android.text.style.AbsoluteSizeSpan
            float r12 = (float) r12
            int r12 = com.blankj.utilcode.util.ConvertUtils.sp2px(r12)
            r3 = 0
            r2.<init>(r12, r3)
            int r11 = r11.length()
            int r11 = r11 + r1
            r12 = 33
            r10.setSpan(r2, r1, r11, r12)
            int r11 = com.huawei.digitalpayment.consumer.baselib.util.SpannableStringExtKt.copydefault
            int r11 = r11 + 59
            int r12 = r11 % 128
            com.huawei.digitalpayment.consumer.baselib.util.SpannableStringExtKt.ShareDataUIState = r12
            int r11 = r11 % r0
        L67:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.SpannableStringExtKt.size(android.text.SpannableString, java.lang.String, int):android.text.SpannableString");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r1
  0x003d: PHI (r1v6 int) = (r1v5 int), (r1v8 int) binds: [B:8:0x003b, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.text.SpannableString component2(android.text.SpannableString r10, java.lang.String r11, android.graphics.Typeface r12) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.util.SpannableStringExtKt.ShareDataUIState
            int r1 = r1 + 29
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.util.SpannableStringExtKt.copydefault = r2
            int r1 = r1 % r0
            r2 = -1
            java.lang.String r3 = ""
            if (r1 == 0) goto L28
            java.lang.String r1 = r10.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r6 = 0
            r7 = 0
            r8 = 78
            r9 = 0
            r5 = r11
            int r1 = kotlin.text.StringsKt.indexOf$default(r4, r5, r6, r7, r8, r9)
            if (r1 == r2) goto L55
            goto L3d
        L28:
            java.lang.String r1 = r10.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r5 = r11
            int r1 = kotlin.text.StringsKt.indexOf$default(r4, r5, r6, r7, r8, r9)
            if (r1 == r2) goto L55
        L3d:
            com.huawei.digitalpayment.consumer.baselib.widget.text.PaymentTypefaceSpan r2 = new com.huawei.digitalpayment.consumer.baselib.widget.text.PaymentTypefaceSpan
            r2.<init>(r12)
            int r11 = r11.length()
            int r11 = r11 + r1
            r12 = 33
            r10.setSpan(r2, r1, r11, r12)
            int r11 = com.huawei.digitalpayment.consumer.baselib.util.SpannableStringExtKt.ShareDataUIState
            int r11 = r11 + 111
            int r12 = r11 % 128
            com.huawei.digitalpayment.consumer.baselib.util.SpannableStringExtKt.copydefault = r12
            int r11 = r11 % r0
        L55:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.SpannableStringExtKt.component2(android.text.SpannableString, java.lang.String, android.graphics.Typeface):android.text.SpannableString");
    }
}
