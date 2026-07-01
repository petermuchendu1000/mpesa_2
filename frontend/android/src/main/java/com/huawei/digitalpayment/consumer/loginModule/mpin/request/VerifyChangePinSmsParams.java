package com.huawei.digitalpayment.consumer.loginModule.mpin.request;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/request/VerifyChangePinSmsParams;", "Lcom/huawei/http/BaseRequestParams;", "otp", "", KeysConstants.KEY_OTP_TYPE, "initiatorMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOtp", "()Ljava/lang/String;", "getOtpType", "getInitiatorMsisdn", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifyChangePinSmsParams extends BaseRequestParams {
    private static int component1 = 1;
    private static int copydefault;
    private final String initiatorMsisdn;
    private final String otp;
    private final String otpType;

    public final String getOtp() {
        int i = 2 % 2;
        int i2 = component1 + 105;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.otp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getOtpType() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.otpType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getInitiatorMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.initiatorMsisdn;
        }
        throw null;
    }

    public VerifyChangePinSmsParams(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.otp = str;
        this.otpType = str2;
        this.initiatorMsisdn = str3;
    }

    public static VerifyChangePinSmsParams copy$default(VerifyChangePinSmsParams verifyChangePinSmsParams, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1;
            int i4 = i3 + 21;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            String str4 = verifyChangePinSmsParams.otp;
            int i6 = i3 + 107;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            str = str4;
        }
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i8 = component1 + 15;
            copydefault = i8 % 128;
            if (i8 % 2 != 0) {
                String str5 = verifyChangePinSmsParams.otpType;
                throw null;
            }
            str2 = verifyChangePinSmsParams.otpType;
        }
        if ((i & 4) != 0) {
            int i9 = copydefault + 47;
            component1 = i9 % 128;
            if (i9 % 2 == 0) {
                String str6 = verifyChangePinSmsParams.initiatorMsisdn;
                obj2.hashCode();
                throw null;
            }
            str3 = verifyChangePinSmsParams.initiatorMsisdn;
        }
        return verifyChangePinSmsParams.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.otp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.otpType;
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 83;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.initiatorMsisdn;
        int i4 = i2 + 99;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return str;
    }

    public final VerifyChangePinSmsParams copy(String otp, String otpType, String initiatorMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(otp, "");
        Intrinsics.checkNotNullParameter(otpType, "");
        Intrinsics.checkNotNullParameter(initiatorMsisdn, "");
        VerifyChangePinSmsParams verifyChangePinSmsParams = new VerifyChangePinSmsParams(otp, otpType, initiatorMsisdn);
        int i2 = copydefault + 35;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return verifyChangePinSmsParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyChangePinSmsParams)) {
            int i5 = i3 + 13;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        VerifyChangePinSmsParams verifyChangePinSmsParams = (VerifyChangePinSmsParams) other;
        if (!Intrinsics.areEqual(this.otp, verifyChangePinSmsParams.otp)) {
            int i7 = copydefault + 57;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.otpType, verifyChangePinSmsParams.otpType)) {
            return false;
        }
        if (Intrinsics.areEqual(this.initiatorMsisdn, verifyChangePinSmsParams.initiatorMsisdn)) {
            return true;
        }
        int i9 = component1 + 71;
        copydefault = i9 % 128;
        return i9 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.otp.hashCode() * 31) + this.otpType.hashCode()) * 31) + this.initiatorMsisdn.hashCode();
        int i4 = copydefault + 19;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifyChangePinSmsParams(otp=" + this.otp + ", otpType=" + this.otpType + ", initiatorMsisdn=" + this.initiatorMsisdn + ")";
        int i2 = component1 + 119;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
