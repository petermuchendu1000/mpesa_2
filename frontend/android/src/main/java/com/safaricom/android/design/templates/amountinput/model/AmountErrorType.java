package com.safaricom.android.design.templates.amountinput.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/safaricom/android/design/templates/amountinput/model/AmountErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "SUBMISSION_ERROR", "OVERDRAW", "NO_ERROR", "ConsumerSfcAmountInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AmountErrorType {
    private static final EnumEntries $ENTRIES;
    private static final AmountErrorType[] $VALUES;
    public static final AmountErrorType WARNING = new AmountErrorType("WARNING", 0);
    public static final AmountErrorType SUBMISSION_ERROR = new AmountErrorType("SUBMISSION_ERROR", 1);
    public static final AmountErrorType OVERDRAW = new AmountErrorType("OVERDRAW", 2);
    public static final AmountErrorType NO_ERROR = new AmountErrorType("NO_ERROR", 3);

    private AmountErrorType(String str, int i) {
    }

    static {
        AmountErrorType[] amountErrorTypeArr$values = $values();
        $VALUES = amountErrorTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(amountErrorTypeArr$values);
    }

    public static AmountErrorType valueOf(String str) {
        return (AmountErrorType) Enum.valueOf(AmountErrorType.class, str);
    }

    public static AmountErrorType[] values() {
        return (AmountErrorType[]) $VALUES.clone();
    }

    private static final AmountErrorType[] $values() {
        return new AmountErrorType[]{WARNING, SUBMISSION_ERROR, OVERDRAW, NO_ERROR};
    }

    public static EnumEntries<AmountErrorType> getEntries() {
        return $ENTRIES;
    }
}
