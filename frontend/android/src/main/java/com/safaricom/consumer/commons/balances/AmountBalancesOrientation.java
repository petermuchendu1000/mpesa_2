package com.safaricom.consumer.commons.balances;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/safaricom/consumer/commons/balances/AmountBalancesOrientation;", "", "<init>", "(Ljava/lang/String;I)V", "VERTICAL", "HORIZONTAL", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AmountBalancesOrientation {
    private static final EnumEntries $ENTRIES;
    private static final AmountBalancesOrientation[] $VALUES;
    public static final AmountBalancesOrientation VERTICAL = new AmountBalancesOrientation("VERTICAL", 0);
    public static final AmountBalancesOrientation HORIZONTAL = new AmountBalancesOrientation("HORIZONTAL", 1);

    private AmountBalancesOrientation(String str, int i) {
    }

    static {
        AmountBalancesOrientation[] amountBalancesOrientationArr$values = $values();
        $VALUES = amountBalancesOrientationArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(amountBalancesOrientationArr$values);
    }

    public static AmountBalancesOrientation valueOf(String str) {
        return (AmountBalancesOrientation) Enum.valueOf(AmountBalancesOrientation.class, str);
    }

    public static AmountBalancesOrientation[] values() {
        return (AmountBalancesOrientation[]) $VALUES.clone();
    }

    private static final AmountBalancesOrientation[] $values() {
        return new AmountBalancesOrientation[]{VERTICAL, HORIZONTAL};
    }

    public static EnumEntries<AmountBalancesOrientation> getEntries() {
        return $ENTRIES;
    }
}
