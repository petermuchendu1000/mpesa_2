package com.huawei.digitalpayment.consumer.qrcode.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/qrcode/request/EnablePaymentCodeRequest;", "Lcom/huawei/http/BaseRequestParams;", "codeId", "", "<init>", "(Ljava/lang/String;)V", "getCodeId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CustomerQRCodeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EnablePaymentCodeRequest extends BaseRequestParams {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final String codeId;

    public final String getCodeId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 69;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.codeId;
        int i4 = i2 + 31;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public EnablePaymentCodeRequest(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.codeId = str;
    }

    public static EnablePaymentCodeRequest copy$default(EnablePaymentCodeRequest enablePaymentCodeRequest, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 15;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 87;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                String str2 = enablePaymentCodeRequest.codeId;
                throw null;
            }
            str = enablePaymentCodeRequest.codeId;
        }
        return enablePaymentCodeRequest.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.codeId;
        }
        throw null;
    }

    public final EnablePaymentCodeRequest copy(String codeId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(codeId, "");
        EnablePaymentCodeRequest enablePaymentCodeRequest = new EnablePaymentCodeRequest(codeId);
        int i2 = ShareDataUIState + 125;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return enablePaymentCodeRequest;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 69;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        if (this == other) {
            int i6 = i2 + 71;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (other instanceof EnablePaymentCodeRequest) {
            return !(Intrinsics.areEqual(this.codeId, ((EnablePaymentCodeRequest) other).codeId) ^ true);
        }
        int i8 = i4 + 93;
        component1 = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            this.codeId.hashCode();
            throw null;
        }
        int iHashCode = this.codeId.hashCode();
        int i3 = component1 + 53;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EnablePaymentCodeRequest(codeId=" + this.codeId + ")";
        int i2 = ShareDataUIState + 55;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
