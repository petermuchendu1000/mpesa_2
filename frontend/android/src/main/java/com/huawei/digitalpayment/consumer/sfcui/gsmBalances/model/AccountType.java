package com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/AccountType;", "", "alternativeAccountTypeName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAlternativeAccountTypeName", "()Ljava/lang/String;", "UNDEFINED", "PRE_PAID", "POST_PAID", "HYBRID", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountType {
    private static final EnumEntries $ENTRIES;
    private static final AccountType[] $VALUES;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;
    private final String alternativeAccountTypeName;
    public static final AccountType UNDEFINED = new AccountType("UNDEFINED", 0, "UNDEFINED");

    @SerializedName("PREPAID")
    public static final AccountType PRE_PAID = new AccountType("PRE_PAID", 1, "PREPAID");

    @SerializedName("POSTPAID")
    public static final AccountType POST_PAID = new AccountType("POST_PAID", 2, "POSTPAID");

    @SerializedName("HYBRID")
    public static final AccountType HYBRID = new AccountType("HYBRID", 3, "HYBRID");

    private AccountType(String str, int i, String str2) {
        this.alternativeAccountTypeName = str2;
    }

    public final String getAlternativeAccountTypeName() {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.alternativeAccountTypeName;
        }
        throw null;
    }

    static {
        AccountType[] accountTypeArr$values = $values();
        $VALUES = accountTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(accountTypeArr$values);
        int i = component3 + 37;
        component2 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static AccountType valueOf(String str) {
        int i = 2 % 2;
        int i2 = component1 + 103;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return (AccountType) Enum.valueOf(AccountType.class, str);
        }
        throw null;
    }

    public static AccountType[] values() {
        AccountType[] accountTypeArr;
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            accountTypeArr = (AccountType[]) $VALUES.clone();
            int i3 = 72 / 0;
        } else {
            accountTypeArr = (AccountType[]) $VALUES.clone();
        }
        int i4 = component1 + 119;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return accountTypeArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final AccountType[] $values() {
        AccountType[] accountTypeArr;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 97;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            AccountType accountType = UNDEFINED;
            AccountType accountType2 = PRE_PAID;
            AccountType accountType3 = POST_PAID;
            AccountType accountType4 = HYBRID;
            accountTypeArr = new AccountType[5];
            accountTypeArr[0] = accountType;
            accountTypeArr[0] = accountType2;
            accountTypeArr[2] = accountType3;
            accountTypeArr[4] = accountType4;
        } else {
            accountTypeArr = new AccountType[]{UNDEFINED, PRE_PAID, POST_PAID, HYBRID};
        }
        int i4 = i2 + 105;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return accountTypeArr;
    }

    public static EnumEntries<AccountType> getEntries() {
        EnumEntries<AccountType> enumEntries;
        int i = 2 % 2;
        int i2 = copydefault + 27;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            enumEntries = $ENTRIES;
            int i4 = 42 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i3 + 89;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
