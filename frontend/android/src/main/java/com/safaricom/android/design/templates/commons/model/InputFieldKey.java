package com.safaricom.android.design.templates.commons.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/safaricom/android/design/templates/commons/model/InputFieldKey;", "", "<init>", "(Ljava/lang/String;I)V", "PHONE_NUMBER", "AGENT_NUMBER", "ACCOUNT_NUMBER", "ConsumerSfcInputCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InputFieldKey {
    private static final EnumEntries $ENTRIES;
    private static final InputFieldKey[] $VALUES;
    public static final InputFieldKey PHONE_NUMBER = new InputFieldKey("PHONE_NUMBER", 0);
    public static final InputFieldKey AGENT_NUMBER = new InputFieldKey("AGENT_NUMBER", 1);
    public static final InputFieldKey ACCOUNT_NUMBER = new InputFieldKey("ACCOUNT_NUMBER", 2);

    private InputFieldKey(String str, int i) {
    }

    static {
        InputFieldKey[] inputFieldKeyArr$values = $values();
        $VALUES = inputFieldKeyArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(inputFieldKeyArr$values);
    }

    public static InputFieldKey valueOf(String str) {
        return (InputFieldKey) Enum.valueOf(InputFieldKey.class, str);
    }

    public static InputFieldKey[] values() {
        return (InputFieldKey[]) $VALUES.clone();
    }

    private static final InputFieldKey[] $values() {
        return new InputFieldKey[]{PHONE_NUMBER, AGENT_NUMBER, ACCOUNT_NUMBER};
    }

    public static EnumEntries<InputFieldKey> getEntries() {
        return $ENTRIES;
    }
}
