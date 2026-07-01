package com.huawei.digitalpayment.consumer.loginModule.mpin.data;

import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/VerifyForgotPinSmsResp;", "Lcom/huawei/http/BaseResp;", "token", "", "verifyTypes", "", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/VerifyType;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getToken", "()Ljava/lang/String;", "getVerifyTypes", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifyForgotPinSmsResp extends BaseResp {
    private static int component2 = 0;
    private static int component3 = 1;
    private final String token;
    private final List<VerifyType> verifyTypes;

    public final String getToken() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.token;
        int i5 = i3 + 25;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<VerifyType> getVerifyTypes() {
        List<VerifyType> list;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 125;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            list = this.verifyTypes;
            int i4 = 33 / 0;
        } else {
            list = this.verifyTypes;
        }
        int i5 = i2 + 13;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public VerifyForgotPinSmsResp(String str, List<VerifyType> list) {
        this.token = str;
        this.verifyTypes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static VerifyForgotPinSmsResp copy$default(VerifyForgotPinSmsResp verifyForgotPinSmsResp, String str, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 75;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 45;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            str = verifyForgotPinSmsResp.token;
        }
        if ((i & 2) != 0) {
            int i8 = i3 + 35;
            component2 = i8 % 128;
            if (i8 % 2 != 0) {
                List<VerifyType> list2 = verifyForgotPinSmsResp.verifyTypes;
                throw null;
            }
            list = verifyForgotPinSmsResp.verifyTypes;
        }
        return verifyForgotPinSmsResp.copy(str, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 33;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.token;
        int i5 = i2 + 39;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<VerifyType> component2() {
        int i = 2 % 2;
        int i2 = component3 + 5;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.verifyTypes;
        }
        throw null;
    }

    public final VerifyForgotPinSmsResp copy(String token, List<VerifyType> verifyTypes) {
        int i = 2 % 2;
        VerifyForgotPinSmsResp verifyForgotPinSmsResp = new VerifyForgotPinSmsResp(token, verifyTypes);
        int i2 = component3 + 15;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return verifyForgotPinSmsResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 121;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyForgotPinSmsResp)) {
            return false;
        }
        VerifyForgotPinSmsResp verifyForgotPinSmsResp = (VerifyForgotPinSmsResp) other;
        if (Intrinsics.areEqual(this.token, verifyForgotPinSmsResp.token)) {
            return Intrinsics.areEqual(this.verifyTypes, verifyForgotPinSmsResp.verifyTypes);
        }
        int i3 = component3 + 49;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.token;
        int iHashCode2 = 0;
        if (str == null) {
            int i2 = component3 + 71;
            component2 = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        List<VerifyType> list = this.verifyTypes;
        if (list == null) {
            int i3 = component3 + 107;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 3;
            }
        } else {
            iHashCode2 = list.hashCode();
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifyForgotPinSmsResp(token=" + this.token + ", verifyTypes=" + this.verifyTypes + ")";
        int i2 = component2 + 47;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
