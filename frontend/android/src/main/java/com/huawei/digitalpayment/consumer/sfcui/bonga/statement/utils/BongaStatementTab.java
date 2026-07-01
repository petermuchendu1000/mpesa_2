package com.huawei.digitalpayment.consumer.sfcui.bonga.statement.utils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/statement/utils/BongaStatementTab;", "", "<init>", "(Ljava/lang/String;I)V", "ACCUMULATION", "REDEMPTION", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaStatementTab {
    private static final EnumEntries $ENTRIES;
    private static final BongaStatementTab[] $VALUES;
    public static final BongaStatementTab ACCUMULATION = new BongaStatementTab("ACCUMULATION", 0);
    public static final BongaStatementTab REDEMPTION = new BongaStatementTab("REDEMPTION", 1);
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    private BongaStatementTab(String str, int i) {
    }

    static {
        BongaStatementTab[] bongaStatementTabArr$values = $values();
        $VALUES = bongaStatementTabArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(bongaStatementTabArr$values);
        int i = component3 + 5;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static BongaStatementTab valueOf(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return (BongaStatementTab) Enum.valueOf(BongaStatementTab.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static BongaStatementTab[] values() {
        BongaStatementTab[] bongaStatementTabArr;
        int i = 2 % 2;
        int i2 = copydefault + 111;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            bongaStatementTabArr = (BongaStatementTab[]) $VALUES.clone();
            int i3 = 79 / 0;
        } else {
            bongaStatementTabArr = (BongaStatementTab[]) $VALUES.clone();
        }
        int i4 = copydefault + 85;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return bongaStatementTabArr;
    }

    private static final BongaStatementTab[] $values() {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        BongaStatementTab bongaStatementTab = ACCUMULATION;
        if (i3 == 0) {
            return new BongaStatementTab[]{bongaStatementTab, REDEMPTION};
        }
        BongaStatementTab bongaStatementTab2 = REDEMPTION;
        BongaStatementTab[] bongaStatementTabArr = new BongaStatementTab[5];
        bongaStatementTabArr[1] = bongaStatementTab;
        bongaStatementTabArr[1] = bongaStatementTab2;
        return bongaStatementTabArr;
    }

    public static EnumEntries<BongaStatementTab> getEntries() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
