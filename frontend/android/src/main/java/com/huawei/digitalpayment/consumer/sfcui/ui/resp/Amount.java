package com.huawei.digitalpayment.consumer.sfcui.ui.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0003H×\u0001J\t\u0010\u0016\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/Amount;", "", "BasicAmount", "", "CurrencyCode", "", "MinimumAmount", "<init>", "(ILjava/lang/String;I)V", "getBasicAmount", "()I", "getCurrencyCode", "()Ljava/lang/String;", "getMinimumAmount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Amount {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component3 = 25 % 128;
    private static int component4 = 1;
    private static int getAsAtTimestamp;
    private final int component1;
    private final int component2;
    private final String copydefault;

    public Amount(int i, String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.component1 = i;
        this.copydefault = str;
        this.component2 = i2;
    }

    public final int getBasicAmount() {
        int i = 2 % 2;
        int i2 = component4 + 3;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.component1;
        if (i3 != 0) {
            int i5 = 5 / 0;
        }
        return i4;
    }

    public final String getCurrencyCode() {
        String str;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 41;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.copydefault;
            int i4 = 76 / 0;
        } else {
            str = this.copydefault;
        }
        int i5 = i2 + 85;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getMinimumAmount() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 73;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component2;
        int i6 = i2 + 63;
        component4 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        if (25 % 2 == 0) {
            int i = 87 / 0;
        }
    }

    public static Amount copy$default(Amount amount, int i, String str, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        if ((i3 & 1) != 0) {
            int i5 = getAsAtTimestamp + 95;
            component4 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = amount.component1;
                throw null;
            }
            i = amount.component1;
        }
        if ((i3 & 2) != 0) {
            str = amount.copydefault;
        }
        if ((i3 & 4) != 0) {
            int i7 = component4 + 11;
            getAsAtTimestamp = i7 % 128;
            int i8 = i7 % 2;
            i2 = amount.component2;
        }
        return amount.copy(i, str, i2);
    }

    public final int component1() {
        int i;
        int i2 = 2 % 2;
        int i3 = component4 + 23;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        if (i3 % 2 != 0) {
            i = this.component1;
            int i5 = 5 / 0;
        } else {
            i = this.component1;
        }
        int i6 = i4 + 63;
        component4 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 76 / 0;
        }
        return i;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component4 + 95;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 63;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.component2;
        int i5 = i2 + 45;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
        return i4;
    }

    public final Amount copy(int BasicAmount, String CurrencyCode, int MinimumAmount) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(CurrencyCode, "");
        Amount amount = new Amount(BasicAmount, CurrencyCode, MinimumAmount);
        int i2 = component4 + 39;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return amount;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component4 + 61;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof Amount)) {
            return false;
        }
        Amount amount = (Amount) other;
        if (this.component1 != amount.component1) {
            return false;
        }
        if (!Intrinsics.areEqual(this.copydefault, amount.copydefault)) {
            int i4 = component4 + 77;
            getAsAtTimestamp = i4 % 128;
            return i4 % 2 != 0;
        }
        if (this.component2 == amount.component2) {
            return true;
        }
        int i5 = getAsAtTimestamp + 99;
        component4 = i5 % 128;
        return i5 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 117;
        component4 = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((Integer.hashCode(this.component1) - 88) >> this.copydefault.hashCode()) >> 55) >> Integer.hashCode(this.component2) : (((Integer.hashCode(this.component1) * 31) + this.copydefault.hashCode()) * 31) + Integer.hashCode(this.component2);
        int i3 = getAsAtTimestamp + 57;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Amount(BasicAmount=" + this.component1 + ", CurrencyCode=" + this.copydefault + ", MinimumAmount=" + this.component2 + ")";
        int i2 = component4 + 111;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
