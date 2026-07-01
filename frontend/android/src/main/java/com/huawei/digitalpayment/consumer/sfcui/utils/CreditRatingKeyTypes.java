package com.huawei.digitalpayment.consumer.sfcui.utils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/utils/CreditRatingKeyTypes;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CREDIT_LIMIT", "OKOA_PRODUCT", "MSISDN", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreditRatingKeyTypes {
    private static final EnumEntries $ENTRIES;
    private static final CreditRatingKeyTypes[] $VALUES;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private final String value;
    public static final CreditRatingKeyTypes CREDIT_LIMIT = new CreditRatingKeyTypes("CREDIT_LIMIT", 0, "CreditLimit");
    public static final CreditRatingKeyTypes OKOA_PRODUCT = new CreditRatingKeyTypes("OKOA_PRODUCT", 1, "OkoaProduct");
    public static final CreditRatingKeyTypes MSISDN = new CreditRatingKeyTypes("MSISDN", 2, "MSISDN");

    private CreditRatingKeyTypes(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 69;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 75;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        CreditRatingKeyTypes[] creditRatingKeyTypesArr$values = $values();
        $VALUES = creditRatingKeyTypesArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(creditRatingKeyTypesArr$values);
        int i = component1 + 85;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static CreditRatingKeyTypes valueOf(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return (CreditRatingKeyTypes) Enum.valueOf(CreditRatingKeyTypes.class, str);
        }
        throw null;
    }

    public static CreditRatingKeyTypes[] values() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return (CreditRatingKeyTypes[]) $VALUES.clone();
        }
        int i3 = 91 / 0;
        return (CreditRatingKeyTypes[]) $VALUES.clone();
    }

    private static final CreditRatingKeyTypes[] $values() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return new CreditRatingKeyTypes[]{CREDIT_LIMIT, OKOA_PRODUCT, MSISDN};
        }
        CreditRatingKeyTypes creditRatingKeyTypes = CREDIT_LIMIT;
        CreditRatingKeyTypes creditRatingKeyTypes2 = OKOA_PRODUCT;
        CreditRatingKeyTypes creditRatingKeyTypes3 = MSISDN;
        CreditRatingKeyTypes[] creditRatingKeyTypesArr = new CreditRatingKeyTypes[2];
        creditRatingKeyTypesArr[1] = creditRatingKeyTypes;
        creditRatingKeyTypesArr[1] = creditRatingKeyTypes2;
        creditRatingKeyTypesArr[4] = creditRatingKeyTypes3;
        return creditRatingKeyTypesArr;
    }

    public static EnumEntries<CreditRatingKeyTypes> getEntries() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        EnumEntries<CreditRatingKeyTypes> enumEntries = $ENTRIES;
        int i4 = i3 + 83;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return enumEntries;
        }
        throw null;
    }
}
