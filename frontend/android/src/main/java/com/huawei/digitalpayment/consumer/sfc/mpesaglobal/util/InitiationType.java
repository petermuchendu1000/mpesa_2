package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util;

import com.iap.ac.android.region.cdp.model.CdpSpaceInfo;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/InitiationType;", "", "<init>", "(Ljava/lang/String;I)V", "MANUAL", "APP_LINK", CdpSpaceInfo.SPACE_TYPE_ANNOUNCEMENT, "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InitiationType {
    private static final EnumEntries $ENTRIES;
    private static final InitiationType[] $VALUES;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int copydefault;
    public static final InitiationType MANUAL = new InitiationType("MANUAL", 0);
    public static final InitiationType APP_LINK = new InitiationType("APP_LINK", 1);
    public static final InitiationType ANNOUNCEMENT = new InitiationType(CdpSpaceInfo.SPACE_TYPE_ANNOUNCEMENT, 2);

    private InitiationType(String str, int i) {
    }

    static {
        InitiationType[] initiationTypeArr$values = $values();
        $VALUES = initiationTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(initiationTypeArr$values);
        int i = component2 + 57;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 59 / 0;
        }
    }

    public static InitiationType valueOf(String str) {
        int i = 2 % 2;
        int i2 = component1 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        InitiationType initiationType = (InitiationType) Enum.valueOf(InitiationType.class, str);
        int i4 = component1 + 39;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return initiationType;
        }
        throw null;
    }

    public static InitiationType[] values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return (InitiationType[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final InitiationType[] $values() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 31;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        InitiationType[] initiationTypeArr = {MANUAL, APP_LINK, ANNOUNCEMENT};
        int i5 = i2 + 23;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return initiationTypeArr;
        }
        throw null;
    }

    public static EnumEntries<InitiationType> getEntries() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 93;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<InitiationType> enumEntries = $ENTRIES;
        int i5 = i2 + 45;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
