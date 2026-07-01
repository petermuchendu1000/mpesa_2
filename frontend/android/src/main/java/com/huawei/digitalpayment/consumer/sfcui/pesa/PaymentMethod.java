package com.huawei.digitalpayment.consumer.sfcui.pesa;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/PaymentMethod;", "", "<init>", "(Ljava/lang/String;I)V", "MPESA", "BONGA", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PaymentMethod {
    private static final EnumEntries $ENTRIES;
    private static final PaymentMethod[] $VALUES;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    public static final PaymentMethod MPESA = new PaymentMethod("MPESA", 0);
    public static final PaymentMethod BONGA = new PaymentMethod("BONGA", 1);

    private PaymentMethod(String str, int i) {
    }

    static {
        PaymentMethod[] paymentMethodArr$values = $values();
        $VALUES = paymentMethodArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(paymentMethodArr$values);
        int i = ShareDataUIState + 115;
        component3 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static PaymentMethod valueOf(String str) {
        int i = 2 % 2;
        int i2 = component2 + 23;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        PaymentMethod paymentMethod = (PaymentMethod) Enum.valueOf(PaymentMethod.class, str);
        int i3 = component1 + 81;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return paymentMethod;
        }
        throw null;
    }

    public static PaymentMethod[] values() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return (PaymentMethod[]) $VALUES.clone();
        }
        throw null;
    }

    private static final PaymentMethod[] $values() {
        PaymentMethod[] paymentMethodArr;
        int i = 2 % 2;
        int i2 = component2 + 125;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            PaymentMethod paymentMethod = MPESA;
            PaymentMethod paymentMethod2 = BONGA;
            paymentMethodArr = new PaymentMethod[2];
            paymentMethodArr[1] = paymentMethod;
            paymentMethodArr[1] = paymentMethod2;
        } else {
            paymentMethodArr = new PaymentMethod[]{MPESA, BONGA};
        }
        int i4 = i3 + 25;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return paymentMethodArr;
    }

    public static EnumEntries<PaymentMethod> getEntries() {
        int i = 2 % 2;
        int i2 = component1 + 49;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        EnumEntries<PaymentMethod> enumEntries = $ENTRIES;
        int i4 = i3 + 125;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return enumEntries;
        }
        obj.hashCode();
        throw null;
    }
}
