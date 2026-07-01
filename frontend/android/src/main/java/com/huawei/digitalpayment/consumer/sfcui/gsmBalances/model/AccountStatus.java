package com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/AccountStatus;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "DELETED", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountStatus {
    private static final EnumEntries $ENTRIES;
    private static final AccountStatus[] $VALUES;

    @SerializedName("active")
    public static final AccountStatus ACTIVE = new AccountStatus("ACTIVE", 0);
    public static final AccountStatus DELETED = new AccountStatus("DELETED", 1);
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int copydefault;

    private AccountStatus(String str, int i) {
    }

    static {
        AccountStatus[] accountStatusArr$values = $values();
        $VALUES = accountStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(accountStatusArr$values);
        int i = component1 + 83;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 67 / 0;
        }
    }

    public static AccountStatus valueOf(String str) {
        int i = 2 % 2;
        int i2 = component2 + 31;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return (AccountStatus) Enum.valueOf(AccountStatus.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AccountStatus[] values() {
        int i = 2 % 2;
        int i2 = component2 + 29;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AccountStatus[] accountStatusArr = (AccountStatus[]) $VALUES.clone();
        int i3 = ShareDataUIState + 87;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 29 / 0;
        }
        return accountStatusArr;
    }

    private static final AccountStatus[] $values() {
        AccountStatus[] accountStatusArr;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 49;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            AccountStatus accountStatus = ACTIVE;
            AccountStatus accountStatus2 = DELETED;
            accountStatusArr = new AccountStatus[4];
            accountStatusArr[1] = accountStatus;
            accountStatusArr[0] = accountStatus2;
        } else {
            accountStatusArr = new AccountStatus[]{ACTIVE, DELETED};
        }
        int i4 = i2 + 81;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return accountStatusArr;
    }

    public static EnumEntries<AccountStatus> getEntries() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        EnumEntries<AccountStatus> enumEntries = $ENTRIES;
        int i5 = i3 + 19;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
