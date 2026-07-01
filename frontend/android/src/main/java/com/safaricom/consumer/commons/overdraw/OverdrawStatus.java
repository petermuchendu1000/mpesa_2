package com.safaricom.consumer.commons.overdraw;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/safaricom/consumer/commons/overdraw/OverdrawStatus;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_ELIGIBLE", "ACTIVE", "INACTIVE", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OverdrawStatus {
    private static final EnumEntries $ENTRIES;
    private static final OverdrawStatus[] $VALUES;
    public static final OverdrawStatus NOT_ELIGIBLE = new OverdrawStatus("NOT_ELIGIBLE", 0);
    public static final OverdrawStatus ACTIVE = new OverdrawStatus("ACTIVE", 1);
    public static final OverdrawStatus INACTIVE = new OverdrawStatus("INACTIVE", 2);

    private OverdrawStatus(String str, int i) {
    }

    static {
        OverdrawStatus[] overdrawStatusArr$values = $values();
        $VALUES = overdrawStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(overdrawStatusArr$values);
    }

    public static OverdrawStatus valueOf(String str) {
        return (OverdrawStatus) Enum.valueOf(OverdrawStatus.class, str);
    }

    public static OverdrawStatus[] values() {
        return (OverdrawStatus[]) $VALUES.clone();
    }

    private static final OverdrawStatus[] $values() {
        return new OverdrawStatus[]{NOT_ELIGIBLE, ACTIVE, INACTIVE};
    }

    public static EnumEntries<OverdrawStatus> getEntries() {
        return $ENTRIES;
    }
}
