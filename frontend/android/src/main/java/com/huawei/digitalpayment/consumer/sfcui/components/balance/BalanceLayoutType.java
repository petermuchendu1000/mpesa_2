package com.huawei.digitalpayment.consumer.sfcui.components.balance;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/balance/BalanceLayoutType;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "POSTPAID", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BalanceLayoutType {
    private static final EnumEntries $ENTRIES;
    private static final BalanceLayoutType[] $VALUES;
    public static final BalanceLayoutType DEFAULT = new BalanceLayoutType("DEFAULT", 0);
    public static final BalanceLayoutType POSTPAID = new BalanceLayoutType("POSTPAID", 1);
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    private BalanceLayoutType(String str, int i) {
    }

    static {
        BalanceLayoutType[] balanceLayoutTypeArr$values = $values();
        $VALUES = balanceLayoutTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(balanceLayoutTypeArr$values);
        int i = component2 + 23;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static BalanceLayoutType valueOf(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        BalanceLayoutType balanceLayoutType = (BalanceLayoutType) Enum.valueOf(BalanceLayoutType.class, str);
        int i4 = component3 + 47;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return balanceLayoutType;
    }

    public static BalanceLayoutType[] values() {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        BalanceLayoutType[] balanceLayoutTypeArr = (BalanceLayoutType[]) $VALUES.clone();
        int i4 = copydefault + 33;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return balanceLayoutTypeArr;
    }

    private static final BalanceLayoutType[] $values() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 49;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        BalanceLayoutType[] balanceLayoutTypeArr = {DEFAULT, POSTPAID};
        int i5 = i2 + 121;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return balanceLayoutTypeArr;
    }

    public static EnumEntries<BalanceLayoutType> getEntries() {
        int i = 2 % 2;
        int i2 = component3 + 63;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        EnumEntries<BalanceLayoutType> enumEntries = $ENTRIES;
        int i5 = i3 + 107;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
