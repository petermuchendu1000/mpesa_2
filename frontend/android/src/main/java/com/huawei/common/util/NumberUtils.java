package com.huawei.common.util;

public final class NumberUtils {
    public static long parseLong(String str) {
        return parseLong(str, 0L);
    }

    public static long parseLong(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return j;
        }
    }

    public static int parseInt(String str) {
        return parseInt(str, 0);
    }

    public static int parseInt(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public static Double parseDouble(String str) {
        return parseDouble(str, Double.valueOf(0.0d));
    }

    public static Double parseDouble(String str, Double d2) {
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (Exception unused) {
            return d2;
        }
    }
}
