package com.huawei.common.util;

public final class CastUtils {
    private static final String ShareDataUIState = "CastUtils";

    private CastUtils() {
    }

    public static int castToInt(Object obj) {
        return castToInt(obj, 0);
    }

    public static int castToInt(Object obj, int i) {
        Integer num = (Integer) cast(obj, Integer.class);
        return num == null ? i : num.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T cast(Object obj, Class<T> cls) {
        if (cls == null) {
            L.e(ShareDataUIState, "class is null");
            return null;
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }

    public static boolean castToBoolean(Object obj) {
        return castToBoolean(obj, false);
    }

    public static boolean castToBoolean(Object obj, boolean z) {
        Boolean bool = (Boolean) cast(obj, Boolean.class);
        return bool == null ? z : bool.booleanValue();
    }

    public static String castToString(Object obj) {
        return castToString(obj, "");
    }

    public static String castToString(Object obj, String str) {
        String str2 = (String) cast(obj, String.class);
        return str2 == null ? str : str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T cast(Object obj, T t) {
        if (t == null) {
            L.e(ShareDataUIState, "defaultValue is null.");
            return null;
        }
        if (obj != 0) {
            return t.getClass() == obj.getClass() ? obj : t;
        }
        L.e(ShareDataUIState, "object is null.");
        return null;
    }
}
