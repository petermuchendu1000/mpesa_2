package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.utils;

public class StringUtils {
    private static int component2 = 0;
    private static int component3 = 1;

    public static boolean isInteger(String str) {
        int i;
        int i2 = 2 % 2;
        if (str == null) {
            int i3 = component3 + 95;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                return false;
            }
            throw null;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        if (str.charAt(0) == '-') {
            int i4 = component2 + 29;
            int i5 = i4 % 128;
            component3 = i5;
            if (i4 % 2 != 0 ? length == 1 : length == 1) {
                return false;
            }
            int i6 = i5 + 39;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            i = 1;
        } else {
            i = 0;
        }
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= '/' || cCharAt >= ':') {
                return false;
            }
            i++;
        }
        int i8 = component2 + 105;
        component3 = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }
}
