package com.huawei.digitalpayment.consumer.base.resp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/FulizaServiceReponse;", "", "ServiceResponse", "Lcom/huawei/digitalpayment/consumer/base/resp/ServiceResponse;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/resp/ServiceResponse;)V", "getServiceResponse", "()Lcom/huawei/digitalpayment/consumer/base/resp/ServiceResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FulizaServiceReponse {
    private static int component1 = 0;
    private static int component2 = 1;

    @SerializedName("ServiceResponse")
    private final ServiceResponse ServiceResponse;

    public FulizaServiceReponse(ServiceResponse serviceResponse) {
        Intrinsics.checkNotNullParameter(serviceResponse, "");
        this.ServiceResponse = serviceResponse;
    }

    public final ServiceResponse getServiceResponse() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        ServiceResponse serviceResponse = this.ServiceResponse;
        int i5 = i3 + 49;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return serviceResponse;
    }

    public static FulizaServiceReponse copy$default(FulizaServiceReponse fulizaServiceReponse, ServiceResponse serviceResponse, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 61;
        int i4 = i3 % 128;
        component2 = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            serviceResponse = fulizaServiceReponse.ServiceResponse;
            int i5 = i4 + 15;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 3;
            }
        }
        return fulizaServiceReponse.copy(serviceResponse);
    }

    public final ServiceResponse component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 125;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        ServiceResponse serviceResponse = this.ServiceResponse;
        int i5 = i2 + 81;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return serviceResponse;
    }

    public final FulizaServiceReponse copy(ServiceResponse ServiceResponse) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(ServiceResponse, "");
        FulizaServiceReponse fulizaServiceReponse = new FulizaServiceReponse(ServiceResponse);
        int i2 = component1 + 81;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 68 / 0;
        }
        return fulizaServiceReponse;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 13;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof FulizaServiceReponse)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ServiceResponse, ((FulizaServiceReponse) other).ServiceResponse)) {
            int i4 = component1 + 77;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = component2 + 9;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 105;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            this.ServiceResponse.hashCode();
            throw null;
        }
        int iHashCode = this.ServiceResponse.hashCode();
        int i3 = component2 + 35;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FulizaServiceReponse(ServiceResponse=" + this.ServiceResponse + ")";
        int i2 = component1 + 117;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
