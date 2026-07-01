package com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/login/data/source/local/request/OtpLoginParams;", "Lcom/huawei/http/BaseRequestParams;", "otp", "", "<init>", "(Ljava/lang/String;)V", "getOtp", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OtpLoginParams extends BaseRequestParams {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final String otp;

    public OtpLoginParams(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.otp = str;
    }

    public final String getOtp() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.otp;
        }
        throw null;
    }

    public static OtpLoginParams copy$default(OtpLoginParams otpLoginParams, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 25;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                String str2 = otpLoginParams.otp;
                throw null;
            }
            str = otpLoginParams.otp;
        }
        OtpLoginParams otpLoginParamsCopy = otpLoginParams.copy(str);
        int i4 = ShareDataUIState + 3;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return otpLoginParamsCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.otp;
        }
        throw null;
    }

    public final OtpLoginParams copy(String otp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(otp, "");
        OtpLoginParams otpLoginParams = new OtpLoginParams(otp);
        int i2 = ShareDataUIState + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return otpLoginParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 107;
            ShareDataUIState = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof OtpLoginParams)) {
            int i3 = component2 + 55;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.otp, ((OtpLoginParams) other).otp)) {
            return true;
        }
        int i5 = ShareDataUIState + 1;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 83;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.otp.hashCode();
            throw null;
        }
        int iHashCode = this.otp.hashCode();
        int i3 = ShareDataUIState + 109;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OtpLoginParams(otp=" + this.otp + ")";
        int i2 = ShareDataUIState + 77;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
