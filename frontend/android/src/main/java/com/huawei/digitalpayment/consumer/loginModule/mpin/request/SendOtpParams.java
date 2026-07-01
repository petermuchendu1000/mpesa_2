package com.huawei.digitalpayment.consumer.loginModule.mpin.request;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/request/SendOtpParams;", "Lcom/huawei/http/BaseRequestParams;", KeysConstants.KEY_OTP_TYPE, "", "initiatorMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getOtpType", "()Ljava/lang/String;", "getInitiatorMsisdn", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SendOtpParams extends BaseRequestParams {
    public static int ShareDataUIState = 512234700;
    private static int component1 = 1;
    private static int component2;
    private final String initiatorMsisdn;
    private final String otpType;

    public SendOtpParams(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.otpType = str;
        this.initiatorMsisdn = str2;
    }

    public final String getInitiatorMsisdn() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 117;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.initiatorMsisdn;
        int i5 = i2 + 81;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOtpType() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 29;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            str = this.otpType;
            int i4 = 65 / 0;
        } else {
            str = this.otpType;
        }
        int i5 = i3 + 71;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static SendOtpParams copy$default(SendOtpParams sendOtpParams, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = sendOtpParams.otpType;
            int i3 = component2 + 75;
            component1 = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 2) != 0) {
            str2 = sendOtpParams.initiatorMsisdn;
        }
        SendOtpParams sendOtpParamsCopy = sendOtpParams.copy(str, str2);
        int i5 = component2 + 43;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return sendOtpParamsCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.otpType;
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 1;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.initiatorMsisdn;
        int i4 = i2 + 99;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final SendOtpParams copy(String otpType, String initiatorMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(otpType, "");
        Intrinsics.checkNotNullParameter(initiatorMsisdn, "");
        SendOtpParams sendOtpParams = new SendOtpParams(otpType, initiatorMsisdn);
        int i2 = component2 + 97;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return sendOtpParams;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendOtpParams)) {
            return false;
        }
        SendOtpParams sendOtpParams = (SendOtpParams) other;
        if (!Intrinsics.areEqual(this.otpType, sendOtpParams.otpType)) {
            int i2 = component2 + 39;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.initiatorMsisdn, sendOtpParams.initiatorMsisdn)) {
            return false;
        }
        int i4 = component2 + 41;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 71 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 61;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.otpType.hashCode() * 31) + this.initiatorMsisdn.hashCode();
        int i4 = component1 + 101;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SendOtpParams(otpType=" + this.otpType + ", initiatorMsisdn=" + this.initiatorMsisdn + ")";
        int i2 = component2 + 107;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
