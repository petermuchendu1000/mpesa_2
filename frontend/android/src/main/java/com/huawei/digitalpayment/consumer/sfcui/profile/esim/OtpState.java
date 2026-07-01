package com.huawei.digitalpayment.consumer.sfcui.profile.esim;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/OtpState;", "", "otpCode", "", GriverMonitorConstants.KEY_IS_LOADING, "", "isValidating", "otpSent", "otpValidated", "error", "<init>", "(Ljava/lang/String;ZZZZLjava/lang/String;)V", "getOtpCode", "()Ljava/lang/String;", "()Z", "getOtpSent", "getOtpValidated", "getError", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OtpState {
    public static final int $stable = 0;
    private static int component4 = 0;
    private static int copy = 1;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private final boolean ShareDataUIState;
    private final String component1;
    private final boolean component2;
    private final String component3;
    private final boolean copydefault;
    private final boolean getRequestBeneficiariesState;

    public OtpState(String str, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.component3 = str;
        this.component2 = z;
        this.ShareDataUIState = z2;
        this.copydefault = z3;
        this.getRequestBeneficiariesState = z4;
        this.component1 = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OtpState(String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z5;
        boolean z6;
        str = (i & 1) != 0 ? "" : str;
        boolean z7 = false;
        if ((i & 2) != 0) {
            int i2 = equals + 77;
            component4 = i2 % 128;
            if (i2 % 2 != 0) {
                z = true;
                z5 = z;
            } else {
                z5 = false;
            }
        } else {
            z5 = z;
        }
        boolean z8 = (i & 4) != 0 ? false : z2;
        if ((i & 8) != 0) {
            int i3 = component4 + 61;
            equals = i3 % 128;
            int i4 = i3 % 2;
            z6 = false;
        } else {
            z6 = z3;
        }
        if ((i & 16) != 0) {
            int i5 = equals + 73;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } else {
            z7 = z4;
        }
        if ((i & 32) != 0) {
            int i8 = equals + 123;
            component4 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str2 = null;
        }
        this(str, z5, z8, z6, z7, str2);
    }

    public final String getOtpCode() {
        int i = 2 % 2;
        int i2 = component4 + 123;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component3;
        int i4 = i3 + 41;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = equals + 47;
        int i3 = i2 % 128;
        component4 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.component2;
        int i4 = i3 + 59;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean isValidating() {
        boolean z;
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 87;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.ShareDataUIState;
            int i4 = 36 / 0;
        } else {
            z = this.ShareDataUIState;
        }
        int i5 = i2 + 83;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final boolean getOtpSent() {
        int i = 2 % 2;
        int i2 = component4 + 105;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final boolean getOtpValidated() {
        int i = 2 % 2;
        int i2 = equals + 39;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        boolean z = this.getRequestBeneficiariesState;
        int i5 = i3 + 39;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getError() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 81;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 29;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = 1 + 55;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    public OtpState() {
        this(null, false, false, false, false, null, 63, null);
    }

    public static OtpState copy$default(OtpState otpState, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i, Object obj) {
        boolean z5;
        String str3;
        int i2 = 2 % 2;
        int i3 = component4;
        int i4 = i3 + 5;
        equals = i4 % 128;
        String str4 = (i4 % 2 != 0 ? (i & 1) == 0 : (i & 1) == 0) ? str : otpState.component3;
        if ((i & 2) != 0) {
            int i5 = i3 + 61;
            equals = i5 % 128;
            if (i5 % 2 == 0) {
                z5 = otpState.component2;
                int i6 = 58 / 0;
            } else {
                z5 = otpState.component2;
            }
        } else {
            z5 = z;
        }
        boolean z6 = (i & 4) != 0 ? otpState.ShareDataUIState : z2;
        boolean z7 = (i & 8) != 0 ? otpState.copydefault : z3;
        boolean z8 = (i & 16) != 0 ? otpState.getRequestBeneficiariesState : z4;
        if ((i & 32) != 0) {
            int i7 = equals + 85;
            component4 = i7 % 128;
            if (i7 % 2 != 0) {
                String str5 = otpState.component1;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str3 = otpState.component1;
        } else {
            str3 = str2;
        }
        return otpState.copy(str4, z5, z6, z7, z8, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 37;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 93;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return str;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = equals + 63;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.component2;
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        return z;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 75;
        equals = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i2 + 89;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 37;
        equals = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.copydefault;
        int i5 = i2 + 19;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean component5() {
        boolean z;
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 15;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.getRequestBeneficiariesState;
            int i4 = 54 / 0;
        } else {
            z = this.getRequestBeneficiariesState;
        }
        int i5 = i2 + 69;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return z;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = equals + 37;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final OtpState copy(String otpCode, boolean isLoading, boolean isValidating, boolean otpSent, boolean otpValidated, String error) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(otpCode, "");
        OtpState otpState = new OtpState(otpCode, isLoading, isValidating, otpSent, otpValidated, error);
        int i2 = component4 + 81;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return otpState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 95;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtpState)) {
            int i4 = i2 + 97;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        OtpState otpState = (OtpState) other;
        if (!Intrinsics.areEqual(this.component3, otpState.component3)) {
            int i6 = equals + 37;
            component4 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.component2 == otpState.component2) {
            return this.ShareDataUIState == otpState.ShareDataUIState && this.copydefault == otpState.copydefault && this.getRequestBeneficiariesState == otpState.getRequestBeneficiariesState && Intrinsics.areEqual(this.component1, otpState.component1);
        }
        int i8 = equals + 113;
        component4 = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.component3.hashCode();
        int iHashCode3 = Boolean.hashCode(this.component2);
        int iHashCode4 = Boolean.hashCode(this.ShareDataUIState);
        int iHashCode5 = Boolean.hashCode(this.copydefault);
        int iHashCode6 = Boolean.hashCode(this.getRequestBeneficiariesState);
        String str = this.component1;
        if (str == null) {
            int i2 = equals + 29;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i4 = (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode;
        int i5 = component4 + 109;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OtpState(otpCode=" + this.component3 + ", isLoading=" + this.component2 + ", isValidating=" + this.ShareDataUIState + ", otpSent=" + this.copydefault + ", otpValidated=" + this.getRequestBeneficiariesState + ", error=" + this.component1 + ")";
        int i2 = equals + 9;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 65 / 0;
        }
        return str;
    }
}
