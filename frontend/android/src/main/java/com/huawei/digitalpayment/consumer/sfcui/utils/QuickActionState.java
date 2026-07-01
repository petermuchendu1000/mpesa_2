package com.huawei.digitalpayment.consumer.sfcui.utils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/utils/QuickActionState;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "LOADING", "DISABLED", "DISABLED_BY_CONFIG", "GREYED_OUT", "SELECTED", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickActionState {
    private static final EnumEntries $ENTRIES;
    private static final QuickActionState[] $VALUES;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;
    public static final QuickActionState DEFAULT = new QuickActionState("DEFAULT", 0);
    public static final QuickActionState LOADING = new QuickActionState("LOADING", 1);
    public static final QuickActionState DISABLED = new QuickActionState("DISABLED", 2);
    public static final QuickActionState DISABLED_BY_CONFIG = new QuickActionState("DISABLED_BY_CONFIG", 3);
    public static final QuickActionState GREYED_OUT = new QuickActionState("GREYED_OUT", 4);
    public static final QuickActionState SELECTED = new QuickActionState("SELECTED", 5);

    private QuickActionState(String str, int i) {
    }

    static {
        QuickActionState[] quickActionStateArr$values = $values();
        $VALUES = quickActionStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(quickActionStateArr$values);
        int i = component1 + 11;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static QuickActionState valueOf(String str) {
        int i = 2 % 2;
        int i2 = component2 + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        QuickActionState quickActionState = (QuickActionState) Enum.valueOf(QuickActionState.class, str);
        int i4 = component2 + 41;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return quickActionState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static QuickActionState[] values() {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        QuickActionState[] quickActionStateArr = (QuickActionState[]) $VALUES.clone();
        int i3 = component2 + 63;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return quickActionStateArr;
        }
        obj.hashCode();
        throw null;
    }

    private static final QuickActionState[] $values() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 73;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        QuickActionState[] quickActionStateArr = {DEFAULT, LOADING, DISABLED, DISABLED_BY_CONFIG, GREYED_OUT, SELECTED};
        int i5 = i2 + 43;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return quickActionStateArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<QuickActionState> getEntries() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 5;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<QuickActionState> enumEntries = $ENTRIES;
        int i5 = i2 + 61;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
