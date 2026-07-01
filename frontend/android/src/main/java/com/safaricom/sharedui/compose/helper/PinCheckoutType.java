package com.safaricom.sharedui.compose.helper;

import com.alibaba.griver.base.common.utils.NetworkUtils;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/safaricom/sharedui/compose/helper/PinCheckoutType;", "", "<init>", "(Ljava/lang/String;I)V", "POA", "STK", NetworkUtils.NETWORK_TYPE_NONE, "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PinCheckoutType {
    private static final EnumEntries $ENTRIES;
    private static final PinCheckoutType[] $VALUES;
    public static final PinCheckoutType POA = new PinCheckoutType("POA", 0);
    public static final PinCheckoutType STK = new PinCheckoutType("STK", 1);
    public static final PinCheckoutType NONE = new PinCheckoutType(NetworkUtils.NETWORK_TYPE_NONE, 2);

    private PinCheckoutType(String str, int i) {
    }

    static {
        PinCheckoutType[] pinCheckoutTypeArr$values = $values();
        $VALUES = pinCheckoutTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(pinCheckoutTypeArr$values);
    }

    public static PinCheckoutType valueOf(String str) {
        return (PinCheckoutType) Enum.valueOf(PinCheckoutType.class, str);
    }

    public static PinCheckoutType[] values() {
        return (PinCheckoutType[]) $VALUES.clone();
    }

    private static final PinCheckoutType[] $values() {
        return new PinCheckoutType[]{POA, STK, NONE};
    }

    public static EnumEntries<PinCheckoutType> getEntries() {
        return $ENTRIES;
    }
}
