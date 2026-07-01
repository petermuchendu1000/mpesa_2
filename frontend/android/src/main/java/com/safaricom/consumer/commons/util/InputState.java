package com.safaricom.consumer.commons.util;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/safaricom/consumer/commons/util/InputState;", "", "<init>", "(Ljava/lang/String;I)V", "DISABLE_SUBMISSION_NO_ERROR", "DISABLE_SUBMISSION_ERROR", "WARNING_NO_ERROR", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InputState {
    private static final EnumEntries $ENTRIES;
    private static final InputState[] $VALUES;
    public static final InputState DISABLE_SUBMISSION_NO_ERROR = new InputState("DISABLE_SUBMISSION_NO_ERROR", 0);
    public static final InputState DISABLE_SUBMISSION_ERROR = new InputState("DISABLE_SUBMISSION_ERROR", 1);
    public static final InputState WARNING_NO_ERROR = new InputState("WARNING_NO_ERROR", 2);

    private InputState(String str, int i) {
    }

    static {
        InputState[] inputStateArr$values = $values();
        $VALUES = inputStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(inputStateArr$values);
    }

    public static InputState valueOf(String str) {
        return (InputState) Enum.valueOf(InputState.class, str);
    }

    public static InputState[] values() {
        return (InputState[]) $VALUES.clone();
    }

    private static final InputState[] $values() {
        return new InputState[]{DISABLE_SUBMISSION_NO_ERROR, DISABLE_SUBMISSION_ERROR, WARNING_NO_ERROR};
    }

    public static EnumEntries<InputState> getEntries() {
        return $ENTRIES;
    }
}
