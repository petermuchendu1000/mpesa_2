package com.huawei.digitalpayment.consumer.sfcui.ui.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/TopUpAmountResp;", "", "amount", "", "selected", "", "<init>", "(Ljava/lang/String;Z)V", "getAmount", "()Ljava/lang/String;", "getSelected", "()Z", "setSelected", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TopUpAmountResp {
    public static final int $stable = 8;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copy = 1;
    private static int copydefault;
    private boolean ShareDataUIState;
    private final String component1;

    public TopUpAmountResp(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.component1 = str;
        this.ShareDataUIState = z;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component1;
        int i4 = i3 + 21;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean getSelected() {
        int i = 2 % 2;
        int i2 = component2 + 35;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i3 + 81;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final void setSelected(boolean z) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 31;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.ShareDataUIState = z;
        int i5 = i2 + 81;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 101;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static TopUpAmountResp copy$default(TopUpAmountResp topUpAmountResp, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 57;
        copy = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            str = topUpAmountResp.component1;
            int i5 = i3 + 53;
            copy = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            z = topUpAmountResp.ShareDataUIState;
        }
        TopUpAmountResp topUpAmountRespCopy = topUpAmountResp.copy(str, z);
        int i7 = copy + 15;
        component2 = i7 % 128;
        int i8 = i7 % 2;
        return topUpAmountRespCopy;
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 93;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            str = this.component1;
            int i4 = 27 / 0;
        } else {
            str = this.component1;
        }
        int i5 = i3 + 51;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return str;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 73;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.ShareDataUIState;
        int i4 = i2 + 99;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final TopUpAmountResp copy(String amount, boolean selected) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(amount, "");
        TopUpAmountResp topUpAmountResp = new TopUpAmountResp(amount, selected);
        int i2 = copy + 119;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return topUpAmountResp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 13;
            int i3 = i2 % 128;
            copy = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 83;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 35 / 0;
            }
            return true;
        }
        if (!(other instanceof TopUpAmountResp)) {
            return false;
        }
        TopUpAmountResp topUpAmountResp = (TopUpAmountResp) other;
        if (!Intrinsics.areEqual(this.component1, topUpAmountResp.component1)) {
            int i7 = component2 + 51;
            copy = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.ShareDataUIState != topUpAmountResp.ShareDataUIState) {
            return false;
        }
        int i9 = component2 + 41;
        copy = i9 % 128;
        int i10 = i9 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.component1.hashCode() * 31) + Boolean.hashCode(this.ShareDataUIState);
        int i4 = copy + 57;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TopUpAmountResp(amount=" + this.component1 + ", selected=" + this.ShareDataUIState + ")";
        int i2 = copy + 71;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
