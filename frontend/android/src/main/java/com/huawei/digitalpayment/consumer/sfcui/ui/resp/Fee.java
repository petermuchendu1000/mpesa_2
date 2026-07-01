package com.huawei.digitalpayment.consumer.sfcui.ui.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/Fee;", "", "Amount", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/Amount;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/Amount;)V", "getAmount", "()Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/Amount;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Fee {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private final Amount component2;

    public Fee(Amount amount) {
        Intrinsics.checkNotNullParameter(amount, "");
        this.component2 = amount;
    }

    public final Amount getAmount() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 125;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Amount amount = this.component2;
        int i4 = i2 + 113;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return amount;
    }

    static {
        int i = 1 + 125;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static Fee copy$default(Fee fee, Amount amount, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 91;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 99;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            amount = fee.component2;
            if (i7 != 0) {
                int i8 = 40 / 0;
            }
        }
        return fee.copy(amount);
    }

    public final Amount component1() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Amount amount = this.component2;
        int i4 = i3 + 105;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return amount;
        }
        throw null;
    }

    public final Fee copy(Amount Amount) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(Amount, "");
        Fee fee = new Fee(Amount);
        int i2 = component3 + 103;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return fee;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 45;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof Fee)) {
            int i4 = i2 + 105;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.component2, ((Fee) other).component2)) {
            return true;
        }
        int i6 = component3 + 87;
        component1 = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.component2.hashCode();
        int i4 = component3 + 39;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Fee(Amount=" + this.component2 + ")";
        int i2 = component1 + 113;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
