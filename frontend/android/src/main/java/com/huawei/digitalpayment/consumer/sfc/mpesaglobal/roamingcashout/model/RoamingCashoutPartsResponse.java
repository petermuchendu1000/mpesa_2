package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.permission.PermissionConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutPartsResponse;", "Landroid/os/Parcelable;", "paymentMethod", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutPaymentMethod;", PermissionConstant.ACTION_REQUEST, "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutRequest;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutPaymentMethod;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutRequest;)V", "getPaymentMethod", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutPaymentMethod;", "getRequest", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutRequest;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoamingCashoutPartsResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RoamingCashoutPartsResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;
    private final RoamingCashoutPaymentMethod paymentMethod;
    private final RoamingCashoutRequest request;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RoamingCashoutPartsResponse> {
        private static int ShareDataUIState = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutPartsResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RoamingCashoutPartsResponse roamingCashoutPartsResponse = new RoamingCashoutPartsResponse(RoamingCashoutPaymentMethod.CREATOR.createFromParcel(parcel), RoamingCashoutRequest.CREATOR.createFromParcel(parcel));
            int i2 = component3 + 41;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 95 / 0;
            }
            return roamingCashoutPartsResponse;
        }

        @Override
        public RoamingCashoutPartsResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 59;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutPartsResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 85;
            component3 = i3 % 128;
            RoamingCashoutPartsResponse[] roamingCashoutPartsResponseArr = new RoamingCashoutPartsResponse[i];
            if (i3 % 2 != 0) {
                int i4 = 85 / 0;
            }
            return roamingCashoutPartsResponseArr;
        }

        @Override
        public RoamingCashoutPartsResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 83;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            RoamingCashoutPartsResponse[] roamingCashoutPartsResponseArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 19;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return roamingCashoutPartsResponseArrNewArray;
        }
    }

    public RoamingCashoutPartsResponse(RoamingCashoutPaymentMethod roamingCashoutPaymentMethod, RoamingCashoutRequest roamingCashoutRequest) {
        Intrinsics.checkNotNullParameter(roamingCashoutPaymentMethod, "");
        Intrinsics.checkNotNullParameter(roamingCashoutRequest, "");
        this.paymentMethod = roamingCashoutPaymentMethod;
        this.request = roamingCashoutRequest;
    }

    public final RoamingCashoutPaymentMethod getPaymentMethod() {
        RoamingCashoutPaymentMethod roamingCashoutPaymentMethod;
        int i = 2 % 2;
        int i2 = copydefault + 23;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            roamingCashoutPaymentMethod = this.paymentMethod;
            int i4 = 70 / 0;
        } else {
            roamingCashoutPaymentMethod = this.paymentMethod;
        }
        int i5 = i3 + 89;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return roamingCashoutPaymentMethod;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RoamingCashoutRequest getRequest() {
        int i = 2 % 2;
        int i2 = component1 + 99;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.request;
        }
        throw null;
    }

    static {
        int i = component2 + 45;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static RoamingCashoutPartsResponse copy$default(RoamingCashoutPartsResponse roamingCashoutPartsResponse, RoamingCashoutPaymentMethod roamingCashoutPaymentMethod, RoamingCashoutRequest roamingCashoutRequest, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 65;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            roamingCashoutPaymentMethod = roamingCashoutPartsResponse.paymentMethod;
        }
        if ((i & 2) != 0) {
            roamingCashoutRequest = roamingCashoutPartsResponse.request;
        }
        RoamingCashoutPartsResponse roamingCashoutPartsResponseCopy = roamingCashoutPartsResponse.copy(roamingCashoutPaymentMethod, roamingCashoutRequest);
        int i5 = copydefault + 25;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return roamingCashoutPartsResponseCopy;
        }
        throw null;
    }

    public final RoamingCashoutPaymentMethod component1() {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        RoamingCashoutPaymentMethod roamingCashoutPaymentMethod = this.paymentMethod;
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        return roamingCashoutPaymentMethod;
    }

    public final RoamingCashoutRequest component2() {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        RoamingCashoutRequest roamingCashoutRequest = this.request;
        int i5 = i3 + 105;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return roamingCashoutRequest;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RoamingCashoutPartsResponse copy(RoamingCashoutPaymentMethod paymentMethod, RoamingCashoutRequest request) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        Intrinsics.checkNotNullParameter(request, "");
        RoamingCashoutPartsResponse roamingCashoutPartsResponse = new RoamingCashoutPartsResponse(paymentMethod, request);
        int i2 = component1 + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return roamingCashoutPartsResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 97;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 45;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoamingCashoutPartsResponse)) {
            return false;
        }
        RoamingCashoutPartsResponse roamingCashoutPartsResponse = (RoamingCashoutPartsResponse) other;
        if (!Intrinsics.areEqual(this.paymentMethod, roamingCashoutPartsResponse.paymentMethod)) {
            int i2 = component1 + 83;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.request, roamingCashoutPartsResponse.request)) {
            return true;
        }
        int i4 = copydefault + 99;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.paymentMethod.hashCode() * 31) + this.request.hashCode();
        int i4 = copydefault + 117;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RoamingCashoutPartsResponse(paymentMethod=" + this.paymentMethod + ", request=" + this.request + ')';
        int i2 = copydefault + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        this.paymentMethod.writeToParcel(dest, flags);
        this.request.writeToParcel(dest, flags);
        int i4 = component1 + 41;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
