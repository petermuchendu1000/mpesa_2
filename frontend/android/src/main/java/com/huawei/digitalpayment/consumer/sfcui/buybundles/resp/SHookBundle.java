package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001f\u001a\u00020\u0005H×\u0001J\t\u0010 \u001a\u00020\u0007H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/SHookBundle;", "", "autoRenew", "", "productAmount", "", "productId", "", "productName", "productUnits", "type", "<init>", "(ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAutoRenew", "()Z", "getProductAmount", "()I", "getProductId", "()Ljava/lang/String;", "getProductName", "getProductUnits", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SHookBundle {
    public static final int $stable = 0;
    private static int copy = 1;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private final String ShareDataUIState;
    private final String component1;
    private final boolean component2;
    private final String component3;
    private final String component4;
    private final int copydefault;

    public SHookBundle(boolean z, int i, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.component2 = z;
        this.copydefault = i;
        this.ShareDataUIState = str;
        this.component3 = str2;
        this.component1 = str3;
        this.component4 = str4;
    }

    public final boolean getAutoRenew() {
        boolean z;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 75;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.component2;
            int i4 = 43 / 0;
        } else {
            z = this.component2;
        }
        int i5 = i2 + 59;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final int getProductAmount() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 7;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.copydefault;
        int i6 = i2 + 73;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 49;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 119;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductName() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 7;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 73;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductUnits() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 35;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.component1;
        int i4 = i2 + 89;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 17;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component4;
        int i5 = i3 + 53;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = 1 + 61;
        equals = i % 128;
        if (i % 2 != 0) {
            int i2 = 65 / 0;
        }
    }

    public static SHookBundle copy$default(SHookBundle sHookBundle, boolean z, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        String str5;
        String str6;
        String str7;
        int i3 = 2 % 2;
        int i4 = getAsAtTimestamp + 83;
        int i5 = i4 % 128;
        getRequestBeneficiariesState = i5;
        int i6 = i4 % 2;
        boolean z2 = (i2 & 1) != 0 ? sHookBundle.component2 : z;
        int i7 = (i2 & 2) != 0 ? sHookBundle.copydefault : i;
        if ((i2 & 4) != 0) {
            int i8 = i5 + 103;
            getAsAtTimestamp = i8 % 128;
            int i9 = i8 % 2;
            str5 = sHookBundle.ShareDataUIState;
        } else {
            str5 = str;
        }
        if ((i2 & 8) != 0) {
            int i10 = getAsAtTimestamp + 107;
            getRequestBeneficiariesState = i10 % 128;
            if (i10 % 2 != 0) {
                String str8 = sHookBundle.component3;
                throw null;
            }
            str6 = sHookBundle.component3;
        } else {
            str6 = str2;
        }
        String str9 = (i2 & 16) != 0 ? sHookBundle.component1 : str3;
        if ((i2 & 32) != 0) {
            int i11 = getRequestBeneficiariesState + 55;
            getAsAtTimestamp = i11 % 128;
            int i12 = i11 % 2;
            str7 = sHookBundle.component4;
            if (i12 == 0) {
                int i13 = 10 / 0;
            }
        } else {
            str7 = str4;
        }
        return sHookBundle.copy(z2, i7, str5, str6, str9, str7);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 103;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.component2;
        int i4 = i3 + 89;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 5;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.copydefault;
        int i6 = i2 + 49;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 99 / 0;
        }
        return i5;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 27;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 97;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component3;
        int i4 = i3 + 25;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 15;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 119;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 55;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component4;
        int i4 = i3 + 1;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return str;
    }

    public final SHookBundle copy(boolean autoRenew, int productAmount, String productId, String productName, String productUnits, String type) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(productId, "");
        Intrinsics.checkNotNullParameter(productName, "");
        Intrinsics.checkNotNullParameter(productUnits, "");
        Intrinsics.checkNotNullParameter(type, "");
        SHookBundle sHookBundle = new SHookBundle(autoRenew, productAmount, productId, productName, productUnits, type);
        int i2 = getRequestBeneficiariesState + 45;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return sHookBundle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = getRequestBeneficiariesState + 123;
            int i3 = i2 % 128;
            getAsAtTimestamp = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 89;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof SHookBundle)) {
            int i7 = getAsAtTimestamp + 99;
            getRequestBeneficiariesState = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        SHookBundle sHookBundle = (SHookBundle) other;
        if (this.component2 != sHookBundle.component2 || this.copydefault != sHookBundle.copydefault) {
            return false;
        }
        if (Intrinsics.areEqual(this.ShareDataUIState, sHookBundle.ShareDataUIState)) {
            if (Intrinsics.areEqual(this.component3, sHookBundle.component3)) {
                return Intrinsics.areEqual(this.component1, sHookBundle.component1) && Intrinsics.areEqual(this.component4, sHookBundle.component4);
            }
            int i9 = getAsAtTimestamp + 113;
            getRequestBeneficiariesState = i9 % 128;
            return i9 % 2 != 0;
        }
        int i10 = getAsAtTimestamp + 9;
        int i11 = i10 % 128;
        getRequestBeneficiariesState = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 43;
        getAsAtTimestamp = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 69;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((Boolean.hashCode(this.component2) * 31) + Integer.hashCode(this.copydefault)) * 31) + this.ShareDataUIState.hashCode()) * 31) + this.component3.hashCode()) * 31) + this.component1.hashCode()) * 31) + this.component4.hashCode();
        int i4 = getRequestBeneficiariesState + 1;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SHookBundle(autoRenew=" + this.component2 + ", productAmount=" + this.copydefault + ", productId=" + this.ShareDataUIState + ", productName=" + this.component3 + ", productUnits=" + this.component1 + ", type=" + this.component4 + ")";
        int i2 = getRequestBeneficiariesState + 99;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
