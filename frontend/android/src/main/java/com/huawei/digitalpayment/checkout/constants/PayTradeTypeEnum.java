package com.huawei.digitalpayment.checkout.constants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
public final class PayTradeTypeEnum {
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;
    private String tradeType;
    public static final PayTradeTypeEnum NATIVE_APP = new PayTradeTypeEnum("NATIVE_APP", 0, "NativeApp");
    public static final PayTradeTypeEnum IN_APP = new PayTradeTypeEnum("IN_APP", 1, "InApp");
    public static final PayTradeTypeEnum QR_CODE = new PayTradeTypeEnum("QR_CODE", 2, "QrCode");
    public static final PayTradeTypeEnum BANK_TRADE = new PayTradeTypeEnum("BANK_TRADE", 3, "BankTrade");
    private static final PayTradeTypeEnum[] $VALUES = $values();

    private static PayTradeTypeEnum[] $values() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 67;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        PayTradeTypeEnum[] payTradeTypeEnumArr = {NATIVE_APP, IN_APP, QR_CODE, BANK_TRADE};
        int i5 = i2 + 93;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return payTradeTypeEnumArr;
        }
        throw null;
    }

    public static PayTradeTypeEnum valueOf(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        PayTradeTypeEnum payTradeTypeEnum = (PayTradeTypeEnum) Enum.valueOf(PayTradeTypeEnum.class, str);
        if (i3 != 0) {
            return payTradeTypeEnum;
        }
        throw null;
    }

    public static PayTradeTypeEnum[] values() {
        PayTradeTypeEnum[] payTradeTypeEnumArr;
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            payTradeTypeEnumArr = (PayTradeTypeEnum[]) $VALUES.clone();
            int i3 = 40 / 0;
        } else {
            payTradeTypeEnumArr = (PayTradeTypeEnum[]) $VALUES.clone();
        }
        int i4 = component3 + 83;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return payTradeTypeEnumArr;
    }

    static {
        int i = component2 + 101;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    private PayTradeTypeEnum(String str, int i, String str2) {
        this.tradeType = str2;
    }

    public String getTradeType() {
        int i = 2 % 2;
        int i2 = component3 + 107;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.tradeType;
        int i5 = i3 + 21;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
