package com.huawei.digitalpayment.consumer.loginModule.register.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/request/ChangePinParams;", "Lcom/huawei/http/BaseRequestParams;", "oldPin", "", "newPin", "verifyConfig", "Lcom/huawei/digitalpayment/consumer/loginModule/register/request/VerifyConfig;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/loginModule/register/request/VerifyConfig;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getOldPin", "()Ljava/lang/String;", "getNewPin", "getVerifyConfig", "()Lcom/huawei/digitalpayment/consumer/loginModule/register/request/VerifyConfig;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChangePinParams extends BaseRequestParams {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final String newPin;
    private final String oldPin;
    private final VerifyConfig verifyConfig;

    /* JADX WARN: Illegal instructions before constructor call */
    public ChangePinParams(String str, String str2, VerifyConfig verifyConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = ShareDataUIState + 107;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 13;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            verifyConfig = null;
        }
        this(str, str2, verifyConfig);
    }

    public final String getOldPin() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.oldPin;
        int i4 = i3 + 5;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getNewPin() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.newPin;
        int i5 = i3 + 91;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VerifyConfig getVerifyConfig() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.verifyConfig;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ChangePinParams(String str, String str2, VerifyConfig verifyConfig) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.oldPin = str;
        this.newPin = str2;
        this.verifyConfig = verifyConfig;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChangePinParams(String str, String str2) {
        this(str, str2, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }

    public static ChangePinParams copy$default(ChangePinParams changePinParams, String str, String str2, VerifyConfig verifyConfig, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 111;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            str = changePinParams.oldPin;
        }
        if ((i & 2) != 0) {
            int i6 = i3 + 37;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                String str3 = changePinParams.newPin;
                throw null;
            }
            str2 = changePinParams.newPin;
        }
        if ((i & 4) != 0) {
            verifyConfig = changePinParams.verifyConfig;
        }
        return changePinParams.copy(str, str2, verifyConfig);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 33;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.oldPin;
        int i5 = i2 + 93;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 41;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.newPin;
        int i4 = i2 + 103;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final VerifyConfig component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 103;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        VerifyConfig verifyConfig = this.verifyConfig;
        int i5 = i2 + 17;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return verifyConfig;
    }

    public final ChangePinParams copy(String oldPin, String newPin, VerifyConfig verifyConfig) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(oldPin, "");
        Intrinsics.checkNotNullParameter(newPin, "");
        ChangePinParams changePinParams = new ChangePinParams(oldPin, newPin, verifyConfig);
        int i2 = ShareDataUIState + 19;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return changePinParams;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangePinParams)) {
            return false;
        }
        ChangePinParams changePinParams = (ChangePinParams) other;
        if (!Intrinsics.areEqual(this.oldPin, changePinParams.oldPin)) {
            return false;
        }
        if (Intrinsics.areEqual(this.newPin, changePinParams.newPin)) {
            if (Intrinsics.areEqual(this.verifyConfig, changePinParams.verifyConfig)) {
                return true;
            }
            int i4 = ShareDataUIState + 75;
            copydefault = i4 % 128;
            return i4 % 2 != 0;
        }
        int i5 = ShareDataUIState;
        int i6 = i5 + 83;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 25;
        copydefault = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.oldPin.hashCode();
        int iHashCode3 = this.newPin.hashCode();
        VerifyConfig verifyConfig = this.verifyConfig;
        if (verifyConfig == null) {
            int i2 = ShareDataUIState + 5;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 % 2;
            }
            iHashCode = 0;
        } else {
            iHashCode = verifyConfig.hashCode();
        }
        int i4 = (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
        int i5 = ShareDataUIState + 69;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ChangePinParams(oldPin=" + this.oldPin + ", newPin=" + this.newPin + ", verifyConfig=" + this.verifyConfig + ")";
        int i2 = copydefault + 61;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
