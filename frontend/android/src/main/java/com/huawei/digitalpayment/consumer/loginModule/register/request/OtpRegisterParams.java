package com.huawei.digitalpayment.consumer.loginModule.register.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/request/OtpRegisterParams;", "Lcom/huawei/http/BaseRequestParams;", "otp", "", "<init>", "(Ljava/lang/String;)V", "getOtp", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OtpRegisterParams extends BaseRequestParams {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final String otp;

    public OtpRegisterParams(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.otp = str;
    }

    public final String getOtp() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            str = this.otp;
            int i4 = 69 / 0;
        } else {
            str = this.otp;
        }
        int i5 = i3 + 31;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static OtpRegisterParams copy$default(OtpRegisterParams otpRegisterParams, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 11;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 107;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            str = otpRegisterParams.otp;
            int i8 = i4 + 35;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
        }
        return otpRegisterParams.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.otp;
        }
        int i3 = 2 / 0;
        return this.otp;
    }

    public final OtpRegisterParams copy(String otp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(otp, "");
        OtpRegisterParams otpRegisterParams = new OtpRegisterParams(otp);
        int i2 = ShareDataUIState + 51;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return otpRegisterParams;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this != other) {
            if (!(other instanceof OtpRegisterParams)) {
                return false;
            }
            if (Intrinsics.areEqual(this.otp, ((OtpRegisterParams) other).otp)) {
                return true;
            }
            int i2 = copydefault + 71;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = copydefault;
        int i5 = i4 + 87;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 107;
        ShareDataUIState = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.otp.hashCode();
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OtpRegisterParams(otp=" + this.otp + ")";
        int i2 = copydefault + 27;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
