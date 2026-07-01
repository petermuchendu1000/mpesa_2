package com.huawei.digitalpayment.consumer.sfcui.costcalculator;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorTab;", "", "<init>", "(Ljava/lang/String;I)V", "SEND_WITHDRAW", "LIPA_NA_MPESA", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CostCalculatorTab {
    private static final EnumEntries $ENTRIES;
    private static final CostCalculatorTab[] $VALUES;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;
    public static final CostCalculatorTab SEND_WITHDRAW = new CostCalculatorTab("SEND_WITHDRAW", 0);
    public static final CostCalculatorTab LIPA_NA_MPESA = new CostCalculatorTab("LIPA_NA_MPESA", 1);

    private CostCalculatorTab(String str, int i) {
    }

    static {
        CostCalculatorTab[] costCalculatorTabArr$values = $values();
        $VALUES = costCalculatorTabArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(costCalculatorTabArr$values);
        int i = ShareDataUIState + 73;
        component2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 43 / 0;
        }
    }

    public static CostCalculatorTab valueOf(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        CostCalculatorTab costCalculatorTab = (CostCalculatorTab) Enum.valueOf(CostCalculatorTab.class, str);
        int i4 = copydefault + 69;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return costCalculatorTab;
    }

    public static CostCalculatorTab[] values() {
        int i = 2 % 2;
        int i2 = component1 + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        CostCalculatorTab[] costCalculatorTabArr = (CostCalculatorTab[]) $VALUES.clone();
        int i4 = component1 + 51;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return costCalculatorTabArr;
    }

    private static final CostCalculatorTab[] $values() {
        int i = 2 % 2;
        int i2 = component1 + 105;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        CostCalculatorTab[] costCalculatorTabArr = {SEND_WITHDRAW, LIPA_NA_MPESA};
        int i5 = i3 + 31;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return costCalculatorTabArr;
    }

    public static EnumEntries<CostCalculatorTab> getEntries() {
        int i = 2 % 2;
        int i2 = component1 + 43;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        EnumEntries<CostCalculatorTab> enumEntries = $ENTRIES;
        int i5 = i3 + 99;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
