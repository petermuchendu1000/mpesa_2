package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model;

import com.alibaba.griver.base.common.utils.NetworkUtils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
public final class SpeedTestMode {
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;
    public static final SpeedTestMode NONE = new SpeedTestMode(NetworkUtils.NETWORK_TYPE_NONE, 0);
    public static final SpeedTestMode DOWNLOAD = new SpeedTestMode("DOWNLOAD", 1);
    public static final SpeedTestMode UPLOAD = new SpeedTestMode("UPLOAD", 2);
    private static final SpeedTestMode[] $VALUES = $values();

    private static SpeedTestMode[] $values() {
        SpeedTestMode[] speedTestModeArr;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 81;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            SpeedTestMode speedTestMode = NONE;
            SpeedTestMode speedTestMode2 = DOWNLOAD;
            SpeedTestMode speedTestMode3 = UPLOAD;
            speedTestModeArr = new SpeedTestMode[3];
            speedTestModeArr[1] = speedTestMode;
            speedTestModeArr[0] = speedTestMode2;
            speedTestModeArr[4] = speedTestMode3;
        } else {
            speedTestModeArr = new SpeedTestMode[]{NONE, DOWNLOAD, UPLOAD};
        }
        int i4 = i2 + 83;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return speedTestModeArr;
        }
        throw null;
    }

    private SpeedTestMode(String str, int i) {
    }

    public static SpeedTestMode valueOf(String str) {
        int i = 2 % 2;
        int i2 = component3 + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        SpeedTestMode speedTestMode = (SpeedTestMode) Enum.valueOf(SpeedTestMode.class, str);
        int i4 = component2 + 73;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return speedTestMode;
    }

    public static SpeedTestMode[] values() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        SpeedTestMode[] speedTestModeArr = (SpeedTestMode[]) $VALUES.clone();
        int i4 = component2 + 97;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return speedTestModeArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component1 + 91;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
