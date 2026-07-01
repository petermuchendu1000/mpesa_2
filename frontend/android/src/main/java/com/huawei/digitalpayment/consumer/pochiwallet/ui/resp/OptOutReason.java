package com.huawei.digitalpayment.consumer.pochiwallet.ui.resp;

import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\t\u0010\u001b\u001a\u00020\u0005H×\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/resp/OptOutReason;", "", "selected", "", ImtConstants.KEY_REASON, "", "reasonId", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "getSelected", "()Z", "setSelected", "(Z)V", "getReason", "()Ljava/lang/String;", "setReason", "(Ljava/lang/String;)V", "getReasonId", "setReasonId", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OptOutReason {
    public static final int $stable = 8;
    private static int ShareDataUIState = 87 % 128;
    private static int component2 = 0;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private String component1;
    private String component3;
    private boolean copydefault;

    public OptOutReason(boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = z;
        this.component3 = str;
        this.component1 = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OptOutReason(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = getRequestBeneficiariesState + 37;
            int i3 = i2 % 128;
            equals = i3;
            int i4 = i2 % 2;
            str2 = "";
            int i5 = i3 + 27;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        this(z, str, str2);
    }

    public final boolean getSelected() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 27;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.copydefault;
        int i5 = i2 + 85;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSelected(boolean z) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 123;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        this.copydefault = z;
        int i5 = i3 + 125;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getReason() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 75;
        getRequestBeneficiariesState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.component3;
        int i4 = i2 + 105;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setReason(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 115;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component3 = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.component3 = str;
            throw null;
        }
    }

    public final String getReasonId() {
        int i = 2 % 2;
        int i2 = equals + 91;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.component1;
        int i4 = i3 + 121;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
        return str;
    }

    public final void setReasonId(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 111;
        equals = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component1 = str;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.component1 = str;
        int i3 = equals + 87;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = 87 % 2;
    }

    public static OptOutReason copy$default(OptOutReason optOutReason, boolean z, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 49;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 97;
            getRequestBeneficiariesState = i6 % 128;
            if (i6 % 2 != 0) {
                boolean z2 = optOutReason.copydefault;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            z = optOutReason.copydefault;
        }
        if ((i & 2) != 0) {
            str = optOutReason.component3;
        }
        if ((i & 4) != 0) {
            str2 = optOutReason.component1;
        }
        return optOutReason.copy(z, str, str2);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 89;
        equals = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.copydefault;
        int i5 = i2 + 15;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
        return z;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 41;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 77;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = equals + 25;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 101;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return str;
    }

    public final OptOutReason copy(boolean selected, String reason, String reasonId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(reason, "");
        Intrinsics.checkNotNullParameter(reasonId, "");
        OptOutReason optOutReason = new OptOutReason(selected, reason, reasonId);
        int i2 = equals + 69;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return optOutReason;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = equals + 77;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptOutReason)) {
            return false;
        }
        OptOutReason optOutReason = (OptOutReason) other;
        if (this.copydefault == optOutReason.copydefault) {
            if (Intrinsics.areEqual(this.component3, optOutReason.component3)) {
                return Intrinsics.areEqual(this.component1, optOutReason.component1);
            }
            int i5 = equals + 45;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i3 + 105;
        int i8 = i7 % 128;
        equals = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 111;
        getRequestBeneficiariesState = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = equals + 85;
        getRequestBeneficiariesState = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((Boolean.hashCode(this.copydefault) >>> 107) * this.component3.hashCode()) / 63) - this.component1.hashCode() : (((Boolean.hashCode(this.copydefault) * 31) + this.component3.hashCode()) * 31) + this.component1.hashCode();
        int i3 = getRequestBeneficiariesState + 7;
        equals = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OptOutReason(selected=" + this.copydefault + ", reason=" + this.component3 + ", reasonId=" + this.component1 + ")";
        int i2 = getRequestBeneficiariesState + 97;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
