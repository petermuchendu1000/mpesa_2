package com.huawei.digitalpayment.consumer.baselib.util;

import android.text.SpannableString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\t¢\u0006\u0002\u0010\nJ'\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\t¢\u0006\u0002\u0010\nJ/\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\t¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\t¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/util/SpannableStringUtils;", "", "<init>", "()V", "bold", "Landroid/text/SpannableString;", "spannableString", "texts", "", "", "(Landroid/text/SpannableString;[Ljava/lang/String;)Landroid/text/SpannableString;", "medium", "color", "", "(Landroid/text/SpannableString;I[Ljava/lang/String;)Landroid/text/SpannableString;", "span", "what", "text", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SpannableStringUtils {
    public static final SpannableStringUtils INSTANCE = new SpannableStringUtils();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    private SpannableStringUtils() {
    }

    public final SpannableString bold(SpannableString spannableString, String... texts) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(spannableString, "");
        Intrinsics.checkNotNullParameter(texts, "");
        int length = texts.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = component1 + 81;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            SpannableStringExtKt.bold(spannableString, texts[i2]);
            i2++;
            int i5 = ShareDataUIState + 125;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
        return spannableString;
    }

    public final SpannableString medium(SpannableString spannableString, String... texts) {
        int length;
        int i;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 75;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(spannableString, "");
            Intrinsics.checkNotNullParameter(texts, "");
            length = texts.length;
            i = 1;
        } else {
            Intrinsics.checkNotNullParameter(spannableString, "");
            Intrinsics.checkNotNullParameter(texts, "");
            length = texts.length;
            i = 0;
        }
        while (i < length) {
            int i4 = component1 + 121;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            SpannableStringExtKt.medium(spannableString, texts[i]);
            i++;
        }
        return spannableString;
    }

    public final SpannableString color(SpannableString spannableString, int color, String... texts) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component1 = i2 % 128;
        int i3 = 0;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(spannableString, "");
            Intrinsics.checkNotNullParameter(texts, "");
        } else {
            Intrinsics.checkNotNullParameter(spannableString, "");
            Intrinsics.checkNotNullParameter(texts, "");
        }
        int length = texts.length;
        while (i3 < length) {
            SpannableStringExtKt.color(spannableString, texts[i3], color);
            i3++;
            int i4 = component1 + 7;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
        return spannableString;
    }

    public final SpannableString span(SpannableString spannableString, Object what, String text) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(spannableString, "");
        Intrinsics.checkNotNullParameter(what, "");
        Intrinsics.checkNotNullParameter(text, "");
        SpannableStringExtKt.span(spannableString, text, what);
        int i4 = component1 + 21;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return spannableString;
    }

    static {
        int i = copydefault + 41;
        component3 = i % 128;
        if (i % 2 != 0) {
            int i2 = 90 / 0;
        }
    }
}
