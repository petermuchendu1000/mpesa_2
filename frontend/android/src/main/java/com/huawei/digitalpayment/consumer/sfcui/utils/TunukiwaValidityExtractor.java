package com.huawei.digitalpayment.consumer.sfcui.utils;

import com.alibaba.griver.beehive.lottie.constants.LottieConstants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/utils/TunukiwaValidityExtractor;", "", "<init>", "()V", "extractValidity", "", "tunukiwaName", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TunukiwaValidityExtractor {
    public static final int $stable = 0;
    public static final TunukiwaValidityExtractor INSTANCE = new TunukiwaValidityExtractor();
    private static int ShareDataUIState = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    private TunukiwaValidityExtractor() {
    }

    public final String extractValidity(String tunukiwaName) {
        String str;
        int i = 2 % 2;
        String str2 = tunukiwaName;
        if (str2 == null || StringsKt.isBlank(str2)) {
            return "Valid for 24 hours";
        }
        String string = StringsKt.trim(str2).toString();
        Object obj = null;
        MatchResult matchResultFind$default = Regex.find$default(new Regex("valid\\s+(\\d+)\\s*(day|days|hour|hours|hr|hrs|minute|minutes|mins?)", RegexOption.IGNORE_CASE), string, 0, 2, null);
        str = "hour";
        if (matchResultFind$default != null) {
            int i2 = copydefault + 3;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            String str3 = matchResultFind$default.getGroupValues().get(1);
            String lowerCase = matchResultFind$default.getGroupValues().get(2).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (StringsKt.startsWith$default(lowerCase, "day", false, 2, (Object) null)) {
                int i4 = component2 + 97;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    Intrinsics.areEqual(str3, "1");
                    obj.hashCode();
                    throw null;
                }
                return "Valid for " + str3 + " " + (Intrinsics.areEqual(str3, "1") ? "day" : "days");
            }
            if (StringsKt.startsWith$default(lowerCase, "hour", false, 2, (Object) null) || StringsKt.startsWith$default(lowerCase, "hr", false, 2, (Object) null)) {
                return "Valid for " + str3 + " " + (Intrinsics.areEqual(str3, "1") ? "hour" : "hours");
            }
            if (!StringsKt.startsWith$default(lowerCase, LottieConstants.PARAM_MIN_VALUE, false, 2, (Object) null)) {
                return "Valid for " + str3 + " " + lowerCase;
            }
            return "Valid for " + str3 + " " + (Intrinsics.areEqual(str3, "1") ? "minute" : "minutes");
        }
        if (StringsKt.contains((CharSequence) string, (CharSequence) "midnight", true)) {
            int i5 = copydefault + 31;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return "Valid till Midnight";
            }
            obj.hashCode();
            throw null;
        }
        MatchResult matchResultFind$default2 = Regex.find$default(new Regex("(\\d+)\\s*days?", RegexOption.IGNORE_CASE), string, 0, 2, null);
        if (matchResultFind$default2 != null) {
            String str4 = matchResultFind$default2.getGroupValues().get(1);
            return "Valid for " + str4 + " " + (Intrinsics.areEqual(str4, "1") ? "day" : "days");
        }
        MatchResult matchResultFind$default3 = Regex.find$default(new Regex("(\\d+)\\s*(?:hr|hrs|hour|hours)", RegexOption.IGNORE_CASE), string, 0, 2, null);
        if (matchResultFind$default3 == null) {
            MatchResult matchResultFind$default4 = Regex.find$default(new Regex("(\\d+)\\s*(?:minute|minutes|mins?)", RegexOption.IGNORE_CASE), string, 0, 2, null);
            if (matchResultFind$default4 == null) {
                return "Valid for 24 hours";
            }
            String str5 = matchResultFind$default4.getGroupValues().get(1);
            return "Valid for " + str5 + " " + (Intrinsics.areEqual(str5, "1") ? "minute" : "minutes");
        }
        String str6 = matchResultFind$default3.getGroupValues().get(1);
        if (true ^ Intrinsics.areEqual(str6, "1")) {
            str = "hours";
        } else {
            int i6 = copydefault + 31;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        return "Valid for " + str6 + " " + str;
    }

    static {
        int i = component3 + 95;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }
}
