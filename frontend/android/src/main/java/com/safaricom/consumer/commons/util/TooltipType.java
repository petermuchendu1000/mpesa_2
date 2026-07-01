package com.safaricom.consumer.commons.util;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/safaricom/consumer/commons/util/TooltipType;", "", "<init>", "(Ljava/lang/String;I)V", "BALANCE", "TRANSACTION_DETAIL", "SAY_THANKS", "TRANSACTION_SUCCESS", "MY_SPEND", "MULTIPLE_WALLET", "TRANSACTIONS_MY_SERVICES", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TooltipType {
    private static final EnumEntries $ENTRIES;
    private static final TooltipType[] $VALUES;
    public static final TooltipType BALANCE = new TooltipType("BALANCE", 0);
    public static final TooltipType TRANSACTION_DETAIL = new TooltipType("TRANSACTION_DETAIL", 1);
    public static final TooltipType SAY_THANKS = new TooltipType("SAY_THANKS", 2);
    public static final TooltipType TRANSACTION_SUCCESS = new TooltipType("TRANSACTION_SUCCESS", 3);
    public static final TooltipType MY_SPEND = new TooltipType("MY_SPEND", 4);
    public static final TooltipType MULTIPLE_WALLET = new TooltipType("MULTIPLE_WALLET", 5);
    public static final TooltipType TRANSACTIONS_MY_SERVICES = new TooltipType("TRANSACTIONS_MY_SERVICES", 6);

    private TooltipType(String str, int i) {
    }

    static {
        TooltipType[] tooltipTypeArr$values = $values();
        $VALUES = tooltipTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(tooltipTypeArr$values);
    }

    public static TooltipType valueOf(String str) {
        return (TooltipType) Enum.valueOf(TooltipType.class, str);
    }

    public static TooltipType[] values() {
        return (TooltipType[]) $VALUES.clone();
    }

    private static final TooltipType[] $values() {
        return new TooltipType[]{BALANCE, TRANSACTION_DETAIL, SAY_THANKS, TRANSACTION_SUCCESS, MY_SPEND, MULTIPLE_WALLET, TRANSACTIONS_MY_SERVICES};
    }

    public static EnumEntries<TooltipType> getEntries() {
        return $ENTRIES;
    }
}
