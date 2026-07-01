package com.huawei.digitalpayment.consumer.base.resp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/ResponseBody;", "", "Body", "Lcom/huawei/digitalpayment/consumer/base/resp/Body;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/resp/Body;)V", "getBody", "()Lcom/huawei/digitalpayment/consumer/base/resp/Body;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResponseBody {
    private static int component2 = 0;
    private static int component3 = 1;

    @SerializedName("Body")
    private final Body Body;

    public ResponseBody(Body body) {
        Intrinsics.checkNotNullParameter(body, "");
        this.Body = body;
    }

    public final Body getBody() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Body body = this.Body;
        if (i3 != 0) {
            int i4 = 71 / 0;
        }
        return body;
    }

    public static ResponseBody copy$default(ResponseBody responseBody, Body body, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 125;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            body = responseBody.Body;
        }
        ResponseBody responseBodyCopy = responseBody.copy(body);
        int i5 = component2 + 49;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return responseBodyCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final Body component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 29;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Body body = this.Body;
        int i5 = i2 + 101;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return body;
    }

    public final ResponseBody copy(Body Body) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(Body, "");
        ResponseBody responseBody = new ResponseBody(Body);
        int i2 = component2 + 117;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return responseBody;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 53;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseBody)) {
            int i5 = i2 + 105;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.Body, ((ResponseBody) other).Body)) {
            return false;
        }
        int i7 = component2 + 117;
        component3 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 96 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.Body.hashCode();
        int i4 = component3 + 109;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ResponseBody(Body=" + this.Body + ")";
        int i2 = component2 + 47;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
