package com.huawei.digitalpayment.common.theme.data;

import com.huawei.digitalpayment.common.theme.ThemeManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0003¨\u0006\u0006"}, d2 = {"parseThemeString", "", "parseThemeColor", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "defaultColor", "CommonHomeThemeModule_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ThemeExtKt {
    private static int component2 = 1;
    private static int component3;

    public static final String parseThemeString(String str) {
        int i = 2 % 2;
        int i2 = component2 + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String themeString = ThemeManager.INSTANCE.getThemeInterface().parseThemeString(str);
        int i4 = component3 + 21;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return themeString;
    }

    public static final Integer parseThemeColor(String str) {
        int i = 2 % 2;
        int i2 = component2 + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Integer themeColor = ThemeManager.INSTANCE.getThemeInterface().parseThemeColor(str);
        int i4 = component3 + 7;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return themeColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final int parseThemeColor(String str, int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 79;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            parseThemeColor(str);
            throw null;
        }
        Integer themeColor = parseThemeColor(str);
        if (themeColor == null) {
            return i;
        }
        int i4 = component2 + 123;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return themeColor.intValue();
        }
        themeColor.intValue();
        obj.hashCode();
        throw null;
    }
}
