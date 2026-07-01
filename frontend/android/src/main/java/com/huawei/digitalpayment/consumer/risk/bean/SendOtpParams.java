package com.huawei.digitalpayment.consumer.risk.bean;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/risk/bean/SendOtpParams;", "Lcom/huawei/http/BaseRequestParams;", KeysConstants.KEY_OTP_TYPE, "", "initiatorMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getOtpType", "()Ljava/lang/String;", "getInitiatorMsisdn", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerRiskModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SendOtpParams extends BaseRequestParams {
    private static int component2 = 0;
    private static int component3 = 1;
    private final String initiatorMsisdn;
    private final String otpType;

    public SendOtpParams(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.otpType = str;
        this.initiatorMsisdn = str2;
    }

    public final String getInitiatorMsisdn() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 61;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            str = this.initiatorMsisdn;
            int i4 = 73 / 0;
        } else {
            str = this.initiatorMsisdn;
        }
        int i5 = i3 + 43;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getOtpType() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.otpType;
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        return str;
    }

    public static SendOtpParams copy$default(SendOtpParams sendOtpParams, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 21;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            str = sendOtpParams.otpType;
        }
        if ((i & 2) != 0) {
            int i5 = component3 + 51;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            str2 = sendOtpParams.initiatorMsisdn;
        }
        return sendOtpParams.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 29;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.otpType;
        int i5 = i2 + 11;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 97;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.initiatorMsisdn;
        int i5 = i2 + 121;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final SendOtpParams copy(String otpType, String initiatorMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(otpType, "");
        SendOtpParams sendOtpParams = new SendOtpParams(otpType, initiatorMsisdn);
        int i2 = component2 + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return sendOtpParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 51;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(other instanceof SendOtpParams)) {
            return false;
        }
        SendOtpParams sendOtpParams = (SendOtpParams) other;
        if (!(!Intrinsics.areEqual(this.otpType, sendOtpParams.otpType))) {
            return Intrinsics.areEqual(this.initiatorMsisdn, sendOtpParams.initiatorMsisdn);
        }
        int i3 = component2 + 67;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.otpType.hashCode();
        String str = this.initiatorMsisdn;
        if (str == null) {
            int i3 = component2 + 105;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i5 = component2 + 23;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return (iHashCode * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SendOtpParams(otpType=" + this.otpType + ", initiatorMsisdn=" + this.initiatorMsisdn + ")";
        int i2 = component3 + 95;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
