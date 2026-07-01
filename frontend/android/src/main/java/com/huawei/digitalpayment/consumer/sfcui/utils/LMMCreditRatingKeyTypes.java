package com.huawei.digitalpayment.consumer.sfcui.utils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/utils/LMMCreditRatingKeyTypes;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CREDIT_LIMIT", "OKOA_PRODUCT", "MSISDN", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LMMCreditRatingKeyTypes {
    private static final EnumEntries $ENTRIES;
    private static final LMMCreditRatingKeyTypes[] $VALUES;
    private static int ShareDataUIState = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;
    private final String value;
    public static final LMMCreditRatingKeyTypes CREDIT_LIMIT = new LMMCreditRatingKeyTypes("CREDIT_LIMIT", 0, "CreditLimit");
    public static final LMMCreditRatingKeyTypes OKOA_PRODUCT = new LMMCreditRatingKeyTypes("OKOA_PRODUCT", 1, "OkoaProduct");
    public static final LMMCreditRatingKeyTypes MSISDN = new LMMCreditRatingKeyTypes("MSISDN", 2, "MSISDN");

    private LMMCreditRatingKeyTypes(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 43;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 33;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        LMMCreditRatingKeyTypes[] lMMCreditRatingKeyTypesArr$values = $values();
        $VALUES = lMMCreditRatingKeyTypesArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(lMMCreditRatingKeyTypesArr$values);
        int i = component3 + 17;
        component2 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static LMMCreditRatingKeyTypes valueOf(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        LMMCreditRatingKeyTypes lMMCreditRatingKeyTypes = (LMMCreditRatingKeyTypes) Enum.valueOf(LMMCreditRatingKeyTypes.class, str);
        int i3 = ShareDataUIState + 111;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 45 / 0;
        }
        return lMMCreditRatingKeyTypes;
    }

    public static LMMCreditRatingKeyTypes[] values() {
        LMMCreditRatingKeyTypes[] lMMCreditRatingKeyTypesArr;
        int i = 2 % 2;
        int i2 = copydefault + 37;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            lMMCreditRatingKeyTypesArr = (LMMCreditRatingKeyTypes[]) $VALUES.clone();
            int i3 = 43 / 0;
        } else {
            lMMCreditRatingKeyTypesArr = (LMMCreditRatingKeyTypes[]) $VALUES.clone();
        }
        int i4 = ShareDataUIState + 21;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return lMMCreditRatingKeyTypesArr;
    }

    private static final LMMCreditRatingKeyTypes[] $values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return new LMMCreditRatingKeyTypes[]{CREDIT_LIMIT, OKOA_PRODUCT, MSISDN};
        }
        LMMCreditRatingKeyTypes lMMCreditRatingKeyTypes = CREDIT_LIMIT;
        LMMCreditRatingKeyTypes lMMCreditRatingKeyTypes2 = OKOA_PRODUCT;
        LMMCreditRatingKeyTypes lMMCreditRatingKeyTypes3 = MSISDN;
        LMMCreditRatingKeyTypes[] lMMCreditRatingKeyTypesArr = new LMMCreditRatingKeyTypes[2];
        lMMCreditRatingKeyTypesArr[1] = lMMCreditRatingKeyTypes;
        lMMCreditRatingKeyTypesArr[1] = lMMCreditRatingKeyTypes2;
        lMMCreditRatingKeyTypesArr[2] = lMMCreditRatingKeyTypes3;
        return lMMCreditRatingKeyTypesArr;
    }

    public static EnumEntries<LMMCreditRatingKeyTypes> getEntries() {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
