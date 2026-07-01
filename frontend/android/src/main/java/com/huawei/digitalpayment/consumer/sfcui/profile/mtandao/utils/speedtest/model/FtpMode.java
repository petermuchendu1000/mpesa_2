package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
public final class FtpMode {
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault = 1;
    public static final FtpMode ACTIVE = new FtpMode("ACTIVE", 0);
    public static final FtpMode PASSIVE = new FtpMode("PASSIVE", 1);
    private static final FtpMode[] $VALUES = $values();

    private static FtpMode[] $values() {
        int i = 2 % 2;
        int i2 = component1 + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FtpMode ftpMode = ACTIVE;
        if (i3 != 0) {
            return new FtpMode[]{ftpMode, PASSIVE};
        }
        FtpMode ftpMode2 = PASSIVE;
        FtpMode[] ftpModeArr = new FtpMode[4];
        ftpModeArr[0] = ftpMode;
        ftpModeArr[1] = ftpMode2;
        return ftpModeArr;
    }

    private FtpMode(String str, int i) {
    }

    public static FtpMode valueOf(String str) {
        int i = 2 % 2;
        int i2 = component2 + 21;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FtpMode ftpMode = (FtpMode) Enum.valueOf(FtpMode.class, str);
        if (i3 == 0) {
            return ftpMode;
        }
        throw null;
    }

    public static FtpMode[] values() {
        int i = 2 % 2;
        int i2 = component2 + 79;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FtpMode[] ftpModeArr = (FtpMode[]) $VALUES.clone();
        int i4 = component1 + 111;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return ftpModeArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = copydefault + 39;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
