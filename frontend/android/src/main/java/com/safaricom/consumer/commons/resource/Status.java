package com.safaricom.consumer.commons.resource;

import com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/safaricom/consumer/commons/resource/Status;", "", "<init>", "(Ljava/lang/String;I)V", MonitorResult.SUCCESS, "ERROR", "LOADING", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Status {
    private static final EnumEntries $ENTRIES;
    private static final Status[] $VALUES;
    public static final Status SUCCESS = new Status(MonitorResult.SUCCESS, 0);
    public static final Status ERROR = new Status("ERROR", 1);
    public static final Status LOADING = new Status("LOADING", 2);

    private Status(String str, int i) {
    }

    static {
        Status[] statusArr$values = $values();
        $VALUES = statusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(statusArr$values);
    }

    public static Status valueOf(String str) {
        return (Status) Enum.valueOf(Status.class, str);
    }

    public static Status[] values() {
        return (Status[]) $VALUES.clone();
    }

    private static final Status[] $values() {
        return new Status[]{SUCCESS, ERROR, LOADING};
    }

    public static EnumEntries<Status> getEntries() {
        return $ENTRIES;
    }
}
