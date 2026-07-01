package com.huawei.digitalpayment.consumer.loginModule.register.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/request/RegisterKycParams;", "Lcom/huawei/http/BaseRequestParams;", "portletCode", "", "<init>", "(Ljava/lang/String;)V", "getPortletCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RegisterKycParams extends BaseRequestParams {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final String portletCode;

    public RegisterKycParams(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.portletCode = str;
    }

    public final String getPortletCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 49;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.portletCode;
        int i4 = i2 + 65;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return str;
    }

    public static RegisterKycParams copy$default(RegisterKycParams registerKycParams, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 25;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            str = registerKycParams.portletCode;
        }
        RegisterKycParams registerKycParamsCopy = registerKycParams.copy(str);
        int i4 = component2 + 93;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return registerKycParamsCopy;
        }
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.portletCode;
        }
        throw null;
    }

    public final RegisterKycParams copy(String portletCode) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(portletCode, "");
        RegisterKycParams registerKycParams = new RegisterKycParams(portletCode);
        int i2 = ShareDataUIState + 7;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 78 / 0;
        }
        return registerKycParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 31;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            int i4 = i3 + 35;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(other instanceof RegisterKycParams)) {
            return false;
        }
        if (Intrinsics.areEqual(this.portletCode, ((RegisterKycParams) other).portletCode)) {
            return true;
        }
        int i6 = ShareDataUIState + 105;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.portletCode.hashCode();
        int i4 = ShareDataUIState + 5;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RegisterKycParams(portletCode=" + this.portletCode + ")";
        int i2 = ShareDataUIState + 93;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
