package com.safaricom.consumer.commons.util;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/safaricom/consumer/commons/util/CurrencyLabelPosition;", "", "<init>", "(Ljava/lang/String;I)V", "START", "END", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CurrencyLabelPosition {
    private static final EnumEntries $ENTRIES;
    private static final CurrencyLabelPosition[] $VALUES;
    public static final CurrencyLabelPosition START = new CurrencyLabelPosition("START", 0);
    public static final CurrencyLabelPosition END = new CurrencyLabelPosition("END", 1);

    private CurrencyLabelPosition(String str, int i) {
    }

    static {
        CurrencyLabelPosition[] currencyLabelPositionArr$values = $values();
        $VALUES = currencyLabelPositionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(currencyLabelPositionArr$values);
    }

    public static CurrencyLabelPosition valueOf(String str) {
        return (CurrencyLabelPosition) Enum.valueOf(CurrencyLabelPosition.class, str);
    }

    public static CurrencyLabelPosition[] values() {
        return (CurrencyLabelPosition[]) $VALUES.clone();
    }

    private static final CurrencyLabelPosition[] $values() {
        return new CurrencyLabelPosition[]{START, END};
    }

    public static EnumEntries<CurrencyLabelPosition> getEntries() {
        return $ENTRIES;
    }
}
