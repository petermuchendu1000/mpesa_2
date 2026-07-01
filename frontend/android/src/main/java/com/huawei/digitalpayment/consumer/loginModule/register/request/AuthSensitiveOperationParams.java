package com.huawei.digitalpayment.consumer.loginModule.register.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/request/AuthSensitiveOperationParams;", "Lcom/huawei/http/BaseRequestParams;", "initiatorPin", "", "<init>", "(Ljava/lang/String;)V", "getInitiatorPin", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AuthSensitiveOperationParams extends BaseRequestParams {
    private static int component1 = 0;
    private static int component3 = 1;
    private final String initiatorPin;

    public AuthSensitiveOperationParams(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.initiatorPin = str;
    }

    public final String getInitiatorPin() {
        int i = 2 % 2;
        int i2 = component3 + 111;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.initiatorPin;
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return str;
    }

    public static AuthSensitiveOperationParams copy$default(AuthSensitiveOperationParams authSensitiveOperationParams, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 93;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                str = authSensitiveOperationParams.initiatorPin;
                int i4 = 14 / 0;
            } else {
                str = authSensitiveOperationParams.initiatorPin;
            }
        }
        AuthSensitiveOperationParams authSensitiveOperationParamsCopy = authSensitiveOperationParams.copy(str);
        int i5 = component1 + 97;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return authSensitiveOperationParamsCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.initiatorPin;
        int i5 = i3 + 31;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return str;
    }

    public final AuthSensitiveOperationParams copy(String initiatorPin) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(initiatorPin, "");
        AuthSensitiveOperationParams authSensitiveOperationParams = new AuthSensitiveOperationParams(initiatorPin);
        int i2 = component1 + 107;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 17 / 0;
        }
        return authSensitiveOperationParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 67;
            component1 = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof AuthSensitiveOperationParams)) {
            int i3 = component3 + 101;
            component1 = i3 % 128;
            return i3 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.initiatorPin, ((AuthSensitiveOperationParams) other).initiatorPin)) {
            return true;
        }
        int i4 = component3 + 13;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.initiatorPin.hashCode();
        int i4 = component3 + 121;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AuthSensitiveOperationParams(initiatorPin=" + this.initiatorPin + ")";
        int i2 = component3 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
