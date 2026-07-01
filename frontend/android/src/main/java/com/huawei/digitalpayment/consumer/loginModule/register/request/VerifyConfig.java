package com.huawei.digitalpayment.consumer.loginModule.register.request;

import com.huawei.digitalpayment.consumer.constants.Keys;
import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/request/VerifyConfig;", "Lcom/huawei/http/BaseRequestParams;", Keys.VERIFY_TYPE, "", "<init>", "(Ljava/lang/String;)V", "getVerifyType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifyConfig extends BaseRequestParams {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final String verifyType;

    public VerifyConfig(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.verifyType = str;
    }

    public final String getVerifyType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 117;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.verifyType;
        int i4 = i2 + 29;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public static VerifyConfig copy$default(VerifyConfig verifyConfig, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 41;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            str = verifyConfig.verifyType;
        }
        VerifyConfig verifyConfigCopy = verifyConfig.copy(str);
        int i5 = component2 + 109;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return verifyConfigCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.verifyType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VerifyConfig copy(String verifyType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(verifyType, "");
        VerifyConfig verifyConfig = new VerifyConfig(verifyType);
        int i2 = component2 + 27;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return verifyConfig;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyConfig)) {
            int i2 = component2 + 37;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        Object obj = null;
        if (Intrinsics.areEqual(this.verifyType, ((VerifyConfig) other).verifyType)) {
            int i4 = ShareDataUIState + 51;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            throw null;
        }
        int i5 = component2;
        int i6 = i5 + 37;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 93;
        ShareDataUIState = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 35;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            this.verifyType.hashCode();
            throw null;
        }
        int iHashCode = this.verifyType.hashCode();
        int i3 = component2 + 55;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifyConfig(verifyType=" + this.verifyType + ")";
        int i2 = ShareDataUIState + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
