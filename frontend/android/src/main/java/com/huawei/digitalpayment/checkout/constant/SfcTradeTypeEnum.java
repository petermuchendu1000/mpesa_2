package com.huawei.digitalpayment.checkout.constant;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/checkout/constant/SfcTradeTypeEnum;", "", "checkoutParam", "", "transferParam", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCheckoutParam", "()Ljava/lang/String;", "setCheckoutParam", "(Ljava/lang/String;)V", "getTransferParam", "setTransferParam", "SEND_MONEY", "BUY_GOODS", "REQUEST_MONEY", "WITHDRAW_AT_AGENT", "POCHI_LA_BIASHARA", "PAY_BILL", "EASY_CHECKOUT", "BATCH_TRANSFER", "AIRTIME_TOP_UP", "P2P_TRANSFER", "ConsumerCheckOutUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SfcTradeTypeEnum {
    private static final EnumEntries $ENTRIES;
    private static final SfcTradeTypeEnum[] $VALUES;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;
    private String checkoutParam;
    private String transferParam;
    public static final SfcTradeTypeEnum SEND_MONEY = new SfcTradeTypeEnum("SEND_MONEY", 0, "", "");
    public static final SfcTradeTypeEnum BUY_GOODS = new SfcTradeTypeEnum("BUY_GOODS", 1, "", "");
    public static final SfcTradeTypeEnum REQUEST_MONEY = new SfcTradeTypeEnum("REQUEST_MONEY", 2, "prePayRequestMoney", "h5PayOrder");
    public static final SfcTradeTypeEnum WITHDRAW_AT_AGENT = new SfcTradeTypeEnum("WITHDRAW_AT_AGENT", 3, "", "");
    public static final SfcTradeTypeEnum POCHI_LA_BIASHARA = new SfcTradeTypeEnum("POCHI_LA_BIASHARA", 4, "", "");
    public static final SfcTradeTypeEnum PAY_BILL = new SfcTradeTypeEnum("PAY_BILL", 5, "", "");
    public static final SfcTradeTypeEnum EASY_CHECKOUT = new SfcTradeTypeEnum("EASY_CHECKOUT", 6, "checkOut", "payOrder");
    public static final SfcTradeTypeEnum BATCH_TRANSFER = new SfcTradeTypeEnum("BATCH_TRANSFER", 7, "batchTransfer/checkout", "batchTransfer/payOrder");
    public static final SfcTradeTypeEnum AIRTIME_TOP_UP = new SfcTradeTypeEnum("AIRTIME_TOP_UP", 8, "preRechargeAirtime", "rechargeAirtime");
    public static final SfcTradeTypeEnum P2P_TRANSFER = new SfcTradeTypeEnum("P2P_TRANSFER", 9, "preP2PTransfer", "p2pTransfer");

    private SfcTradeTypeEnum(String str, int i, String str2, String str3) {
        this.checkoutParam = str2;
        this.transferParam = str3;
    }

    public final String getCheckoutParam() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 65;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.checkoutParam;
        int i5 = i2 + 87;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTransferParam() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.transferParam;
        int i5 = i3 + 119;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setCheckoutParam(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 69;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.checkoutParam = str;
        if (i4 == 0) {
            int i5 = 15 / 0;
        }
        int i6 = i2 + 67;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setTransferParam(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 67;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.transferParam = str;
        int i5 = i2 + 39;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
    }

    static {
        SfcTradeTypeEnum[] sfcTradeTypeEnumArr$values = $values();
        $VALUES = sfcTradeTypeEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(sfcTradeTypeEnumArr$values);
        int i = component1 + 47;
        copydefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 6 / 0;
        }
    }

    public static SfcTradeTypeEnum valueOf(String str) {
        int i = 2 % 2;
        int i2 = component2 + 51;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        SfcTradeTypeEnum sfcTradeTypeEnum = (SfcTradeTypeEnum) Enum.valueOf(SfcTradeTypeEnum.class, str);
        int i3 = ShareDataUIState + 55;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return sfcTradeTypeEnum;
        }
        obj.hashCode();
        throw null;
    }

    public static SfcTradeTypeEnum[] values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        SfcTradeTypeEnum[] sfcTradeTypeEnumArr = (SfcTradeTypeEnum[]) $VALUES.clone();
        int i4 = component2 + 45;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return sfcTradeTypeEnumArr;
    }

    private static final SfcTradeTypeEnum[] $values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 11;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        SfcTradeTypeEnum[] sfcTradeTypeEnumArr = {SEND_MONEY, BUY_GOODS, REQUEST_MONEY, WITHDRAW_AT_AGENT, POCHI_LA_BIASHARA, PAY_BILL, EASY_CHECKOUT, BATCH_TRANSFER, AIRTIME_TOP_UP, P2P_TRANSFER};
        int i5 = i2 + 89;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return sfcTradeTypeEnumArr;
    }

    public static EnumEntries<SfcTradeTypeEnum> getEntries() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 113;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<SfcTradeTypeEnum> enumEntries = $ENTRIES;
        int i5 = i2 + 7;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return enumEntries;
    }
}
