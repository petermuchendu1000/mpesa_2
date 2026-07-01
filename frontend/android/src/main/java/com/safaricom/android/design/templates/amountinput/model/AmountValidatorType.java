package com.safaricom.android.design.templates.amountinput.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/safaricom/android/design/templates/amountinput/model/AmountValidatorType;", "", "<init>", "(Ljava/lang/String;I)V", "NO_INPUT", "BELOW_MIN_AMOUNT", "ABOVE_MAX_AMOUNT", "ABOVE_CURRENT_BALANCE", "ABOVE_CURRENT_OVERDRAW_BALANCE", "USE_OVERDRAW_BALANCE", "WARNING", "CONSTRAINTS_VIOLATED", "INVALID_INPUT", "ConsumerSfcAmountInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AmountValidatorType {
    private static final EnumEntries $ENTRIES;
    private static final AmountValidatorType[] $VALUES;
    public static final AmountValidatorType NO_INPUT = new AmountValidatorType("NO_INPUT", 0);
    public static final AmountValidatorType BELOW_MIN_AMOUNT = new AmountValidatorType("BELOW_MIN_AMOUNT", 1);
    public static final AmountValidatorType ABOVE_MAX_AMOUNT = new AmountValidatorType("ABOVE_MAX_AMOUNT", 2);
    public static final AmountValidatorType ABOVE_CURRENT_BALANCE = new AmountValidatorType("ABOVE_CURRENT_BALANCE", 3);
    public static final AmountValidatorType ABOVE_CURRENT_OVERDRAW_BALANCE = new AmountValidatorType("ABOVE_CURRENT_OVERDRAW_BALANCE", 4);
    public static final AmountValidatorType USE_OVERDRAW_BALANCE = new AmountValidatorType("USE_OVERDRAW_BALANCE", 5);
    public static final AmountValidatorType WARNING = new AmountValidatorType("WARNING", 6);
    public static final AmountValidatorType CONSTRAINTS_VIOLATED = new AmountValidatorType("CONSTRAINTS_VIOLATED", 7);
    public static final AmountValidatorType INVALID_INPUT = new AmountValidatorType("INVALID_INPUT", 8);

    private AmountValidatorType(String str, int i) {
    }

    static {
        AmountValidatorType[] amountValidatorTypeArr$values = $values();
        $VALUES = amountValidatorTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(amountValidatorTypeArr$values);
    }

    public static AmountValidatorType valueOf(String str) {
        return (AmountValidatorType) Enum.valueOf(AmountValidatorType.class, str);
    }

    public static AmountValidatorType[] values() {
        return (AmountValidatorType[]) $VALUES.clone();
    }

    private static final AmountValidatorType[] $values() {
        return new AmountValidatorType[]{NO_INPUT, BELOW_MIN_AMOUNT, ABOVE_MAX_AMOUNT, ABOVE_CURRENT_BALANCE, ABOVE_CURRENT_OVERDRAW_BALANCE, USE_OVERDRAW_BALANCE, WARNING, CONSTRAINTS_VIOLATED, INVALID_INPUT};
    }

    public static EnumEntries<AmountValidatorType> getEntries() {
        return $ENTRIES;
    }
}
