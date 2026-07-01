package com.huawei.digitalpayment.consumer.baselib.util;

import android.content.SharedPreferences;
import android.text.SpannableString;
import android.text.TextUtils;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.Utils;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.consumer.baselib.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TimeUtils {
    public static final int DAY = 86400000;
    public static final String DAY_MONTH_YEAR = "dd/MM/yyyy";
    public static final String DAY_MONTH_YEAR_HH_MM = "dd/MM/yyyy HH:mm";
    public static final String DAY_MONTH_YEAR_HH_MM_SS = "dd/MM/yyyy HH:mm:ss";
    public static final int HOUR = 3600000;
    public static final int MIN = 60000;
    public static final int MSEC = 1;
    public static final int SEC = 1000;
    private static final String ShareDataUIState = "REFRESH_TIME_TRANSACTION_MESSAGE";
    public static final String YEAR_MONTH_DAY = "yyyyMMdd";
    private static final String component1 = "REFRESH_TIME_SYSTEM_MESSAGE";
    private static String component2 = "TimeDiff";
    static volatile SharedPreferences component3 = null;
    private static int component4 = 35 % 128;
    private static int copy = 0;
    private static final String copydefault = "REFRESH_TIME_PROMOTION_MESSAGE";
    private static final String equals = "SERVER_TIME_DIFF_UTC";
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;

    public static String getServerTime() {
        int i = 2 % 2;
        String str = "" + getServerTimeFromUTC().getTime();
        int i2 = copy + 41;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 18 / 0;
        }
        return str;
    }

    public static void saveServerDiffUTC(String str) {
        int i = 2 % 2;
        try {
            component1(Long.valueOf(Long.parseLong(str) - new Date().getTime()));
            int i2 = copy + 91;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            L.d("=====", e.getMessage());
        }
    }

    public static Date getServerTimeFromUTC() {
        int i = 2 % 2;
        try {
            Date date = new Date(new Date().getTime() + copydefault().longValue());
            int i2 = getAsAtTimestamp + 35;
            copy = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 93 / 0;
            }
            return date;
        } catch (Exception unused) {
            return new Date();
        }
    }

    private static void component1(Long l) {
        int i = 2 % 2;
        int i2 = copy + 71;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        if (component3 == null) {
            int i4 = getAsAtTimestamp + 85;
            copy = i4 % 128;
            int i5 = i4 % 2;
            component3 = Utils.getApp().getSharedPreferences(component2, 0);
        }
        SharedPreferences.Editor editorEdit = component3.edit();
        editorEdit.putLong(equals, l.longValue());
        editorEdit.commit();
    }

    private static Long copydefault() {
        int i = 2 % 2;
        if (component3 == null) {
            int i2 = copy + 73;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            component3 = Utils.getApp().getSharedPreferences(component2, 0);
        }
        Long lValueOf = Long.valueOf(component3.getLong(equals, 0L));
        int i4 = copy + 51;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return lValueOf;
    }

    public static void setSystemMessageRefreshTime(String str) {
        int i = 2 % 2;
        int i2 = copy + 39;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (component3 == null) {
            int i3 = copy + 5;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            component3 = Utils.getApp().getSharedPreferences(component2, 0);
            int i5 = copy + 29;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 3;
            }
        }
        SharedPreferences.Editor editorEdit = component3.edit();
        editorEdit.putString(component1, str);
        editorEdit.apply();
    }

    public static String getSystemMessageRefreshTime() {
        int i = 2 % 2;
        if (component3 == null) {
            component3 = Utils.getApp().getSharedPreferences(component2, 0);
            int i2 = copy + 27;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
        }
        String string = component3.getString(component1, "");
        int i4 = copy + 115;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return string;
    }

    public static void setTransactionMessageRefreshTime(String str) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 1;
        copy = i2 % 128;
        int i3 = i2 % 2;
        if (component3 == null) {
            component3 = Utils.getApp().getSharedPreferences(component2, 0);
            int i4 = getAsAtTimestamp + 19;
            copy = i4 % 128;
            int i5 = i4 % 2;
        }
        SharedPreferences.Editor editorEdit = component3.edit();
        editorEdit.putString(ShareDataUIState, str);
        editorEdit.apply();
    }

    public static String getTransactionMessageRefreshTime() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 59;
        copy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (component3 == null) {
                component3 = Utils.getApp().getSharedPreferences(component2, 0);
            }
            String string = component3.getString(ShareDataUIState, "");
            int i3 = getAsAtTimestamp + 31;
            copy = i3 % 128;
            if (i3 % 2 == 0) {
                return string;
            }
            throw null;
        }
        obj.hashCode();
        throw null;
    }

    public static void setPromotionMessageRefreshTime(String str) {
        int i = 2 % 2;
        int i2 = copy + 33;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        if (component3 == null) {
            int i4 = getAsAtTimestamp + 97;
            copy = i4 % 128;
            int i5 = i4 % 2;
            component3 = Utils.getApp().getSharedPreferences(component2, 0);
        }
        SharedPreferences.Editor editorEdit = component3.edit();
        editorEdit.putString(copydefault, str);
        editorEdit.apply();
        int i6 = getAsAtTimestamp + 81;
        copy = i6 % 128;
        int i7 = i6 % 2;
    }

    public static String getPromotionMessageRefreshTime() {
        int i = 2 % 2;
        if (component3 == null) {
            int i2 = getAsAtTimestamp + 85;
            copy = i2 % 128;
            int i3 = i2 % 2;
            component3 = Utils.getApp().getSharedPreferences(component2, 0);
        }
        String string = component3.getString(copydefault, "");
        int i4 = getAsAtTimestamp + 125;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    public static long getTodayStartTime() {
        int i = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        long time = calendar.getTime().getTime();
        int i2 = getAsAtTimestamp + 1;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 92 / 0;
        }
        return time;
    }

    public static String formatDayAndMonth(String str) {
        int i = 2 % 2;
        try {
            String str2 = new SimpleDateFormat("dd/MM", Locale.ENGLISH).format(new Date(Long.parseLong(str)));
            int i2 = copy + 81;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return str2;
        } catch (NumberFormatException e) {
            L.d("=====", e.getMessage());
            return "";
        }
    }

    public static String formatTime(String str, String str2) {
        int i = 2 % 2;
        int i2 = copy + 101;
        getAsAtTimestamp = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                return formatTime(Long.parseLong(str), str2);
            }
            formatTime(Long.parseLong(str), str2);
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (NumberFormatException e) {
            L.d("=====", e.getMessage());
            return "";
        }
    }

    public static String formatTime(long j, String str) {
        int i = 2 % 2;
        try {
            String str2 = new SimpleDateFormat(str, Locale.ENGLISH).format(new Date(j));
            int i2 = copy + 21;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 != 0) {
                return str2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (NumberFormatException e) {
            L.d("=====", e.getMessage());
            return "";
        }
    }

    public static String formatTime(String str, String str2, String str3) {
        int i = 2 % 2;
        try {
            String time = formatTime(new SimpleDateFormat(str2, Locale.ENGLISH).parse(str).getTime(), str3);
            int i2 = copy + 83;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 / 0;
            }
            return time;
        } catch (Exception e) {
            L.d("=====", e.getMessage());
            return "";
        }
    }

    public static Date getDate(String str, String str2) {
        int i = 2 % 2;
        try {
            Date date = new SimpleDateFormat(str2, Locale.ENGLISH).parse(str);
            int i2 = copy + 73;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return date;
        } catch (Exception e) {
            L.d("=====", e.getMessage());
            return null;
        }
    }

    public static boolean isTimestampYesterday(long j) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 25;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Calendar.getInstance().setTimeInMillis(j);
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -1);
        boolean z = false;
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        if (j >= timeInMillis && j < timeInMillis + 86400000) {
            int i4 = getAsAtTimestamp + 93;
            copy = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        }
        int i6 = getAsAtTimestamp + 65;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isTimestampLastWeek(long r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.util.TimeUtils.getAsAtTimestamp
            r2 = 11
            int r1 = r1 + r2
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.util.TimeUtils.copy = r3
            int r1 = r1 % r0
            r3 = 1
            r4 = 604800000(0x240c8400, double:2.988109026E-315)
            r6 = 0
            if (r1 == 0) goto L37
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r2 = 21
            r1.set(r2, r6)
            r2 = 46
            r1.set(r2, r3)
            r2 = 5
            r1.set(r2, r6)
            r2 = 94
            r1.set(r2, r6)
            long r1 = r1.getTimeInMillis()
            long r1 = r1 & r4
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 < 0) goto L35
            goto L56
        L35:
            r3 = r6
            goto L56
        L37:
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r1.set(r2, r6)
            r2 = 12
            r1.set(r2, r6)
            r2 = 13
            r1.set(r2, r6)
            r2 = 14
            r1.set(r2, r6)
            long r1 = r1.getTimeInMillis()
            long r1 = r1 - r4
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 < 0) goto L35
        L56:
            int r7 = com.huawei.digitalpayment.consumer.baselib.util.TimeUtils.getAsAtTimestamp
            int r7 = r7 + 101
            int r8 = r7 % 128
            com.huawei.digitalpayment.consumer.baselib.util.TimeUtils.copy = r8
            int r7 = r7 % r0
            if (r7 == 0) goto L64
            r7 = 57
            int r7 = r7 / r6
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.TimeUtils.isTimestampLastWeek(long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isTimestampThisMonth(long r13) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r1.setTimeInMillis(r13)
            r2 = 1
            int r3 = r1.get(r2)
            int r1 = r1.get(r0)
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            r4.set(r2, r3)
            r4.set(r0, r1)
            r5 = 5
            r4.set(r5, r2)
            r6 = 11
            r7 = 0
            r4.set(r6, r7)
            r8 = 12
            r4.set(r8, r7)
            r9 = 13
            r4.set(r9, r7)
            r10 = 14
            r4.set(r10, r7)
            long r11 = r4.getTimeInMillis()
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            r4.set(r2, r3)
            int r1 = r1 + r2
            r4.set(r0, r1)
            r4.set(r5, r2)
            r4.set(r6, r7)
            r4.set(r8, r7)
            r4.set(r9, r7)
            r4.set(r10, r7)
            long r3 = r4.getTimeInMillis()
            int r1 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r1 < 0) goto L71
            int r1 = com.huawei.digitalpayment.consumer.baselib.util.TimeUtils.getAsAtTimestamp
            int r5 = r1 + 103
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.baselib.util.TimeUtils.copy = r6
            int r5 = r5 % r0
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 >= 0) goto L71
            int r1 = r1 + 73
            int r13 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.util.TimeUtils.copy = r13
            int r1 = r1 % r0
            goto L72
        L71:
            r2 = r7
        L72:
            int r13 = com.huawei.digitalpayment.consumer.baselib.util.TimeUtils.getAsAtTimestamp
            int r13 = r13 + 31
            int r14 = r13 % 128
            com.huawei.digitalpayment.consumer.baselib.util.TimeUtils.copy = r14
            int r13 = r13 % r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.TimeUtils.isTimestampThisMonth(long):boolean");
    }

    public static SpannableString transTimestamp(String str) {
        int i = 2 % 2;
        SpannableString spannableStringColor = SpannableStringUtils.INSTANCE.color(new SpannableString(formatTime(Long.parseLong(str), "dd MMMM yyyy · HH:mm")), ColorUtils.getColor(R.color.colorGeneralText), "·");
        int i2 = copy + 91;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return spannableStringColor;
    }

    public static long getTimeTodayStart(long j) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 97;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        int i4 = getAsAtTimestamp + 17;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return timeInMillis;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static long getTimeTodayEnd(long j) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 111;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis() + 86400000;
        int i4 = copy + 41;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            return timeInMillis;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String formatTimeTodayHm(String str) {
        int i = 2 % 2;
        int i2 = copy + 101;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            long j = Long.parseLong(str);
            if (isOneDay(getTodayStartTime(), j)) {
                return new SimpleDateFormat("HH:mm", Locale.ENGLISH).format(new Date(j));
            }
            String str2 = new SimpleDateFormat(DAY_MONTH_YEAR_HH_MM, Locale.ENGLISH).format(new Date(j));
            int i4 = copy + 47;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                return str2;
            }
            throw null;
        } catch (NumberFormatException e) {
            L.d("=====", e.getMessage());
            return "";
        }
    }

    public static String formatTimeTodayHms(String str) {
        int i = 2 % 2;
        int i2 = copy + 13;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            if (TextUtils.isEmpty(str)) {
                int i3 = copy + 17;
                getAsAtTimestamp = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 21 / 0;
                }
                return "";
            }
            try {
                long j = Long.parseLong(str);
                if (isOneDay(getTodayStartTime(), j)) {
                    return new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH).format(new Date(j));
                }
                return new SimpleDateFormat(DAY_MONTH_YEAR_HH_MM_SS, Locale.ENGLISH).format(new Date(j));
            } catch (NumberFormatException e) {
                L.d("=====", e.getMessage());
                return "";
            }
        }
        TextUtils.isEmpty(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean isOneDay(long j, long j2) {
        int i = 2 % 2;
        int i2 = copy + 49;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            boolean zEquals = formatTime(j2, "dd/MM/yyyy").equals(formatTime(j, "dd/MM/yyyy"));
            int i3 = copy + 7;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            return zEquals;
        }
        formatTime(j2, "dd/MM/yyyy").equals(formatTime(j, "dd/MM/yyyy"));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 35 % 2;
    }
}
