package com.huawei.digitalpayment.checkout.ui.view.banner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
public final class RatioDatumMode {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;
    final int mode;
    public static final RatioDatumMode DATUM_AUTO = new RatioDatumMode("DATUM_AUTO", 0, 0);
    public static final RatioDatumMode DATUM_WIDTH = new RatioDatumMode("DATUM_WIDTH", 1, 1);
    public static final RatioDatumMode DATUM_HEIGHT = new RatioDatumMode("DATUM_HEIGHT", 2, 2);
    private static final RatioDatumMode[] $VALUES = $values();

    private static RatioDatumMode[] $values() {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        RatioDatumMode ratioDatumMode = DATUM_AUTO;
        return i3 == 0 ? new RatioDatumMode[]{DATUM_WIDTH, ratioDatumMode, DATUM_HEIGHT} : new RatioDatumMode[]{ratioDatumMode, DATUM_WIDTH, DATUM_HEIGHT};
    }

    public static RatioDatumMode valueOf(String str) {
        int i = 2 % 2;
        int i2 = component2 + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        RatioDatumMode ratioDatumMode = (RatioDatumMode) Enum.valueOf(RatioDatumMode.class, str);
        int i4 = component2 + 111;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return ratioDatumMode;
    }

    public static RatioDatumMode[] values() {
        int i = 2 % 2;
        int i2 = component2 + 87;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        RatioDatumMode[] ratioDatumModeArr = (RatioDatumMode[]) $VALUES.clone();
        int i3 = component2 + 121;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return ratioDatumModeArr;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = ShareDataUIState + 53;
        component3 = i % 128;
        int i2 = i % 2;
    }

    private RatioDatumMode(String str, int i, int i2) {
        this.mode = i2;
    }

    public static RatioDatumMode valueOf(int i) {
        int i2 = 2 % 2;
        RatioDatumMode ratioDatumMode = DATUM_WIDTH;
        if (i != ratioDatumMode.mode) {
            RatioDatumMode ratioDatumMode2 = DATUM_HEIGHT;
            return i == ratioDatumMode2.mode ? ratioDatumMode2 : DATUM_AUTO;
        }
        int i3 = copydefault + 27;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 93;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            return ratioDatumMode;
        }
        throw null;
    }
}
