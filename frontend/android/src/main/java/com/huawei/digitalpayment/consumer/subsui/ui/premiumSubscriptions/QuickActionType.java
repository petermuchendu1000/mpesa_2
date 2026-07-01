package com.huawei.digitalpayment.consumer.subsui.ui.premiumSubscriptions;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/subsui/ui/premiumSubscriptions/QuickActionType;", "", "<init>", "(Ljava/lang/String;I)V", "PROMO_MESSAGES", "SKIZA_TUNES", "ConsumerSfcMySubscriptionsUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickActionType {
    private static final EnumEntries $ENTRIES;
    private static final QuickActionType[] $VALUES;
    public static final QuickActionType PROMO_MESSAGES = new QuickActionType("PROMO_MESSAGES", 0);
    public static final QuickActionType SKIZA_TUNES = new QuickActionType("SKIZA_TUNES", 1);
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    private QuickActionType(String str, int i) {
    }

    static {
        QuickActionType[] quickActionTypeArr$values = $values();
        $VALUES = quickActionTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(quickActionTypeArr$values);
        int i = component2 + 115;
        component1 = i % 128;
        if (i % 2 == 0) {
            int i2 = 54 / 0;
        }
    }

    public static QuickActionType valueOf(String str) {
        int i = 2 % 2;
        int i2 = component3 + 59;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        QuickActionType quickActionType = (QuickActionType) Enum.valueOf(QuickActionType.class, str);
        int i4 = component3 + 111;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return quickActionType;
    }

    public static QuickActionType[] values() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        QuickActionType[] quickActionTypeArr = (QuickActionType[]) $VALUES.clone();
        int i4 = copydefault + 111;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return quickActionTypeArr;
        }
        throw null;
    }

    private static final QuickActionType[] $values() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return new QuickActionType[]{PROMO_MESSAGES, SKIZA_TUNES};
        }
        QuickActionType quickActionType = PROMO_MESSAGES;
        QuickActionType quickActionType2 = SKIZA_TUNES;
        QuickActionType[] quickActionTypeArr = new QuickActionType[2];
        quickActionTypeArr[0] = quickActionType;
        quickActionTypeArr[0] = quickActionType2;
        return quickActionTypeArr;
    }

    public static EnumEntries<QuickActionType> getEntries() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        EnumEntries<QuickActionType> enumEntries = $ENTRIES;
        int i4 = i3 + 63;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }
}
