package com.huawei.digitalpayment.consumer.fixeddata.ui.screen;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/screen/FamilyShareType;", "", "<init>", "(Ljava/lang/String;I)V", "DATA_ONLY", "MINUTES_ONLY", "BOTH", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FamilyShareType {
    private static final EnumEntries $ENTRIES;
    private static final FamilyShareType[] $VALUES;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;
    public static final FamilyShareType DATA_ONLY = new FamilyShareType("DATA_ONLY", 0);
    public static final FamilyShareType MINUTES_ONLY = new FamilyShareType("MINUTES_ONLY", 1);
    public static final FamilyShareType BOTH = new FamilyShareType("BOTH", 2);

    private FamilyShareType(String str, int i) {
    }

    static {
        FamilyShareType[] familyShareTypeArr$values = $values();
        $VALUES = familyShareTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(familyShareTypeArr$values);
        int i = component1 + 19;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static FamilyShareType valueOf(String str) {
        int i = 2 % 2;
        int i2 = component3 + 85;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        FamilyShareType familyShareType = (FamilyShareType) Enum.valueOf(FamilyShareType.class, str);
        int i3 = component3 + 109;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return familyShareType;
    }

    public static FamilyShareType[] values() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FamilyShareType[] familyShareTypeArr = (FamilyShareType[]) $VALUES.clone();
        int i4 = component3 + 61;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return familyShareTypeArr;
    }

    private static final FamilyShareType[] $values() {
        FamilyShareType[] familyShareTypeArr;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 13;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            FamilyShareType familyShareType = DATA_ONLY;
            FamilyShareType familyShareType2 = MINUTES_ONLY;
            FamilyShareType familyShareType3 = BOTH;
            familyShareTypeArr = new FamilyShareType[3];
            familyShareTypeArr[0] = familyShareType;
            familyShareTypeArr[0] = familyShareType2;
            familyShareTypeArr[4] = familyShareType3;
        } else {
            familyShareTypeArr = new FamilyShareType[]{DATA_ONLY, MINUTES_ONLY, BOTH};
        }
        int i4 = i2 + 49;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return familyShareTypeArr;
    }

    public static EnumEntries<FamilyShareType> getEntries() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        EnumEntries<FamilyShareType> enumEntries = $ENTRIES;
        int i5 = i3 + 39;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
