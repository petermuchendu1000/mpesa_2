package com.huawei.digitalpayment.consumer.base.resp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/ServiceResponse;", "", "ResponseBody", "Lcom/huawei/digitalpayment/consumer/base/resp/ResponseBody;", "ResponseHeader", "Lcom/huawei/digitalpayment/consumer/base/resp/ResponseHeader;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/resp/ResponseBody;Lcom/huawei/digitalpayment/consumer/base/resp/ResponseHeader;)V", "getResponseBody", "()Lcom/huawei/digitalpayment/consumer/base/resp/ResponseBody;", "getResponseHeader", "()Lcom/huawei/digitalpayment/consumer/base/resp/ResponseHeader;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ServiceResponse {
    private static int ShareDataUIState = 1;
    private static int component3;

    @SerializedName("ResponseBody")
    private final ResponseBody ResponseBody;

    @SerializedName("ResponseHeader")
    private final ResponseHeader ResponseHeader;

    public ServiceResponse(ResponseBody responseBody, ResponseHeader responseHeader) {
        Intrinsics.checkNotNullParameter(responseBody, "");
        Intrinsics.checkNotNullParameter(responseHeader, "");
        this.ResponseBody = responseBody;
        this.ResponseHeader = responseHeader;
    }

    public final ResponseBody getResponseBody() {
        ResponseBody responseBody;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 73;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            responseBody = this.ResponseBody;
            int i4 = 88 / 0;
        } else {
            responseBody = this.ResponseBody;
        }
        int i5 = i2 + 61;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return responseBody;
    }

    public final ResponseHeader getResponseHeader() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        ResponseHeader responseHeader = this.ResponseHeader;
        int i5 = i3 + 27;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return responseHeader;
    }

    public static ServiceResponse copy$default(ServiceResponse serviceResponse, ResponseBody responseBody, ResponseHeader responseHeader, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 55;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            responseBody = serviceResponse.ResponseBody;
        }
        if ((i & 2) != 0) {
            int i5 = i3 + 101;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                ResponseHeader responseHeader2 = serviceResponse.ResponseHeader;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            responseHeader = serviceResponse.ResponseHeader;
        }
        return serviceResponse.copy(responseBody, responseHeader);
    }

    public final ResponseBody component1() {
        int i = 2 % 2;
        int i2 = component3 + 85;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ResponseBody;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ResponseHeader component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        ResponseHeader responseHeader = this.ResponseHeader;
        int i4 = i3 + 83;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return responseHeader;
        }
        throw null;
    }

    public final ServiceResponse copy(ResponseBody ResponseBody, ResponseHeader ResponseHeader) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(ResponseBody, "");
        Intrinsics.checkNotNullParameter(ResponseHeader, "");
        ServiceResponse serviceResponse = new ServiceResponse(ResponseBody, ResponseHeader);
        int i2 = ShareDataUIState + 85;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return serviceResponse;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 53;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceResponse)) {
            int i5 = i2 + 103;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ResponseBody, ((ServiceResponse) other).ResponseBody)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.ResponseHeader, r6.ResponseHeader))) {
            return true;
        }
        int i7 = component3 + 7;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component3 = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.ResponseBody.hashCode() >>> 19) / this.ResponseHeader.hashCode() : (this.ResponseBody.hashCode() * 31) + this.ResponseHeader.hashCode();
        int i3 = component3 + 69;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ServiceResponse(ResponseBody=" + this.ResponseBody + ", ResponseHeader=" + this.ResponseHeader + ")";
        int i2 = ShareDataUIState + 89;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
