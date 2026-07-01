package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001\u001a\u001e\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¨\u0006\u0006"}, d2 = {"prependCountryCode", "", "extractValidity", "extractEntertainmentValidity", "balanceCode", "bundleType", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConstantsKt {
    private static int component2 = 1;
    private static int component3;

    public static final String prependCountryCode(String str) {
        int i = 2 % 2;
        int i2 = component2 + 109;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            if (str.length() < 13) {
                return str;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            if (str.length() < 9) {
                return str;
            }
        }
        String str2 = "254" + StringsKt.takeLast(str, 9);
        int i3 = component3 + 79;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return str2;
    }

    public static final String extractValidity(String str) {
        String string;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = str;
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "(", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) str2, (CharSequence) ")", false, 2, (Object) null)) {
            String strSubstringBefore$default = StringsKt.substringBefore$default(StringsKt.substringAfter$default(str, "(", (String) null, 2, (Object) null), ")", (String) null, 2, (Object) null);
            String str3 = strSubstringBefore$default;
            if (StringsKt.contains((CharSequence) str3, (CharSequence) "mins outgoing", true) || StringsKt.contains((CharSequence) str3, (CharSequence) "Mbs", true)) {
                string = "No Expiry";
            } else if (StringsKt.contains$default((CharSequence) str3, (CharSequence) com.safaricom.consumer.commons.helper.ConstantsKt.COMMA_SEPARATOR, false, 2, (Object) null)) {
                int i2 = component2 + 97;
                component3 = i2 % 128;
                string = StringsKt.trim(i2 % 2 != 0 ? StringsKt.substringAfterLast$default(strSubstringBefore$default, com.safaricom.consumer.commons.helper.ConstantsKt.COMMA_SEPARATOR, (String) null, 4, (Object) null) : StringsKt.substringAfterLast$default(strSubstringBefore$default, com.safaricom.consumer.commons.helper.ConstantsKt.COMMA_SEPARATOR, (String) null, 2, (Object) null)).toString();
            } else {
                string = StringsKt.trim(str3).toString();
            }
        } else if (StringsKt.contains((CharSequence) str2, (CharSequence) Keys.WITH_EXPIRY_CATEGORY_DAILY, true)) {
            int i3 = component3 + 55;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            string = "1 Day";
        } else {
            string = "Hourly";
            if (!StringsKt.contains((CharSequence) str2, (CharSequence) "Hourly", true)) {
                if (StringsKt.contains((CharSequence) str2, (CharSequence) Keys.WITH_EXPIRY_CATEGORY_WEEKLY, true)) {
                    int i5 = component3;
                    int i6 = i5 + 57;
                    component2 = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = i5 + 49;
                    component2 = i8 % 128;
                    int i9 = i8 % 2;
                    string = "7 Days";
                } else {
                    string = StringsKt.contains((CharSequence) str2, (CharSequence) Keys.WITH_EXPIRY_CATEGORY_MONTHLY, true) ? "30 Days" : "Varies";
                }
            }
        }
        int i10 = component2 + 63;
        component3 = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    public static final String extractEntertainmentValidity(String str, String str2, String str3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str3 != null && StringsKt.equals(str3, "TikTok", true)) {
            int i2 = component3 + 31;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            String str4 = str2;
            if (str4 != null && str4.length() != 0) {
                if (Intrinsics.areEqual(str2, "1")) {
                    int i4 = component3 + 3;
                    component2 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 72 / 0;
                    }
                    return "1 Hour";
                }
                if (Intrinsics.areEqual(str2, "24")) {
                    return "24 Hours";
                }
                return str2 + " Hours";
            }
        }
        String strExtractValidity = extractValidity(str);
        int i6 = component2 + 53;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return strExtractValidity;
    }
}
