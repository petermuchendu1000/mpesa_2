package com.huawei.digitalpayment.consumer.base.util;

import com.alibaba.ariver.kernel.RVParams;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010\u000b\u001a\u00020\u0005J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\nH\u0002J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0010¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/TimestampFormatterUtil;", "", "<init>", "()V", "formatTimestamp", "", "timestamp", "formatTimestampShareable", "getSuffix", "day", "", "formatTimeToGreet", "getGreetingTime", "hour", "formatTimestampJustDay", "timeLast", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimestampFormatterUtil {
    public static final TimestampFormatterUtil INSTANCE = new TimestampFormatterUtil();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    private TimestampFormatterUtil() {
    }

    public final String formatTimestamp(String timestamp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(timestamp, "");
        Date date = new Date(Long.parseLong(timestamp));
        String str = new SimpleDateFormat("d MMM yyyy").format(date);
        Intrinsics.checkNotNull(str);
        List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null);
        int i2 = Integer.parseInt((String) listSplit$default.get(0));
        String str2 = (String) listSplit$default.get(1);
        String str3 = (String) listSplit$default.get(2);
        String str4 = i2 + ShareDataUIState(i2) + " " + str2 + " " + str3;
        String str5 = new SimpleDateFormat("h:mm a").format(date);
        Intrinsics.checkNotNullExpressionValue(str5, "");
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String lowerCase = str5.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String str6 = str4 + " | " + lowerCase;
        int i3 = component3 + 51;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            return str6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String formatTimestampShareable(String timestamp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(timestamp, "");
        Date date = new Date(Long.parseLong(timestamp));
        String str = new SimpleDateFormat("d MMM yyyy").format(date);
        Intrinsics.checkNotNull(str);
        List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null);
        int i2 = Integer.parseInt((String) listSplit$default.get(0));
        String str2 = (String) listSplit$default.get(1);
        String str3 = (String) listSplit$default.get(2);
        String str4 = i2 + ShareDataUIState(i2) + " " + str2 + " " + str3;
        String str5 = new SimpleDateFormat("h:mm a").format(date);
        Intrinsics.checkNotNullExpressionValue(str5, "");
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String lowerCase = str5.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String str6 = str4 + " at " + lowerCase;
        int i3 = component3 + 95;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            return str6;
        }
        throw null;
    }

    private final String ShareDataUIState(int i) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 39;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i % 100;
        if (11 > i6 || i6 >= 14) {
            int i7 = i % 10;
            if (i7 == 1) {
                return RVParams.SHOW_TITLEBAR;
            }
            int i8 = i3 + 99;
            component2 = i8 % 128;
            if (i8 % 2 != 0 ? i7 == 2 : i7 == 5) {
                return "nd";
            }
            if (i7 == 3) {
                return "rd";
            }
        }
        return "th";
    }

    public final String formatTimeToGreet() {
        int i = 2 % 2;
        String str = new SimpleDateFormat("HH:mm:ss").format(new Date(System.currentTimeMillis()));
        Intrinsics.checkNotNull(str);
        String strComponent1 = component1(Integer.parseInt((String) StringsKt.split$default((CharSequence) str, new String[]{":"}, false, 0, 6, (Object) null).get(0)));
        int i2 = component3 + 37;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return strComponent1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String component1(int i) {
        int i2 = 2 % 2;
        if (i >= 0) {
            int i3 = component3 + 123;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            if (i < 12) {
                return "Good morning,";
            }
        }
        if (12 > i) {
            return "Good evening,";
        }
        int i5 = component2 + 117;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return i < 18 ? "Good afternoon," : "Good evening,";
    }

    public final String formatTimestampJustDay(String timestamp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(timestamp, "");
        String str = new SimpleDateFormat("d MMM yyyy").format(new Date(Long.parseLong(timestamp)));
        Intrinsics.checkNotNull(str);
        List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null);
        String str2 = Integer.parseInt((String) listSplit$default.get(0)) + " " + ((String) listSplit$default.get(1)) + " " + ((String) listSplit$default.get(2));
        int i2 = component3 + 13;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str2;
    }

    public final long timeLast(long timestamp) {
        Calendar calendar;
        long timeInMillis;
        int i = 2 % 2;
        int i2 = component2 + 87;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(timestamp);
            calendar = Calendar.getInstance();
            calendar2.setTimeZone(TimeZone.getDefault());
            calendar.setTimeZone(TimeZone.getDefault());
            timeInMillis = calendar2.getTimeInMillis();
        } else {
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTimeInMillis(timestamp);
            calendar = Calendar.getInstance();
            calendar3.setTimeZone(TimeZone.getDefault());
            calendar.setTimeZone(TimeZone.getDefault());
            timeInMillis = calendar3.getTimeInMillis();
        }
        return timeInMillis - calendar.getTimeInMillis();
    }

    static {
        int i = copydefault + 43;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 19 / 0;
        }
    }
}
