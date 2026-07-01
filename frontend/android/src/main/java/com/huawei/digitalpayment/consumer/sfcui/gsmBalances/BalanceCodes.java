package com.huawei.digitalpayment.consumer.sfcui.gsmBalances;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/BalanceCodes;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "PREPAID_BALANCE", "ENTERPISE_BALANCE", "UNLIMITED_OFFER", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BalanceCodes {
    private static final EnumEntries $ENTRIES;
    private static final BalanceCodes[] $VALUES;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private final String type;
    public static final BalanceCodes PREPAID_BALANCE = new BalanceCodes("PREPAID_BALANCE", 0, "C_MAIN_ACCOUNT");
    public static final BalanceCodes ENTERPISE_BALANCE = new BalanceCodes("ENTERPISE_BALANCE", 1, "C_3003");
    public static final BalanceCodes UNLIMITED_OFFER = new BalanceCodes("UNLIMITED_OFFER", 2, "C_5799");

    private BalanceCodes(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.type;
        int i4 = i3 + 121;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    static {
        BalanceCodes[] balanceCodesArr$values = $values();
        $VALUES = balanceCodesArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(balanceCodesArr$values);
        int i = component1 + 67;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static BalanceCodes valueOf(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        BalanceCodes balanceCodes = (BalanceCodes) Enum.valueOf(BalanceCodes.class, str);
        int i4 = copydefault + 113;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return balanceCodes;
    }

    public static BalanceCodes[] values() {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        BalanceCodes[] balanceCodesArr = (BalanceCodes[]) $VALUES.clone();
        int i4 = ShareDataUIState + 121;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return balanceCodesArr;
    }

    private static final BalanceCodes[] $values() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 77;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        BalanceCodes[] balanceCodesArr = {PREPAID_BALANCE, ENTERPISE_BALANCE, UNLIMITED_OFFER};
        int i5 = i2 + 95;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
        return balanceCodesArr;
    }

    public static EnumEntries<BalanceCodes> getEntries() {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }
}
