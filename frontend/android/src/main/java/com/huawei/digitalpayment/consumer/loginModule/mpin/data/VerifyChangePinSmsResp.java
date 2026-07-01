package com.huawei.digitalpayment.consumer.loginModule.mpin.data;

import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/VerifyChangePinSmsResp;", "Lcom/huawei/http/BaseResp;", "token", "", "verifyTypes", "", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/VerifyType;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getToken", "()Ljava/lang/String;", "getVerifyTypes", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifyChangePinSmsResp extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final String token;
    private final List<VerifyType> verifyTypes;

    public final String getToken() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.token;
        int i4 = i3 + 1;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<VerifyType> getVerifyTypes() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        List<VerifyType> list = this.verifyTypes;
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        return list;
    }

    public VerifyChangePinSmsResp(String str, List<VerifyType> list) {
        this.token = str;
        this.verifyTypes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static VerifyChangePinSmsResp copy$default(VerifyChangePinSmsResp verifyChangePinSmsResp, String str, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 45;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                String str2 = verifyChangePinSmsResp.token;
                throw null;
            }
            str = verifyChangePinSmsResp.token;
        }
        if ((i & 2) != 0) {
            list = verifyChangePinSmsResp.verifyTypes;
            int i4 = ShareDataUIState + 83;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
        return verifyChangePinSmsResp.copy(str, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.token;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<VerifyType> component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 21;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<VerifyType> list = this.verifyTypes;
        int i5 = i2 + 115;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final VerifyChangePinSmsResp copy(String token, List<VerifyType> verifyTypes) {
        int i = 2 % 2;
        VerifyChangePinSmsResp verifyChangePinSmsResp = new VerifyChangePinSmsResp(token, verifyTypes);
        int i2 = component2 + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return verifyChangePinSmsResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 87;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (other instanceof VerifyChangePinSmsResp) {
            VerifyChangePinSmsResp verifyChangePinSmsResp = (VerifyChangePinSmsResp) other;
            return Intrinsics.areEqual(this.token, verifyChangePinSmsResp.token) && Intrinsics.areEqual(this.verifyTypes, verifyChangePinSmsResp.verifyTypes);
        }
        int i5 = i2 + 121;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i2 + 43;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 37;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.token;
        if (str == null) {
            int i5 = i2 + 69;
            ShareDataUIState = i5 % 128;
            iHashCode = i5 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        List<VerifyType> list = this.verifyTypes;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifyChangePinSmsResp(token=" + this.token + ", verifyTypes=" + this.verifyTypes + ")";
        int i2 = ShareDataUIState + 87;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 85 / 0;
        }
        return str;
    }
}
