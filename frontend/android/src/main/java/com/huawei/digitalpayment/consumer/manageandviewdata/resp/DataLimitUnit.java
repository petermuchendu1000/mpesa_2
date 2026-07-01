package com.huawei.digitalpayment.consumer.manageandviewdata.resp;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/DataLimitUnit;", "", "unit", "", "<init>", "(Ljava/lang/String;II)V", "getUnit", "()I", "MB", "GB", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataLimitUnit {
    private static final EnumEntries $ENTRIES;
    private static final DataLimitUnit[] $VALUES;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private final int unit;
    public static final DataLimitUnit MB = new DataLimitUnit("MB", 0, 0);
    public static final DataLimitUnit GB = new DataLimitUnit("GB", 1, 1024);

    private DataLimitUnit(String str, int i, int i2) {
        this.unit = i2;
    }

    public final int getUnit() {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = this.unit;
        int i6 = i3 + 93;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    static {
        DataLimitUnit[] dataLimitUnitArr$values = $values();
        $VALUES = dataLimitUnitArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(dataLimitUnitArr$values);
        int i = component3 + 45;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static DataLimitUnit valueOf(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return (DataLimitUnit) Enum.valueOf(DataLimitUnit.class, str);
        }
        throw null;
    }

    public static DataLimitUnit[] values() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DataLimitUnit[] dataLimitUnitArr = (DataLimitUnit[]) $VALUES.clone();
        int i3 = component1 + 107;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return dataLimitUnitArr;
    }

    private static final DataLimitUnit[] $values() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DataLimitUnit dataLimitUnit = MB;
        if (i3 != 0) {
            return new DataLimitUnit[]{dataLimitUnit, GB};
        }
        DataLimitUnit dataLimitUnit2 = GB;
        DataLimitUnit[] dataLimitUnitArr = new DataLimitUnit[3];
        dataLimitUnitArr[0] = dataLimitUnit;
        dataLimitUnitArr[1] = dataLimitUnit2;
        return dataLimitUnitArr;
    }

    public static EnumEntries<DataLimitUnit> getEntries() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 41;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        EnumEntries<DataLimitUnit> enumEntries = $ENTRIES;
        int i4 = i2 + 3;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }
}
