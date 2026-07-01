package com.safaricom.consumer.commons.amountvalidation;

import com.safaricom.consumer.commons.util.InputState;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/safaricom/consumer/commons/amountvalidation/AmountValidator;", "", "inputState", "Lcom/safaricom/consumer/commons/util/InputState;", "<init>", "(Ljava/lang/String;ILcom/safaricom/consumer/commons/util/InputState;)V", "getInputState", "()Lcom/safaricom/consumer/commons/util/InputState;", "NO_INPUT", "ABOVE_MAX_AMOUNT", "BELOW_MIN_AMOUNT", "ABOVE_CURRENT_BALANCE", "ABOVE_CURRENT_OVERDRAW_BALANCE", "USE_OVERDRAW_BALANCE", "NOT_MULTIPLE", "ABOVE_BILL_AMOUNT", "WARNING", "ABOVE_BONGA_POINTS", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AmountValidator {
    private static final EnumEntries $ENTRIES;
    private static final AmountValidator[] $VALUES;
    private final InputState inputState;
    public static final AmountValidator NO_INPUT = new AmountValidator("NO_INPUT", 0, InputState.DISABLE_SUBMISSION_NO_ERROR);
    public static final AmountValidator ABOVE_MAX_AMOUNT = new AmountValidator("ABOVE_MAX_AMOUNT", 1, InputState.DISABLE_SUBMISSION_ERROR);
    public static final AmountValidator BELOW_MIN_AMOUNT = new AmountValidator("BELOW_MIN_AMOUNT", 2, InputState.DISABLE_SUBMISSION_ERROR);
    public static final AmountValidator ABOVE_CURRENT_BALANCE = new AmountValidator("ABOVE_CURRENT_BALANCE", 3, InputState.DISABLE_SUBMISSION_ERROR);
    public static final AmountValidator ABOVE_CURRENT_OVERDRAW_BALANCE = new AmountValidator("ABOVE_CURRENT_OVERDRAW_BALANCE", 4, InputState.DISABLE_SUBMISSION_ERROR);
    public static final AmountValidator USE_OVERDRAW_BALANCE = new AmountValidator("USE_OVERDRAW_BALANCE", 5, InputState.DISABLE_SUBMISSION_ERROR);
    public static final AmountValidator NOT_MULTIPLE = new AmountValidator("NOT_MULTIPLE", 6, InputState.DISABLE_SUBMISSION_ERROR);
    public static final AmountValidator ABOVE_BILL_AMOUNT = new AmountValidator("ABOVE_BILL_AMOUNT", 7, InputState.DISABLE_SUBMISSION_ERROR);
    public static final AmountValidator WARNING = new AmountValidator("WARNING", 8, InputState.WARNING_NO_ERROR);
    public static final AmountValidator ABOVE_BONGA_POINTS = new AmountValidator("ABOVE_BONGA_POINTS", 9, InputState.DISABLE_SUBMISSION_ERROR);

    private AmountValidator(String str, int i, InputState inputState) {
        this.inputState = inputState;
    }

    public final InputState getInputState() {
        return this.inputState;
    }

    static {
        AmountValidator[] amountValidatorArr$values = $values();
        $VALUES = amountValidatorArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(amountValidatorArr$values);
    }

    public static AmountValidator valueOf(String str) {
        return (AmountValidator) Enum.valueOf(AmountValidator.class, str);
    }

    public static AmountValidator[] values() {
        return (AmountValidator[]) $VALUES.clone();
    }

    private static final AmountValidator[] $values() {
        return new AmountValidator[]{NO_INPUT, ABOVE_MAX_AMOUNT, BELOW_MIN_AMOUNT, ABOVE_CURRENT_BALANCE, ABOVE_CURRENT_OVERDRAW_BALANCE, USE_OVERDRAW_BALANCE, NOT_MULTIPLE, ABOVE_BILL_AMOUNT, WARNING, ABOVE_BONGA_POINTS};
    }

    public static EnumEntries<AmountValidator> getEntries() {
        return $ENTRIES;
    }
}
