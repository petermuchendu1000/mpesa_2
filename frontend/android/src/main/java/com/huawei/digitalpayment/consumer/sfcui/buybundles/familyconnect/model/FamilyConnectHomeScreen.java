package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/FamilyConnectHomeScreen;", "", "<init>", "(Ljava/lang/String;I)V", "BENEFICIARIES", "BUNDLES", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FamilyConnectHomeScreen {
    private static final EnumEntries $ENTRIES;
    private static final FamilyConnectHomeScreen[] $VALUES;
    public static final FamilyConnectHomeScreen BENEFICIARIES = new FamilyConnectHomeScreen("BENEFICIARIES", 0);
    public static final FamilyConnectHomeScreen BUNDLES = new FamilyConnectHomeScreen("BUNDLES", 1);
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    private FamilyConnectHomeScreen(String str, int i) {
    }

    static {
        FamilyConnectHomeScreen[] familyConnectHomeScreenArr$values = $values();
        $VALUES = familyConnectHomeScreenArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(familyConnectHomeScreenArr$values);
        int i = copydefault + 77;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static FamilyConnectHomeScreen valueOf(String str) {
        FamilyConnectHomeScreen familyConnectHomeScreen;
        int i = 2 % 2;
        int i2 = component2 + 91;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            familyConnectHomeScreen = (FamilyConnectHomeScreen) Enum.valueOf(FamilyConnectHomeScreen.class, str);
            int i3 = 3 / 0;
        } else {
            familyConnectHomeScreen = (FamilyConnectHomeScreen) Enum.valueOf(FamilyConnectHomeScreen.class, str);
        }
        int i4 = component2 + 77;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return familyConnectHomeScreen;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FamilyConnectHomeScreen[] values() {
        int i = 2 % 2;
        int i2 = component2 + 63;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        FamilyConnectHomeScreen[] familyConnectHomeScreenArr = (FamilyConnectHomeScreen[]) $VALUES.clone();
        int i3 = component3 + 27;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            return familyConnectHomeScreenArr;
        }
        throw null;
    }

    private static final FamilyConnectHomeScreen[] $values() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FamilyConnectHomeScreen familyConnectHomeScreen = BENEFICIARIES;
        if (i3 == 0) {
            return new FamilyConnectHomeScreen[]{familyConnectHomeScreen, BUNDLES};
        }
        FamilyConnectHomeScreen familyConnectHomeScreen2 = BUNDLES;
        FamilyConnectHomeScreen[] familyConnectHomeScreenArr = new FamilyConnectHomeScreen[4];
        familyConnectHomeScreenArr[1] = familyConnectHomeScreen;
        familyConnectHomeScreenArr[1] = familyConnectHomeScreen2;
        return familyConnectHomeScreenArr;
    }

    public static EnumEntries<FamilyConnectHomeScreen> getEntries() {
        EnumEntries<FamilyConnectHomeScreen> enumEntries;
        int i = 2 % 2;
        int i2 = component2 + 71;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            enumEntries = $ENTRIES;
            int i4 = 78 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i3 + 93;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
        return enumEntries;
    }
}
