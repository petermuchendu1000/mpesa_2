package com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/viewmodel/BiometricsOperator;", "", "<init>", "(Ljava/lang/String;I)V", "OPEN_FINGERPRINT_LOGIN", "CLOSE_FINGERPRINT_LOGIN", "OPEN_FINGERPRINT_PAY", "CLOSE_FINGERPRINT_PAY", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BiometricsOperator {
    private static final EnumEntries $ENTRIES;
    private static final BiometricsOperator[] $VALUES;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;
    public static final BiometricsOperator OPEN_FINGERPRINT_LOGIN = new BiometricsOperator("OPEN_FINGERPRINT_LOGIN", 0);
    public static final BiometricsOperator CLOSE_FINGERPRINT_LOGIN = new BiometricsOperator("CLOSE_FINGERPRINT_LOGIN", 1);
    public static final BiometricsOperator OPEN_FINGERPRINT_PAY = new BiometricsOperator("OPEN_FINGERPRINT_PAY", 2);
    public static final BiometricsOperator CLOSE_FINGERPRINT_PAY = new BiometricsOperator("CLOSE_FINGERPRINT_PAY", 3);

    private BiometricsOperator(String str, int i) {
    }

    static {
        BiometricsOperator[] biometricsOperatorArr$values = $values();
        $VALUES = biometricsOperatorArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(biometricsOperatorArr$values);
        int i = component1 + 37;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static BiometricsOperator valueOf(String str) {
        BiometricsOperator biometricsOperator;
        int i = 2 % 2;
        int i2 = component3 + 79;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            biometricsOperator = (BiometricsOperator) Enum.valueOf(BiometricsOperator.class, str);
            int i3 = 68 / 0;
        } else {
            biometricsOperator = (BiometricsOperator) Enum.valueOf(BiometricsOperator.class, str);
        }
        int i4 = component3 + 93;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return biometricsOperator;
    }

    public static BiometricsOperator[] values() {
        int i = 2 % 2;
        int i2 = component3 + 115;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        BiometricsOperator[] biometricsOperatorArr = (BiometricsOperator[]) $VALUES.clone();
        int i3 = ShareDataUIState + 23;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return biometricsOperatorArr;
        }
        throw null;
    }

    private static final BiometricsOperator[] $values() {
        BiometricsOperator[] biometricsOperatorArr;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            BiometricsOperator biometricsOperator = OPEN_FINGERPRINT_LOGIN;
            BiometricsOperator biometricsOperator2 = CLOSE_FINGERPRINT_LOGIN;
            BiometricsOperator biometricsOperator3 = OPEN_FINGERPRINT_PAY;
            BiometricsOperator biometricsOperator4 = CLOSE_FINGERPRINT_PAY;
            biometricsOperatorArr = new BiometricsOperator[2];
            biometricsOperatorArr[0] = biometricsOperator;
            biometricsOperatorArr[0] = biometricsOperator2;
            biometricsOperatorArr[4] = biometricsOperator3;
            biometricsOperatorArr[5] = biometricsOperator4;
        } else {
            biometricsOperatorArr = new BiometricsOperator[]{OPEN_FINGERPRINT_LOGIN, CLOSE_FINGERPRINT_LOGIN, OPEN_FINGERPRINT_PAY, CLOSE_FINGERPRINT_PAY};
        }
        int i4 = i3 + 49;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return biometricsOperatorArr;
    }

    public static EnumEntries<BiometricsOperator> getEntries() {
        EnumEntries<BiometricsOperator> enumEntries;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 103;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            enumEntries = $ENTRIES;
            int i4 = 78 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i2 + 71;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
