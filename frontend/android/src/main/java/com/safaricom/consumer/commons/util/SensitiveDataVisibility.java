package com.safaricom.consumer.commons.util;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/safaricom/consumer/commons/util/SensitiveDataVisibility;", "", "<init>", "(Ljava/lang/String;I)V", "VISIBLE", "HIDDEN", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SensitiveDataVisibility {
    private static final EnumEntries $ENTRIES;
    private static final SensitiveDataVisibility[] $VALUES;
    public static final SensitiveDataVisibility VISIBLE = new SensitiveDataVisibility("VISIBLE", 0);
    public static final SensitiveDataVisibility HIDDEN = new SensitiveDataVisibility("HIDDEN", 1);

    private SensitiveDataVisibility(String str, int i) {
    }

    static {
        SensitiveDataVisibility[] sensitiveDataVisibilityArr$values = $values();
        $VALUES = sensitiveDataVisibilityArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(sensitiveDataVisibilityArr$values);
    }

    public static SensitiveDataVisibility valueOf(String str) {
        return (SensitiveDataVisibility) Enum.valueOf(SensitiveDataVisibility.class, str);
    }

    public static SensitiveDataVisibility[] values() {
        return (SensitiveDataVisibility[]) $VALUES.clone();
    }

    private static final SensitiveDataVisibility[] $values() {
        return new SensitiveDataVisibility[]{VISIBLE, HIDDEN};
    }

    public static EnumEntries<SensitiveDataVisibility> getEntries() {
        return $ENTRIES;
    }
}
