package com.huawei.digitalpayment.consumer.loginModule.mpin.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/request/VerifyOtpParams;", "Lcom/huawei/http/BaseRequestParams;", "otp", "", "<init>", "(Ljava/lang/String;)V", "getOtp", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifyOtpParams extends BaseRequestParams {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final String otp;

    public VerifyOtpParams(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.otp = str;
    }

    public final String getOtp() {
        int i = 2 % 2;
        int i2 = component3 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.otp;
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return str;
    }

    public static VerifyOtpParams copy$default(VerifyOtpParams verifyOtpParams, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 119;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 87;
            int i7 = i6 % 128;
            component3 = i7;
            if (i6 % 2 != 0) {
                String str2 = verifyOtpParams.otp;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            String str3 = verifyOtpParams.otp;
            int i8 = i7 + 49;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            str = str3;
        }
        return verifyOtpParams.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.otp;
        int i5 = i3 + 79;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
        return str;
    }

    public final VerifyOtpParams copy(String otp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(otp, "");
        VerifyOtpParams verifyOtpParams = new VerifyOtpParams(otp);
        int i2 = copydefault + 63;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return verifyOtpParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this != other) {
            if (other instanceof VerifyOtpParams) {
                return Intrinsics.areEqual(this.otp, ((VerifyOtpParams) other).otp);
            }
            int i2 = component3 + 31;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = copydefault + 121;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.otp;
        if (i3 != 0) {
            return str.hashCode();
        }
        str.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifyOtpParams(otp=" + this.otp + ")";
        int i2 = component3 + 31;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
