package com.huawei.digitalpayment.consumer.profile.model.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/profile/model/request/SendChangeMsisdnSmsParams;", "Lcom/huawei/http/BaseRequestParams;", "initiatorMsisdn", "", "<init>", "(Ljava/lang/String;)V", "getInitiatorMsisdn", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerProfileModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SendChangeMsisdnSmsParams extends BaseRequestParams {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final String initiatorMsisdn;

    public SendChangeMsisdnSmsParams(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.initiatorMsisdn = str;
    }

    public final String getInitiatorMsisdn() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.initiatorMsisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static SendChangeMsisdnSmsParams copy$default(SendChangeMsisdnSmsParams sendChangeMsisdnSmsParams, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1 + 95;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            str = sendChangeMsisdnSmsParams.initiatorMsisdn;
            int i6 = i4 + 97;
            component1 = i6 % 128;
            int i7 = i6 % 2;
        }
        SendChangeMsisdnSmsParams sendChangeMsisdnSmsParamsCopy = sendChangeMsisdnSmsParams.copy(str);
        int i8 = ShareDataUIState + 117;
        component1 = i8 % 128;
        if (i8 % 2 != 0) {
            return sendChangeMsisdnSmsParamsCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 107;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            str = this.initiatorMsisdn;
            int i4 = 98 / 0;
        } else {
            str = this.initiatorMsisdn;
        }
        int i5 = i3 + 35;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return str;
    }

    public final SendChangeMsisdnSmsParams copy(String initiatorMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(initiatorMsisdn, "");
        SendChangeMsisdnSmsParams sendChangeMsisdnSmsParams = new SendChangeMsisdnSmsParams(initiatorMsisdn);
        int i2 = ShareDataUIState + 117;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 8 / 0;
        }
        return sendChangeMsisdnSmsParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendChangeMsisdnSmsParams)) {
            int i2 = component1 + 33;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.initiatorMsisdn, ((SendChangeMsisdnSmsParams) other).initiatorMsisdn)) {
            int i4 = ShareDataUIState + 115;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = ShareDataUIState + 23;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 16 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.initiatorMsisdn.hashCode();
        int i4 = component1 + 87;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SendChangeMsisdnSmsParams(initiatorMsisdn=" + this.initiatorMsisdn + ")";
        int i2 = ShareDataUIState + 105;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 26 / 0;
        }
        return str;
    }
}
