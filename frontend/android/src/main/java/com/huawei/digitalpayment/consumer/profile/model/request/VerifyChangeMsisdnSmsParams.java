package com.huawei.digitalpayment.consumer.profile.model.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/profile/model/request/VerifyChangeMsisdnSmsParams;", "Lcom/huawei/http/BaseRequestParams;", "initiatorMsisdn", "", "otp", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getInitiatorMsisdn", "()Ljava/lang/String;", "getOtp", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerProfileModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifyChangeMsisdnSmsParams extends BaseRequestParams {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final String initiatorMsisdn;
    private final String otp;

    public VerifyChangeMsisdnSmsParams(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.initiatorMsisdn = str;
        this.otp = str2;
    }

    public final String getInitiatorMsisdn() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 105;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.initiatorMsisdn;
        int i5 = i2 + 125;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getOtp() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 91;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.otp;
        int i5 = i2 + 9;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 94 / 0;
        }
        return str;
    }

    public static VerifyChangeMsisdnSmsParams copy$default(VerifyChangeMsisdnSmsParams verifyChangeMsisdnSmsParams, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = verifyChangeMsisdnSmsParams.initiatorMsisdn;
        }
        if ((i & 2) != 0) {
            int i3 = ShareDataUIState;
            int i4 = i3 + 3;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            String str3 = verifyChangeMsisdnSmsParams.otp;
            int i6 = i3 + 105;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 / 3;
            }
            str2 = str3;
        }
        VerifyChangeMsisdnSmsParams verifyChangeMsisdnSmsParamsCopy = verifyChangeMsisdnSmsParams.copy(str, str2);
        int i8 = component1 + 83;
        ShareDataUIState = i8 % 128;
        if (i8 % 2 != 0) {
            return verifyChangeMsisdnSmsParamsCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 1;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.initiatorMsisdn;
        int i5 = i2 + 81;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.otp;
        int i5 = i3 + 59;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 24 / 0;
        }
        return str;
    }

    public final VerifyChangeMsisdnSmsParams copy(String initiatorMsisdn, String otp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(initiatorMsisdn, "");
        Intrinsics.checkNotNullParameter(otp, "");
        VerifyChangeMsisdnSmsParams verifyChangeMsisdnSmsParams = new VerifyChangeMsisdnSmsParams(initiatorMsisdn, otp);
        int i2 = component1 + 27;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return verifyChangeMsisdnSmsParams;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 25;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (other instanceof VerifyChangeMsisdnSmsParams) {
            VerifyChangeMsisdnSmsParams verifyChangeMsisdnSmsParams = (VerifyChangeMsisdnSmsParams) other;
            return Intrinsics.areEqual(this.initiatorMsisdn, verifyChangeMsisdnSmsParams.initiatorMsisdn) && Intrinsics.areEqual(this.otp, verifyChangeMsisdnSmsParams.otp);
        }
        int i4 = component1 + 53;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.initiatorMsisdn.hashCode() * 31) + this.otp.hashCode();
        int i4 = ShareDataUIState + 57;
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
        String str = "VerifyChangeMsisdnSmsParams(initiatorMsisdn=" + this.initiatorMsisdn + ", otp=" + this.otp + ")";
        int i2 = component1 + 91;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
