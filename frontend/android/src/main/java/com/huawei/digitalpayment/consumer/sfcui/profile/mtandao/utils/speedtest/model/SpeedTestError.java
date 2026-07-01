package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
public final class SpeedTestError {
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    public static final SpeedTestError INVALID_HTTP_RESPONSE = new SpeedTestError("INVALID_HTTP_RESPONSE", 0);
    public static final SpeedTestError SOCKET_ERROR = new SpeedTestError("SOCKET_ERROR", 1);
    public static final SpeedTestError SOCKET_TIMEOUT = new SpeedTestError("SOCKET_TIMEOUT", 2);
    public static final SpeedTestError CONNECTION_ERROR = new SpeedTestError("CONNECTION_ERROR", 3);
    public static final SpeedTestError MALFORMED_URI = new SpeedTestError("MALFORMED_URI", 4);
    public static final SpeedTestError UNSUPPORTED_PROTOCOL = new SpeedTestError("UNSUPPORTED_PROTOCOL", 5);
    private static final SpeedTestError[] $VALUES = $values();

    private static SpeedTestError[] $values() {
        int i = 2 % 2;
        int i2 = component1 + 85;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        SpeedTestError[] speedTestErrorArr = {INVALID_HTTP_RESPONSE, SOCKET_ERROR, SOCKET_TIMEOUT, CONNECTION_ERROR, MALFORMED_URI, UNSUPPORTED_PROTOCOL};
        int i5 = i3 + 15;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return speedTestErrorArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private SpeedTestError(String str, int i) {
    }

    public static SpeedTestError valueOf(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        SpeedTestError speedTestError = (SpeedTestError) Enum.valueOf(SpeedTestError.class, str);
        int i4 = ShareDataUIState + 27;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return speedTestError;
        }
        throw null;
    }

    public static SpeedTestError[] values() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        SpeedTestError[] speedTestErrorArr = (SpeedTestError[]) $VALUES.clone();
        int i4 = ShareDataUIState + 83;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return speedTestErrorArr;
    }

    static {
        int i = copydefault + 35;
        component3 = i % 128;
        int i2 = i % 2;
    }
}
