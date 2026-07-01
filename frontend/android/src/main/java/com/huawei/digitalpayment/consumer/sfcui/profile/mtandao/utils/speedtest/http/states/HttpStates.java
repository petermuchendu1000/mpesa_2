package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.states;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
public final class HttpStates {
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault = 1;
    public static final HttpStates MALFORMED_HTTP_FRAME = new HttpStates("MALFORMED_HTTP_FRAME", 0);
    public static final HttpStates HTTP_FRAME_OK = new HttpStates("HTTP_FRAME_OK", 1);
    public static final HttpStates HTTP_READING_ERROR = new HttpStates("HTTP_READING_ERROR", 2);
    public static final HttpStates HTTP_WRONG_VERSION = new HttpStates("HTTP_WRONG_VERSION", 3);
    public static final HttpStates HTTP_STATE_NONE = new HttpStates("HTTP_STATE_NONE", 4);
    public static final HttpStates SOCKET_ERROR = new HttpStates("SOCKET_ERROR", 5);
    public static final HttpStates HTTP_BODY_PARSE_ERROR = new HttpStates("HTTP_BODY_PARSE_ERROR", 6);
    private static final HttpStates[] $VALUES = $values();

    private static HttpStates[] $values() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 111;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        HttpStates[] httpStatesArr = {MALFORMED_HTTP_FRAME, HTTP_FRAME_OK, HTTP_READING_ERROR, HTTP_WRONG_VERSION, HTTP_STATE_NONE, SOCKET_ERROR, HTTP_BODY_PARSE_ERROR};
        int i5 = i2 + 105;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return httpStatesArr;
    }

    private HttpStates(String str, int i) {
    }

    public static HttpStates valueOf(String str) {
        int i = 2 % 2;
        int i2 = component1 + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        HttpStates httpStates = (HttpStates) Enum.valueOf(HttpStates.class, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = component2 + 19;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return httpStates;
    }

    public static HttpStates[] values() {
        HttpStates[] httpStatesArr;
        int i = 2 % 2;
        int i2 = component2 + 107;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            httpStatesArr = (HttpStates[]) $VALUES.clone();
            int i3 = 21 / 0;
        } else {
            httpStatesArr = (HttpStates[]) $VALUES.clone();
        }
        int i4 = component1 + 75;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return httpStatesArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = copydefault + 123;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 88 / 0;
        }
    }
}
