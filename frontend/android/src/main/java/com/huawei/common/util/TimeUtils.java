package com.huawei.common.util;

import android.content.SharedPreferences;
import com.blankj.utilcode.util.Utils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TimeUtils {
    public static final int DAY = 86400000;
    public static final String DAY_MONTH_YEAR = "dd/MM/yyyy";
    public static final int HOUR = 3600000;
    public static final int MIN = 60000;
    public static final int MSEC = 1;
    public static final int SEC = 1000;
    private static final String ShareDataUIState = "REFRESH_TIME_PROMOTION_MESSAGE";
    public static final String YEAR_MONTH_DAY = "yyyyMMdd";
    private static final String component1 = "REFRESH_TIME_SYSTEM_MESSAGE";
    private static final String component2 = "SERVER_TIME_DIFF_UTC";
    private static final String component3 = "REFRESH_TIME_TRANSACTION_MESSAGE";
    private static volatile SharedPreferences component4 = null;
    private static String copydefault = "TimeDiff";

    public static String getServerTime() {
        return "" + getServerTimeFromUTC().getTime();
    }

    public static void saveServerDiffUTC(String str) {
        try {
            component3(Long.valueOf(Long.parseLong(str) - new Date().getTime()));
        } catch (Exception e) {
            L.d("=====", e.getMessage());
        }
    }

    public static Date getServerTimeFromUTC() {
        try {
            return new Date(new Date().getTime() + ShareDataUIState().longValue());
        } catch (Exception unused) {
            return new Date();
        }
    }

    private static void component3(Long l) {
        if (component4 == null) {
            component4 = Utils.getApp().getSharedPreferences(copydefault, 0);
        }
        SharedPreferences.Editor editorEdit = component4.edit();
        editorEdit.putLong(component2, l.longValue());
        editorEdit.commit();
    }

    private static Long ShareDataUIState() {
        if (component4 == null) {
            component4 = Utils.getApp().getSharedPreferences(copydefault, 0);
        }
        return Long.valueOf(component4.getLong(component2, 0L));
    }

    public static void setSystemMessageRefreshTime(String str) {
        if (component4 == null) {
            component4 = Utils.getApp().getSharedPreferences(copydefault, 0);
        }
        SharedPreferences.Editor editorEdit = component4.edit();
        editorEdit.putString(component1, str);
        editorEdit.apply();
    }

    public static String getSystemMessageRefreshTime() {
        if (component4 == null) {
            component4 = Utils.getApp().getSharedPreferences(copydefault, 0);
        }
        return component4.getString(component1, "");
    }

    public static void setTransactionMessageRefreshTime(String str) {
        if (component4 == null) {
            component4 = Utils.getApp().getSharedPreferences(copydefault, 0);
        }
        SharedPreferences.Editor editorEdit = component4.edit();
        editorEdit.putString(component3, str);
        editorEdit.apply();
    }

    public static String getTransactionMessageRefreshTime() {
        if (component4 == null) {
            component4 = Utils.getApp().getSharedPreferences(copydefault, 0);
        }
        return component4.getString(component3, "");
    }

    public static void setPromotionMessageRefreshTime(String str) {
        if (component4 == null) {
            component4 = Utils.getApp().getSharedPreferences(copydefault, 0);
        }
        SharedPreferences.Editor editorEdit = component4.edit();
        editorEdit.putString(ShareDataUIState, str);
        editorEdit.apply();
    }

    public static String getPromotionMessageRefreshTime() {
        if (component4 == null) {
            component4 = Utils.getApp().getSharedPreferences(copydefault, 0);
        }
        return component4.getString(ShareDataUIState, "");
    }

    public static long getTodayStartTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTime().getTime();
    }

    public static String formatDayAndMonth(String str) {
        try {
            return new SimpleDateFormat("dd/MM", Locale.ENGLISH).format(new Date(Long.parseLong(str)));
        } catch (NumberFormatException e) {
            L.d("=====", e.getMessage());
            return "";
        }
    }

    public static String formatTime(String str, String str2) {
        try {
            return formatTime(Long.parseLong(str), str2);
        } catch (NumberFormatException e) {
            L.d("=====", e.getMessage());
            return "";
        }
    }

    public static String formatTime(long j, String str) {
        try {
            return new SimpleDateFormat(str, Locale.ENGLISH).format(new Date(j));
        } catch (NumberFormatException e) {
            L.d("=====", e.getMessage());
            return "";
        }
    }

    public static String formatTime(Date date, String str) {
        return formatTime(date.getTime(), str);
    }

    public static String formatTime(String str, String str2, String str3) {
        try {
            return formatTime(new SimpleDateFormat(str2, Locale.ENGLISH).parse(str).getTime(), str3);
        } catch (Exception e) {
            L.d("=====", e.getMessage());
            return "";
        }
    }

    public static Date getDate(String str, String str2) {
        try {
            return new SimpleDateFormat(str2, Locale.ENGLISH).parse(str);
        } catch (Exception e) {
            L.d("=====", e.getMessage());
            return null;
        }
    }

    public static boolean isTimestampYesterday(long j) {
        Calendar.getInstance().setTimeInMillis(j);
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        return j >= timeInMillis && j < timeInMillis + 86400000;
    }

    public static boolean isTimestampLastWeek(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return j >= calendar.getTimeInMillis() - 604800000;
    }

    public static boolean isTimestampThisMonth(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1, i);
        calendar2.set(2, i2);
        calendar2.set(5, 1);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        long timeInMillis = calendar2.getTimeInMillis();
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(1, i);
        calendar3.set(2, i2 + 1);
        calendar3.set(5, 1);
        calendar3.set(11, 0);
        calendar3.set(12, 0);
        calendar3.set(13, 0);
        calendar3.set(14, 0);
        return j >= timeInMillis && j < calendar3.getTimeInMillis();
    }

    public static long getTimeTodayStart(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static long getTimeTodayEnd(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis() + 86400000;
    }

    public static Calendar getCalendar(String str, String str2) {
        try {
            Date date = getDate(str, str2);
            if (date == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance(Locale.ENGLISH);
            calendar.setTime(date);
            return calendar;
        } catch (Exception unused) {
            return null;
        }
    }
}
