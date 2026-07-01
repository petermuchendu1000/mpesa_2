package com.safaricom.consumer.commons.withdraw;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/safaricom/consumer/commons/withdraw/WithdrawType;", "", "<init>", "(Ljava/lang/String;I)V", "EFT", "RTS", "UNDEFINED", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WithdrawType {
    private static final EnumEntries $ENTRIES;
    private static final WithdrawType[] $VALUES;
    public static final WithdrawType EFT = new WithdrawType("EFT", 0);
    public static final WithdrawType RTS = new WithdrawType("RTS", 1);
    public static final WithdrawType UNDEFINED = new WithdrawType("UNDEFINED", 2);

    private WithdrawType(String str, int i) {
    }

    static {
        WithdrawType[] withdrawTypeArr$values = $values();
        $VALUES = withdrawTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(withdrawTypeArr$values);
    }

    public static WithdrawType valueOf(String str) {
        return (WithdrawType) Enum.valueOf(WithdrawType.class, str);
    }

    public static WithdrawType[] values() {
        return (WithdrawType[]) $VALUES.clone();
    }

    private static final WithdrawType[] $values() {
        return new WithdrawType[]{EFT, RTS, UNDEFINED};
    }

    public static EnumEntries<WithdrawType> getEntries() {
        return $ENTRIES;
    }
}
