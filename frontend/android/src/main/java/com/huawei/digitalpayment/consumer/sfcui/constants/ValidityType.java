package com.huawei.digitalpayment.consumer.sfcui.constants;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/constants/ValidityType;", "", "<init>", "(Ljava/lang/String;I)V", "EXPIRY", "NO_EXPIRY", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidityType {
    private static final EnumEntries $ENTRIES;
    private static final ValidityType[] $VALUES;
    public static final ValidityType EXPIRY = new ValidityType("EXPIRY", 0);
    public static final ValidityType NO_EXPIRY = new ValidityType("NO_EXPIRY", 1);
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    private ValidityType(String str, int i) {
    }

    static {
        ValidityType[] validityTypeArr$values = $values();
        $VALUES = validityTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(validityTypeArr$values);
        int i = component1 + 103;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static ValidityType valueOf(String str) {
        int i = 2 % 2;
        int i2 = component3 + 83;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return (ValidityType) Enum.valueOf(ValidityType.class, str);
        }
        int i3 = 87 / 0;
        return (ValidityType) Enum.valueOf(ValidityType.class, str);
    }

    public static ValidityType[] values() {
        ValidityType[] validityTypeArr;
        int i = 2 % 2;
        int i2 = component2 + 25;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            validityTypeArr = (ValidityType[]) $VALUES.clone();
            int i3 = 24 / 0;
        } else {
            validityTypeArr = (ValidityType[]) $VALUES.clone();
        }
        int i4 = component3 + 103;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return validityTypeArr;
    }

    private static final ValidityType[] $values() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 13;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        ValidityType[] validityTypeArr = {EXPIRY, NO_EXPIRY};
        int i5 = i2 + 117;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return validityTypeArr;
    }

    public static EnumEntries<ValidityType> getEntries() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 113;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<ValidityType> enumEntries = $ENTRIES;
        int i5 = i2 + 101;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
