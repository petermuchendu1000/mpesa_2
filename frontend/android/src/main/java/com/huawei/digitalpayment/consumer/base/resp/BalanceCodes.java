package com.huawei.digitalpayment.consumer.base.resp;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/BalanceCodes;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "PREPAID_BALANCE", "ENTERPISE_BALANCE", "UNLIMITED_OFFER", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BalanceCodes {
    private static final EnumEntries $ENTRIES;
    private static final BalanceCodes[] $VALUES;
    private static int ShareDataUIState = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;
    private final String type;
    public static final BalanceCodes PREPAID_BALANCE = new BalanceCodes("PREPAID_BALANCE", 0, "C_MAIN_ACCOUNT");
    public static final BalanceCodes ENTERPISE_BALANCE = new BalanceCodes("ENTERPISE_BALANCE", 1, "C_3003");
    public static final BalanceCodes UNLIMITED_OFFER = new BalanceCodes("UNLIMITED_OFFER", 2, "C_5799");

    private BalanceCodes(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.type;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        BalanceCodes[] balanceCodesArr$values = $values();
        $VALUES = balanceCodesArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(balanceCodesArr$values);
        int i = component3 + 39;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static BalanceCodes valueOf(String str) {
        BalanceCodes balanceCodes;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            balanceCodes = (BalanceCodes) Enum.valueOf(BalanceCodes.class, str);
            int i3 = 45 / 0;
        } else {
            balanceCodes = (BalanceCodes) Enum.valueOf(BalanceCodes.class, str);
        }
        int i4 = copydefault + 91;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return balanceCodes;
    }

    public static BalanceCodes[] values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        BalanceCodes[] balanceCodesArr = (BalanceCodes[]) $VALUES.clone();
        int i4 = ShareDataUIState + 59;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return balanceCodesArr;
    }

    private static final BalanceCodes[] $values() {
        BalanceCodes[] balanceCodesArr;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 73;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            BalanceCodes balanceCodes = PREPAID_BALANCE;
            BalanceCodes balanceCodes2 = ENTERPISE_BALANCE;
            BalanceCodes balanceCodes3 = UNLIMITED_OFFER;
            balanceCodesArr = new BalanceCodes[5];
            balanceCodesArr[1] = balanceCodes;
            balanceCodesArr[0] = balanceCodes2;
            balanceCodesArr[2] = balanceCodes3;
        } else {
            balanceCodesArr = new BalanceCodes[]{PREPAID_BALANCE, ENTERPISE_BALANCE, UNLIMITED_OFFER};
        }
        int i4 = i2 + 47;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return balanceCodesArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<BalanceCodes> getEntries() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EnumEntries<BalanceCodes> enumEntries = $ENTRIES;
        int i4 = i3 + 121;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }
}
