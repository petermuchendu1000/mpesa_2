package com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/repository/LipaTransactionCost;", "", KeysConstants.SHORT_CODE, "", "merchantName", "fee", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getShortCode", "()Ljava/lang/String;", "getMerchantName", "getFee", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LipaTransactionCost {
    public static final int $stable = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;
    private final String ShareDataUIState;
    private final String component2;
    private final String copydefault;

    public LipaTransactionCost(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.component2 = str;
        this.ShareDataUIState = str2;
        this.copydefault = str3;
    }

    public final String getShortCode() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 75;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 81;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMerchantName() {
        int i = 2 % 2;
        int i2 = copy + 107;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final String getFee() {
        int i = 2 % 2;
        int i2 = copy + 47;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 101;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = 1 + 17;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static LipaTransactionCost copy$default(LipaTransactionCost lipaTransactionCost, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = getAsAtTimestamp + 39;
            copy = i3 % 128;
            if (i3 % 2 != 0) {
                String str4 = lipaTransactionCost.component2;
                throw null;
            }
            str = lipaTransactionCost.component2;
        }
        if ((i & 2) != 0) {
            str2 = lipaTransactionCost.ShareDataUIState;
        }
        if ((i & 4) != 0) {
            str3 = lipaTransactionCost.copydefault;
            int i4 = copy + 13;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        }
        return lipaTransactionCost.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copy + 53;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 93;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 95;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 111;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 121;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LipaTransactionCost copy(String shortCode, String merchantName, String fee) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(shortCode, "");
        Intrinsics.checkNotNullParameter(merchantName, "");
        Intrinsics.checkNotNullParameter(fee, "");
        LipaTransactionCost lipaTransactionCost = new LipaTransactionCost(shortCode, merchantName, fee);
        int i2 = getAsAtTimestamp + 45;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return lipaTransactionCost;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copy + 37;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (other instanceof LipaTransactionCost) {
            LipaTransactionCost lipaTransactionCost = (LipaTransactionCost) other;
            return Intrinsics.areEqual(this.component2, lipaTransactionCost.component2) && Intrinsics.areEqual(this.ShareDataUIState, lipaTransactionCost.ShareDataUIState) && !(Intrinsics.areEqual(this.copydefault, lipaTransactionCost.copydefault) ^ true);
        }
        int i4 = getAsAtTimestamp + 53;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 93;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.component2.hashCode();
        return i3 == 0 ? (((iHashCode >>> 77) << this.ShareDataUIState.hashCode()) / 38) << this.copydefault.hashCode() : (((iHashCode * 31) + this.ShareDataUIState.hashCode()) * 31) + this.copydefault.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LipaTransactionCost(shortCode=" + this.component2 + ", merchantName=" + this.ShareDataUIState + ", fee=" + this.copydefault + ")";
        int i2 = getAsAtTimestamp + 83;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
