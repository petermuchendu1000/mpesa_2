package com.huawei.digitalpayment.consumer.basicUi.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basicUi/request/SendMessageParams;", "Lcom/huawei/http/BaseRequestParams;", "receiverMsisdn", "", "<init>", "(Ljava/lang/String;)V", "getReceiverMsisdn", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerBasicUiModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SendMessageParams extends BaseRequestParams {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final String receiverMsisdn;

    public SendMessageParams(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.receiverMsisdn = str;
    }

    public final String getReceiverMsisdn() {
        int i = 2 % 2;
        int i2 = component1 + 13;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.receiverMsisdn;
        }
        throw null;
    }

    public static SendMessageParams copy$default(SendMessageParams sendMessageParams, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 73;
        component1 = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            str = sendMessageParams.receiverMsisdn;
            int i5 = i3 + 33;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
        return sendMessageParams.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.receiverMsisdn;
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        return str;
    }

    public final SendMessageParams copy(String receiverMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(receiverMsisdn, "");
        SendMessageParams sendMessageParams = new SendMessageParams(receiverMsisdn);
        int i2 = component1 + 79;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return sendMessageParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 85;
            copydefault = i2 % 128;
            return i2 % 2 != 0;
        }
        if (other instanceof SendMessageParams) {
            return Intrinsics.areEqual(this.receiverMsisdn, ((SendMessageParams) other).receiverMsisdn);
        }
        int i3 = component1 + 11;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            this.receiverMsisdn.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.receiverMsisdn.hashCode();
        int i3 = component1 + 81;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SendMessageParams(receiverMsisdn=" + this.receiverMsisdn + ")";
        int i2 = component1 + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
