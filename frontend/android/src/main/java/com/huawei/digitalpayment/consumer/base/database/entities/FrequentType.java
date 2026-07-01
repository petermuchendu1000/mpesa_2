package com.huawei.digitalpayment.consumer.base.database.entities;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/FrequentType;", "", "<init>", "(Ljava/lang/String;I)V", "TRANSACTION", "MINI_APP", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FrequentType {
    private static final EnumEntries $ENTRIES;
    private static final FrequentType[] $VALUES;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 1;
    private static int copydefault;
    public static final FrequentType TRANSACTION = new FrequentType("TRANSACTION", 0);
    public static final FrequentType MINI_APP = new FrequentType("MINI_APP", 1);

    private FrequentType(String str, int i) {
    }

    static {
        FrequentType[] frequentTypeArr$values = $values();
        $VALUES = frequentTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(frequentTypeArr$values);
        int i = component3 + 81;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FrequentType valueOf(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FrequentType frequentType = (FrequentType) Enum.valueOf(FrequentType.class, str);
        int i4 = ShareDataUIState + 95;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return frequentType;
    }

    public static FrequentType[] values() {
        int i = 2 % 2;
        int i2 = component1 + 119;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return (FrequentType[]) $VALUES.clone();
        }
        int i3 = 36 / 0;
        return (FrequentType[]) $VALUES.clone();
    }

    private static final FrequentType[] $values() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        FrequentType[] frequentTypeArr = {TRANSACTION, MINI_APP};
        int i5 = i3 + 75;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return frequentTypeArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<FrequentType> getEntries() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 105;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<FrequentType> enumEntries = $ENTRIES;
        int i5 = i2 + 103;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
