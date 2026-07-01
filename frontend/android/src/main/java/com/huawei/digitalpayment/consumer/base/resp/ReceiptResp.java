package com.huawei.digitalpayment.consumer.base.resp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/ReceiptResp;", "", "AiProcessImageResponse", "Lcom/huawei/digitalpayment/consumer/base/resp/MyAIProcessImageResponse;", "globalStatus", "", "requestId", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/resp/MyAIProcessImageResponse;Ljava/lang/String;Ljava/lang/String;)V", "getAiProcessImageResponse", "()Lcom/huawei/digitalpayment/consumer/base/resp/MyAIProcessImageResponse;", "getGlobalStatus", "()Ljava/lang/String;", "getRequestId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReceiptResp {
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("AIProcessImageResponse")
    private final MyAIProcessImageResponse AiProcessImageResponse;
    private final String globalStatus;
    private final String requestId;

    public ReceiptResp(MyAIProcessImageResponse myAIProcessImageResponse, String str, String str2) {
        Intrinsics.checkNotNullParameter(myAIProcessImageResponse, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AiProcessImageResponse = myAIProcessImageResponse;
        this.globalStatus = str;
        this.requestId = str2;
    }

    public final MyAIProcessImageResponse getAiProcessImageResponse() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 39;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        MyAIProcessImageResponse myAIProcessImageResponse = this.AiProcessImageResponse;
        int i5 = i2 + 95;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
        return myAIProcessImageResponse;
    }

    public final String getGlobalStatus() {
        int i = 2 % 2;
        int i2 = component2 + 3;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.globalStatus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getRequestId() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 67;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            str = this.requestId;
            int i4 = 13 / 0;
        } else {
            str = this.requestId;
        }
        int i5 = i3 + 39;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ReceiptResp copy$default(ReceiptResp receiptResp, MyAIProcessImageResponse myAIProcessImageResponse, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 121;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 103;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            myAIProcessImageResponse = receiptResp.AiProcessImageResponse;
            if (i7 != 0) {
                int i8 = 63 / 0;
            }
        }
        if ((i & 2) != 0) {
            int i9 = copydefault + 83;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            str = receiptResp.globalStatus;
        }
        if ((i & 4) != 0) {
            str2 = receiptResp.requestId;
        }
        return receiptResp.copy(myAIProcessImageResponse, str, str2);
    }

    public final MyAIProcessImageResponse component1() {
        MyAIProcessImageResponse myAIProcessImageResponse;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 25;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            myAIProcessImageResponse = this.AiProcessImageResponse;
            int i4 = 12 / 0;
        } else {
            myAIProcessImageResponse = this.AiProcessImageResponse;
        }
        int i5 = i2 + 81;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return myAIProcessImageResponse;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 71;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.globalStatus;
        int i5 = i2 + 25;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 43;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.requestId;
        int i5 = i2 + 99;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ReceiptResp copy(MyAIProcessImageResponse AiProcessImageResponse, String globalStatus, String requestId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(AiProcessImageResponse, "");
        Intrinsics.checkNotNullParameter(globalStatus, "");
        Intrinsics.checkNotNullParameter(requestId, "");
        ReceiptResp receiptResp = new ReceiptResp(AiProcessImageResponse, globalStatus, requestId);
        int i2 = component2 + 33;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return receiptResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 47;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof ReceiptResp)) {
            return false;
        }
        ReceiptResp receiptResp = (ReceiptResp) other;
        if (!Intrinsics.areEqual(this.AiProcessImageResponse, receiptResp.AiProcessImageResponse)) {
            int i4 = copydefault + 71;
            component2 = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.globalStatus, receiptResp.globalStatus)) {
            int i5 = copydefault + 73;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.requestId, receiptResp.requestId)) {
            return true;
        }
        int i7 = copydefault + 99;
        int i8 = i7 % 128;
        component2 = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 43;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.AiProcessImageResponse.hashCode();
        return i3 == 0 ? ((iHashCode + 126) - this.globalStatus.hashCode()) << this.requestId.hashCode() : (((iHashCode * 31) + this.globalStatus.hashCode()) * 31) + this.requestId.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ReceiptResp(AiProcessImageResponse=" + this.AiProcessImageResponse + ", globalStatus=" + this.globalStatus + ", requestId=" + this.requestId + ")";
        int i2 = copydefault + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
