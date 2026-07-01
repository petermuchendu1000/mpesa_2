package com.huawei.digitalpayment.consumer.loginModule.mpin.data;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/VerifySecurityQuestionResp;", "Lcom/huawei/http/BaseResp;", "verifyCode", "", "<init>", "(Ljava/lang/String;)V", "getVerifyCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifySecurityQuestionResp extends BaseResp {
    private static int component2 = 1;
    private static int copydefault;
    private final String verifyCode;

    public VerifySecurityQuestionResp(String str) {
        this.verifyCode = str;
    }

    public final String getVerifyCode() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 117;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.verifyCode;
        int i5 = i2 + 59;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static VerifySecurityQuestionResp copy$default(VerifySecurityQuestionResp verifySecurityQuestionResp, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 9;
        component2 = i3 % 128;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            str = verifySecurityQuestionResp.verifyCode;
        }
        VerifySecurityQuestionResp verifySecurityQuestionRespCopy = verifySecurityQuestionResp.copy(str);
        int i4 = copydefault + 49;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return verifySecurityQuestionRespCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.verifyCode;
        }
        throw null;
    }

    public final VerifySecurityQuestionResp copy(String verifyCode) {
        int i = 2 % 2;
        VerifySecurityQuestionResp verifySecurityQuestionResp = new VerifySecurityQuestionResp(verifyCode);
        int i2 = copydefault + 111;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 88 / 0;
        }
        return verifySecurityQuestionResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (other instanceof VerifySecurityQuestionResp) {
            return !(Intrinsics.areEqual(this.verifyCode, ((VerifySecurityQuestionResp) other).verifyCode) ^ true);
        }
        int i5 = i3 + 77;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.verifyCode;
        if (str == null) {
            int i2 = copydefault + 15;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 % 4;
            }
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i4 = copydefault + 65;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifySecurityQuestionResp(verifyCode=" + this.verifyCode + ")";
        int i2 = copydefault + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
