package com.huawei.digitalpayment.consumer.manageandviewdata.resp;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/LimitType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "DATA", "AIRTIME", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LimitType {
    private static final EnumEntries $ENTRIES;
    private static final LimitType[] $VALUES;
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int component3;
    private final String type;
    public static final LimitType DATA = new LimitType("DATA", 0, "data");
    public static final LimitType AIRTIME = new LimitType("AIRTIME", 1, "airtime");

    private LimitType(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 125;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        LimitType[] limitTypeArr$values = $values();
        $VALUES = limitTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(limitTypeArr$values);
        int i = component3 + 75;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static LimitType valueOf(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return (LimitType) Enum.valueOf(LimitType.class, str);
        }
        throw null;
    }

    public static LimitType[] values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LimitType[] limitTypeArr = (LimitType[]) $VALUES.clone();
        int i4 = ShareDataUIState + 45;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return limitTypeArr;
    }

    private static final LimitType[] $values() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 71;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        LimitType[] limitTypeArr = {DATA, AIRTIME};
        int i5 = i2 + 67;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return limitTypeArr;
    }

    public static EnumEntries<LimitType> getEntries() {
        int i = 2 % 2;
        int i2 = component2 + 3;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        EnumEntries<LimitType> enumEntries = $ENTRIES;
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        return enumEntries;
    }
}
