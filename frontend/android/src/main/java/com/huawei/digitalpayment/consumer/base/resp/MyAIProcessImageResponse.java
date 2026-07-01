package com.huawei.digitalpayment.consumer.base.resp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/MyAIProcessImageResponse;", "", "data", "Lcom/huawei/digitalpayment/consumer/base/resp/MyData;", "requestId", "", "status", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/resp/MyData;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Lcom/huawei/digitalpayment/consumer/base/resp/MyData;", "getRequestId", "()Ljava/lang/String;", "getStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MyAIProcessImageResponse {
    private static int component1 = 1;
    private static int component3;

    @SerializedName("data")
    private final MyData data;
    private final String requestId;
    private final String status;

    public MyAIProcessImageResponse(MyData myData, String str, String str2) {
        Intrinsics.checkNotNullParameter(myData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.data = myData;
        this.requestId = str;
        this.status = str2;
    }

    public final MyData getData() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.data;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getRequestId() {
        int i = 2 % 2;
        int i2 = component1 + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.requestId;
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return str;
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 3;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.status;
        int i5 = i2 + 85;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MyAIProcessImageResponse copy$default(MyAIProcessImageResponse myAIProcessImageResponse, MyData myData, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 107;
        int i4 = i3 % 128;
        component3 = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            myData = myAIProcessImageResponse.data;
        }
        if ((i & 2) != 0) {
            str = myAIProcessImageResponse.requestId;
        }
        if ((i & 4) != 0) {
            int i5 = i4 + 27;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str2 = myAIProcessImageResponse.status;
            if (i6 == 0) {
                int i7 = 71 / 0;
            }
        }
        MyAIProcessImageResponse myAIProcessImageResponseCopy = myAIProcessImageResponse.copy(myData, str, str2);
        int i8 = component3 + 87;
        component1 = i8 % 128;
        int i9 = i8 % 2;
        return myAIProcessImageResponseCopy;
    }

    public final MyData component1() {
        int i = 2 % 2;
        int i2 = component1 + 69;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.data;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.requestId;
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 81;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.status;
        }
        throw null;
    }

    public final MyAIProcessImageResponse copy(MyData data, String requestId, String status) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(data, "");
        Intrinsics.checkNotNullParameter(requestId, "");
        Intrinsics.checkNotNullParameter(status, "");
        MyAIProcessImageResponse myAIProcessImageResponse = new MyAIProcessImageResponse(data, requestId, status);
        int i2 = component1 + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return myAIProcessImageResponse;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyAIProcessImageResponse)) {
            return false;
        }
        MyAIProcessImageResponse myAIProcessImageResponse = (MyAIProcessImageResponse) other;
        if (!Intrinsics.areEqual(this.data, myAIProcessImageResponse.data)) {
            int i2 = component3 + 29;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.requestId, myAIProcessImageResponse.requestId)) {
            return false;
        }
        if (Intrinsics.areEqual(this.status, myAIProcessImageResponse.status)) {
            return true;
        }
        int i4 = component1 + 87;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.data.hashCode();
        return i3 == 0 ? ((iHashCode - 39) >>> this.requestId.hashCode()) >> this.status.hashCode() : (((iHashCode * 31) + this.requestId.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MyAIProcessImageResponse(data=" + this.data + ", requestId=" + this.requestId + ", status=" + this.status + ")";
        int i2 = component3 + 83;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
