package com.huawei.digitalpayment.consumer.loginModule.register.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.m3;
import kotlin.m4;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/request/SetPinParams;", "Lcom/huawei/http/BaseRequestParams;", "initiatorPin", "", "<init>", "(Ljava/lang/String;)V", "getInitiatorPin", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SetPinParams extends BaseRequestParams {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final String initiatorPin;

    public SetPinParams(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.initiatorPin = str;
    }

    public final String getInitiatorPin() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 105;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.initiatorPin;
        int i5 = i2 + 63;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static SetPinParams copy$default(SetPinParams setPinParams, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 53;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = setPinParams.initiatorPin;
            int i6 = i4 + 111;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
        return setPinParams.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.initiatorPin;
        int i5 = i3 + 105;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final SetPinParams copy(String initiatorPin) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(initiatorPin, "");
        SetPinParams setPinParams = new SetPinParams(initiatorPin);
        int i2 = ShareDataUIState + 123;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return setPinParams;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 49;
            ShareDataUIState = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof SetPinParams)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.initiatorPin, ((SetPinParams) other).initiatorPin)) {
            int i3 = component3 + 93;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = ShareDataUIState + 109;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.initiatorPin.hashCode();
        int i4 = ShareDataUIState + 33;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SetPinParams(initiatorPin=" + this.initiatorPin + ")";
        int i2 = ShareDataUIState + 29;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void copydefault() {
        m3.component2[0] = m4.copydefault[0];
    }
}
