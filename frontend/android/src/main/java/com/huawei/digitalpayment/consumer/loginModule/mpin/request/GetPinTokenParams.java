package com.huawei.digitalpayment.consumer.loginModule.mpin.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/request/GetPinTokenParams;", "Lcom/huawei/http/BaseRequestParams;", "initiatorPin", "", "<init>", "(Ljava/lang/String;)V", "getInitiatorPin", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetPinTokenParams extends BaseRequestParams {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final String initiatorPin;

    public GetPinTokenParams(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.initiatorPin = str;
    }

    public final String getInitiatorPin() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.initiatorPin;
        int i5 = i3 + 1;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
        return str;
    }

    public static GetPinTokenParams copy$default(GetPinTokenParams getPinTokenParams, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 55;
        int i4 = i3 % 128;
        copydefault = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 29;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            str = getPinTokenParams.initiatorPin;
            if (i7 != 0) {
                int i8 = 63 / 0;
            }
        }
        return getPinTokenParams.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.initiatorPin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final GetPinTokenParams copy(String initiatorPin) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(initiatorPin, "");
        GetPinTokenParams getPinTokenParams = new GetPinTokenParams(initiatorPin);
        int i2 = ShareDataUIState + 81;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return getPinTokenParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetPinTokenParams)) {
            return false;
        }
        if (Intrinsics.areEqual(this.initiatorPin, ((GetPinTokenParams) other).initiatorPin)) {
            int i2 = ShareDataUIState + 41;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = copydefault + 3;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            this.initiatorPin.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.initiatorPin.hashCode();
        int i3 = copydefault + 107;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GetPinTokenParams(initiatorPin=" + this.initiatorPin + ")";
        int i2 = copydefault + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
