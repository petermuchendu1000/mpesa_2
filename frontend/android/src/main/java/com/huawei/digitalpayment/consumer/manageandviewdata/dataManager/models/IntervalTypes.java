package com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models;

import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/IntervalTypes;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "TODAY", "YESTERDAY", "LAST_SEVEN_DAYS", "MONTHLY", "LAST_THIRTY_DAYS", "CUSTOM_PERIOD", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntervalTypes {
    private static final EnumEntries $ENTRIES;
    private static final IntervalTypes[] $VALUES;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int copydefault = 1;
    private final String type;
    public static final IntervalTypes TODAY = new IntervalTypes("TODAY", 0, "Today");
    public static final IntervalTypes YESTERDAY = new IntervalTypes("YESTERDAY", 1, "Yesterday");
    public static final IntervalTypes LAST_SEVEN_DAYS = new IntervalTypes("LAST_SEVEN_DAYS", 2, "Last 7 Days");
    public static final IntervalTypes MONTHLY = new IntervalTypes("MONTHLY", 3, Keys.WITH_EXPIRY_CATEGORY_MONTHLY);
    public static final IntervalTypes LAST_THIRTY_DAYS = new IntervalTypes("LAST_THIRTY_DAYS", 4, "Last 30 Days");
    public static final IntervalTypes CUSTOM_PERIOD = new IntervalTypes("CUSTOM_PERIOD", 5, "Select Dates");

    private IntervalTypes(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.type;
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        return str;
    }

    static {
        IntervalTypes[] intervalTypesArr$values = $values();
        $VALUES = intervalTypesArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(intervalTypesArr$values);
        int i = copydefault + 107;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static IntervalTypes valueOf(String str) {
        int i = 2 % 2;
        int i2 = component1 + 95;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        IntervalTypes intervalTypes = (IntervalTypes) Enum.valueOf(IntervalTypes.class, str);
        int i3 = component1 + 103;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return intervalTypes;
    }

    public static IntervalTypes[] values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        IntervalTypes[] intervalTypesArr = (IntervalTypes[]) $VALUES.clone();
        int i4 = ShareDataUIState + 53;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return intervalTypesArr;
    }

    private static final IntervalTypes[] $values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        IntervalTypes[] intervalTypesArr = {TODAY, YESTERDAY, LAST_SEVEN_DAYS, MONTHLY, LAST_THIRTY_DAYS, CUSTOM_PERIOD};
        int i5 = i3 + 39;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return intervalTypesArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<IntervalTypes> getEntries() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        EnumEntries<IntervalTypes> enumEntries = $ENTRIES;
        int i5 = i3 + 55;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 56 / 0;
        }
        return enumEntries;
    }
}
