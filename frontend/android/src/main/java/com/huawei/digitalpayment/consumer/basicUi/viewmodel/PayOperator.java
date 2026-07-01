package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import com.alibaba.griver.base.common.utils.NetworkUtils;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basicUi/viewmodel/PayOperator;", "", "<init>", "(Ljava/lang/String;I)V", NetworkUtils.NETWORK_TYPE_NONE, "FACE_ID", "FINGERPRINT", "ConsumerBasicUiModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PayOperator {
    private static final EnumEntries $ENTRIES;
    private static final PayOperator[] $VALUES;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;
    public static final PayOperator NONE = new PayOperator(NetworkUtils.NETWORK_TYPE_NONE, 0);
    public static final PayOperator FACE_ID = new PayOperator("FACE_ID", 1);
    public static final PayOperator FINGERPRINT = new PayOperator("FINGERPRINT", 2);

    private PayOperator(String str, int i) {
    }

    static {
        PayOperator[] payOperatorArr$values = $values();
        $VALUES = payOperatorArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(payOperatorArr$values);
        int i = component1 + 87;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static PayOperator valueOf(String str) {
        int i = 2 % 2;
        int i2 = component2 + 123;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return (PayOperator) Enum.valueOf(PayOperator.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static PayOperator[] values() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return (PayOperator[]) $VALUES.clone();
        }
        int i3 = 86 / 0;
        return (PayOperator[]) $VALUES.clone();
    }

    private static final PayOperator[] $values() {
        int i = 2 % 2;
        int i2 = component3 + 81;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        PayOperator[] payOperatorArr = {NONE, FACE_ID, FINGERPRINT};
        int i5 = i3 + 53;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return payOperatorArr;
    }

    public static EnumEntries<PayOperator> getEntries() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        EnumEntries<PayOperator> enumEntries = $ENTRIES;
        int i5 = i3 + 115;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 64 / 0;
        }
        return enumEntries;
    }
}
